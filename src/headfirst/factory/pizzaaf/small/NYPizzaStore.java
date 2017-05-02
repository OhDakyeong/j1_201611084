package headfirst.factory.pizzaaf.small;

public class NYPizzaStore extends PizzaStore {
  Pizza createPizza(String type) {
    Pizza pizza=null;
    PizzaIngredientFactory inFac=new NYPizzaIngredientFactory();
    if(type.equals("cheese")) {
      //pizza=new NYStyleCheesePizza();
      pizza=new CheesePizza(inFac); //REMEMBER!!!POINT!!
    }
    return pizza;
  } 
}