public class Olive extends PizzaDecorator{
    public Olive(Pizza newPizza) {
        super(newPizza);
    }

    public String getDescription() {
        return tempPizza.getDescription() + " , Adding Olive";
    }


    public Double getCost() {
        return tempPizza.getCost() + 5.00;
    }
}
