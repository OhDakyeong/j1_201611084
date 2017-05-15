package headfirst.singleton.threadsafe;
 
public class Singleton {
  private static Singleton uniqueInstance;
  //private static Singleton uniqueInstance=new Singleton();
  private static int numCalled=0;
  
  private Singleton() {
  }
  
  public static synchronized Singleton getInstance() {
    if (uniqueInstance == null) {
      synchronized(Singleton.class){;
      System.out.println("Creating... ");
      uniqueInstance = new Singleton();
    }
    System.out.println("Returning ....");
    System.out.println("numCalled ... "+numCalled++);
    return uniqueInstance;
  }
}