public class Mozzarella extends PizzaDecorator{
    public Mozzarella(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Mozzarella");
    }

    public String getDescription() {
        return tempPizza.getDescription() + " , Mozzarella";
    }


    public Double getCost() {
        return tempPizza.getCost() + 10.00;
    }
}
