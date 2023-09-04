package MiniOrderSystem.minihandel;

public class PercentDiscount extends Discount{
    public double discountPercentage;
    public PercentDiscount(double discountPercentage) {
        super();
        this.discountPercentage=discountPercentage;
    }

    public double getDiscount(int price){
        return price-(discountPercentage/100)*price;
    }

}
