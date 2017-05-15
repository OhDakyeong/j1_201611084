package headfirst.singleton.stat;
 
public class Singleton {
  //public static Singleton uniqueInstance;
  private static Singleton uniqueInstance=new Singleton();
  private static int numCalled=0;
  
  private Singleton() {
  }
  
  public static Singleton getInstance() {
    //if (uniqueInstance == null) {
    //  System.out.println("Creating unique instance of Chocolate Boiler");
    //  uniqueInstance = new Singleton();
    }
    System.out.println("Returning ....");
    System.out.println("numCalled ... "+numCalled++);
    return uniqueInstance;
  }
}