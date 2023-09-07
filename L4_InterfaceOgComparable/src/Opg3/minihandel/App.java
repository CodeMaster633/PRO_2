package Opg3.minihandel;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Product p1 = new Product(1,"Cola",20.95);
        Product p2 = new Product(2,"Pepsi",19.95);
        Product p3 = new Product(3,"Pizza",79.95);
        Product p4 = new Product(4,"Bowl",39.95);
        Product p5 = new Product(5,"Salat",24.95);

        Customer c1 = new Customer("Benjamin", LocalDate.of(2010, 10, 10));
        Customer c2 = new Customer("Malte", LocalDate.of(1990, 02, 02));

        Order o1 = new Order(1);
        Order o2 = new Order(2);
        Order o3 = new Order(3);
        Order o4 = new Order(4);
        Order o5 = new Order(5);
        Order o6 = new Order(6);

        o1.createOrderLine(2,p1);
        o1.createOrderLine(2,p3);
        o2.createOrderLine(2,p5);
        o2.createOrderLine(2,p5);
        o3.createOrderLine(2,p4);
        o3.createOrderLine(2,p2);
        o4.createOrderLine(2,p1);
        o4.createOrderLine(2,p3);
        o5.createOrderLine(2,p4);
        o5.createOrderLine(2,p5);
        o6.createOrderLine(2,p2);
        o6.createOrderLine(10,p3);

        c1.addOrder(o1);
        c1.addOrder(o2);
        c2.addOrder(o3);
        c2.addOrder(o4);
        c2.addOrder(o5);
        c2.addOrder(o6);

        System.out.println(c1.totalPrice());
        System.out.println(c2.totalPrice());

        PercentDiscount d1 = new PercentDiscount(15);
        FixedDiscount d2 = new FixedDiscount(250,1000);
        AgeDiscount d3 = new AgeDiscount(c2);

        c1.setDiscount(d1);
        c2.setDiscount(d2);

        System.out.println(c1.totalBuyWithDiscount(c1.totalPrice()));
        System.out.println(c2.totalBuyWithDiscount(c2.totalPrice()));

        c2.setDiscount(d3);
        System.out.println();
        System.out.println(c2);
        System.out.println(c2.totalPrice());
        System.out.println(c2.totalBuyWithDiscount(c2.totalPrice()));
    }
}
