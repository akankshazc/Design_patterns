package hf_2.weather;

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}