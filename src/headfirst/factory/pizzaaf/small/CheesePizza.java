package headfirst.factory.pizzaaf.small;


//public class NYStyleCheesePizza extends Pizza {
public class CheesePizza extends Pizza {  
  PizzaIngredientFactory inFac;
  //public NYStyleCheesePizza() {
  public CheesePizza(PizzaIngredientFactory ingredientFac) {
    name="Abstract Cheese Pizza";
    this.inFac=ingredientFac;
    //dough="Thin Crust";
    //sauce="Marinara Pizza Sauce";
    //toppings.add("Grated Reggiano Cheese");
  }
  public void prepare() {
    System.out.println("preparing...");
    dough=inFac.createDough();
    cheese=inFac.createCheese();
  }
}
