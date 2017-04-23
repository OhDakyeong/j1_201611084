package headfirst.decorator.starbuzz;

public class StarBuzzCoffee {
  public static void main(String args[]) {
    Beverage beverage1 = new Espresso;
    System.out.println(beverage.getDescription()+" $"+beverage.cost());
    
    Beverage beverage2 = new DarkRoast();
    beverage2 = new Mocha(beverage2);
    beverage2 = new Mocha(beverage2);
  }
}