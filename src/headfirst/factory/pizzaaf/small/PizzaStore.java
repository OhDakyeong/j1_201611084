package headfirst.factory.pizzaaf.small;

public abstract class PizzaStore {  //abstract´Â °´Ã¼ »ý¼º¾ÈµÊ
  abstract Pizza createPizza(String item);
  public Pizza orderPizza(String type) {
    Pizza pizza;
    //pizza=f.createPizza(type);
    pizza=createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
}