public class Tomato extends PizzaDecorator{
    public Tomato(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Tomato");
    }

    public String getDescription() {
        return tempPizza.getDescription() + " , Tomato";
    }


    public Double getCost() {
        return tempPizza.getCost()+ 5.00;
    }
}
