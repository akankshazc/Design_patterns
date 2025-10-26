package hf_2.weather;

public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
