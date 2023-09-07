package Opg3.minihandel;

public class PercentDiscount implements Discount{
    public double discountPercentage;
    public PercentDiscount(double discountPercentage) {
        super();
        this.discountPercentage=discountPercentage;
    }

    public double getDiscount(double price){
        return price-(discountPercentage/100)*price;
    }

}
