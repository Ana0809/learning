package customers;

public class Stoc {
    void produsePeStoc() {
        Cart cart = new Cart();
        Product product1 = new Product();
        product1.setType("haine");
        product1.setName("rochie");
        product1.setId(111);
        product1.setPrice(90);
        product1.setColor("rosu");
        cart.addProduct(product1);
        Product product2 = new Product();
        product2.setColor("galben");
        product2.setPrice(8);
        product2.setName("banane");
        product2.setId(112);
        product2.setType("alimente");
        cart.addProduct(product2);
        Product product3 = new Product();
        product3.setType("electrocasnice");
        product3.setId(113);
        product3.setPrice(80);
        product3.setName("mixer");
        product3.setColor("alb");
        cart.addProduct(product3);
    }
}
