package headfirst.observer.weather;

public class StaticsDisplay implements Observer, DisplayElement {
  private float maxTemp=0.0f;
  private float minTemp=200;
  private float tempSum=0.0f;
  private int numReadings;
  private WeatherData weatherData;
  
  public StaticsDisplay(WeatherData weatherData) {
    this.weatherData=weatherData;
    weatherData.registerObserver(this);
  }
  
  public void update(float temp,float humidity,float pressure) {
    tempSum+=temp;
    numReadings++;
  
    if(temp>maxTemp){
      maxTemp=temp;
    }
    if(temp<minTemp){
      minTemp=temp;
    }
    display();
  }

  public void display() {
    System.out.println("Average : "+(tempSum/numReadings));
    System.out.println("Max : "+maxTemp);
    System.out.println("Min : "+minTemp);
  }
}
