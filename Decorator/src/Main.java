public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Pizza pizza = new Olive(new Tomato(new Mozzarella(new PlainPizza())));


        System.out.println("Pizza description : " + pizza.getDescription());
        System.out.println("Pizza cost : " + pizza.getCost());

    }
}