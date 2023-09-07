package Opg3.minihandel;

public class AgeDiscount implements Discount{

    public Customer customer;

    public AgeDiscount(Customer customer) {
        super();
        this.customer = customer;
    }

    public double getDiscount(double price){
        double age =-customer.getAge();
        return price* (1-age/100);
    }

    @Override
    public String toString() {
        return "" + getDiscount(customer.totalPrice());
    }
}

