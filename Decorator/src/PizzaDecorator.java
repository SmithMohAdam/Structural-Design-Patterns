public abstract class PizzaDecorator implements Pizza{
    protected Pizza tempPizza;
    public PizzaDecorator(Pizza newPizza){
        tempPizza =  newPizza;
    }

    public String getDescription() {
        return tempPizza.getDescription();
    }

    public Double getCost() {
        return tempPizza.getCost();
    }
}
