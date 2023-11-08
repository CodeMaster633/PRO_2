package opgaver;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        Mekaniker m1 = new Mekaniker("Benjamin","vej 1",1992,130);
        Mekaniker m2 = new Mekaniker("Torsten","vej 52",2000,140);
        Mekaniker m3 = new Mekaniker("Peter","vej 144",1998,150);

        Værkfører v1 = new Værkfører("Malte","vej 4",1992,165,2012,20);
        Værkfører v2 = new Værkfører("August","vej 5",1992,160,2012,20);

        Synsmand s1 = new Synsmand("Hans","vej 4",1992,165,50,29);

        ArrayList<Mekaniker> liste = new ArrayList();
        liste.add(m1);
        liste.add(m2);
        liste.add(m3);
        liste.add(v1);
        liste.add(v2);
        liste.add(s1);

        System.out.println(samletLoen(liste));

    }

    public static int samletloenUge(Mekaniker mekaniker){
        return mekaniker.beregnLoen()*4;
    }

    public static double samletLoen(ArrayList<Mekaniker> liste){
        int samletloenAlle = 0;

        for (int i = 0;i<liste.size();i++){

            samletloenAlle =+ samletloenUge(liste.get(i));

            if(liste.get(i) instanceof Synsmand){
                System.out.println("Synsmand");
            }
        }
        return samletloenAlle;
    };
}
