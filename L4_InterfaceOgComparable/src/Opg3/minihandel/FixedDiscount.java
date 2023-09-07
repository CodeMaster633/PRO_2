package Opg3.minihandel;

public class FixedDiscount implements Discount{
    public double fixedDiscount;
    public int discountLimit;

    public FixedDiscount(int fixedDiscount,int discountLimit) {
        super();
        this.fixedDiscount=fixedDiscount;
        this.discountLimit=discountLimit;

    }

    public double getDiscount(double price){
        double result = 0;
        if(price>discountLimit){
            result=price-fixedDiscount;
        }
        return result;}
    public int discountLimit(){return discountLimit;} 


}
