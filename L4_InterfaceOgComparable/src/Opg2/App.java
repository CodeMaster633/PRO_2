package Opg2;

public class App {
    public static void main(String[] args) {
        Customer c1 = new Customer("Benjamin","Gregersen",25);
        Customer c2 = new Customer("August","Gregersen",29);
        Customer c3 = new Customer("Malte","Gregersen",25);
        Customer c4 = new Customer("Lars","Børge",25);

        Customer[] liste = {c1,c2,c3,c4};

        System.out.println(lastCustomer(liste));
        System.out.println();
        for(Customer cus : afterCustomer(liste,c2)){
            System.out.println(cus);
        }
    }

    public static Customer lastCustomer(Customer[] customers){
        Customer lastCustomer = customers[0];

        for (int i = 0; i < customers.length; i++) {
            int comp = lastCustomer.compareTo(customers[i]);
                lastCustomer=customers[i];
        }

        return lastCustomer;
    }

    public static Customer[] afterCustomer(Customer[] customers, Customer customer){
        int i = 0;

        for (boolean aktiv = true; aktiv ;i++) {
            if(customer == customers[i]){
                aktiv=false;
            }
        }

        int removeCount = i;
        Customer[] listeEndelig = new Customer[customers.length-removeCount];

        for (int j = 0; j < customers.length-removeCount; j++,i++) {
             listeEndelig[j] = customers[i];
        }

        return listeEndelig;
    }
}
