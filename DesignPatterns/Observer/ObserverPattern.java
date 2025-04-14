package DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(float temperature);
}
interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
class WeatherStation implements Subject {
    private List<Observer>observers=new ArrayList<>();
    private float temperature;

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o:observers){
            o.update(temperature);
        }
    }
}
class TemperatureDisplay implements Observer {

    @Override
    public void update(float temperature) {
        System.out.println("Temperature Updated: "+temperature);
    }
}
public class ObserverPattern {
    public static void main(String[] args){
        WeatherStation weatherStation=new WeatherStation();
        TemperatureDisplay display1=new TemperatureDisplay();
        TemperatureDisplay display2=new TemperatureDisplay();
        weatherStation.registerObserver(display1);
        weatherStation.registerObserver(display2);
        weatherStation.setTemperature(25.7f);
    }
}
