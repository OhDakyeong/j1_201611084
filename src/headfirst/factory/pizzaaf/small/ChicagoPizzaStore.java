package headfirst.factory.pizzaaf.small;

public class ChicagoPizzaStore extends PizzaStore {
  Pizza createPizza(String type) {
    Pizza pizza=null;
    PizzaIngredientFactory inFac=new ChicagoPizzaIngredientFactory();
    if(type.equals("cheese")) {
      pizza=new CheesePizza(inFac);
    }
    return pizza;
  } 
}