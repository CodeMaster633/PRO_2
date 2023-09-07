package Opg2;

public class Customer implements Comparable<Customer>{
    public String fornavn;
    public String efternavn;
    public int alder;

    public Customer(String fornavn, String efternavn, int alder) {
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.alder = alder;
    }

    public String getFornavn() {
        return fornavn;
    }

    public String getEfternavn() {
        return efternavn;
    }

    public int getAlder() {
        return alder;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public void setEfternavn(String efternavn) {
        this.efternavn = efternavn;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }


    @Override
    public int compareTo(Customer customer) {
        int comp = this.efternavn.compareTo(customer.getEfternavn());

        if(comp == 0){
            comp = this.fornavn.compareTo(customer.getFornavn());
        };
        if(comp == 0){
            comp = ((Integer)this.alder).compareTo(customer.getAlder());
        };
        
        return comp;
    }

    @Override
    public String toString() {
        return  fornavn + ' ' +
                efternavn + ' ' +
                alder;
    }
}
