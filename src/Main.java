public class Main {
    public static void main(String[] args) {
        IPizza pizza1 = new Mushrooms(new Mushrooms(new TomatoSauce(new Gouda(new Pepperoni(new ThickCrust())))));
        System.out.println(pizza1.getDescription());
        System.out.println(pizza1.getCost());

        IPizza pizza2 = new Onions(new Mushrooms(new PestoSauce(new AlfredoSauce(new PlainPizza()))));
        System.out.println(pizza2.getDescription());
        System.out.println(pizza2.getCost());

        IPizza pizza3 = new Gouda(new PestoSauce(new Lettuce(new CrustlessPizza())));
        System.out.println(pizza3.getDescription());
        System.out.println(pizza3.getCost());


    }
}