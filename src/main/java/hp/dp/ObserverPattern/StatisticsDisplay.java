package hp.dp.ObserverPattern;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    private float maxTemperature = Float.MIN_VALUE;
    private float minTemperature = Float.MAX_VALUE;
    private float sumTemperature = 0;
    private int numReadings = 0;


    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Avg/Max/Min Temperature = " + (sumTemperature / numReadings) + "/" + maxTemperature + "/" + minTemperature);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        // 갱신된 온도 데이터를 이용해 평균, 최대, 최소를 계산합니다.
        sumTemperature += temp;
        numReadings++;
        maxTemperature = Math.max(maxTemperature, temp);
        minTemperature = Math.min(minTemperature, temp);

        display();
    }
}
