package Del2_Opg3;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        Mekaniker m1 = new Mekaniker("Benjamin","vej 1",1992,120);
        Mekaniker m2 = new Mekaniker("Torsten","vej 52",2000,150);
        Mekaniker m3 = new Mekaniker("Peter","vej 144",1998,150);

        Værkfører v1 = new Værkfører("Malte","vej 4",100,2012,20);
        Værkfører v2 = new Værkfører("August","vej 5",160,2012,20);

        Synsmand s1 = new Synsmand("Hans","vej 4",1992,100,50,29);

        ArbejdsDreng a1 = new ArbejdsDreng("Børge","vej3",100);

        ArrayList<Ansat> liste = new ArrayList();
        liste.add(m1);
        liste.add(m2);
        liste.add(m3);
        liste.add(v1);
        liste.add(v2);
        liste.add(s1);
        liste.add(a1);

        System.out.println(samletLoen(liste));

    }

    public static int samletloenUge(Ansat ansat){
        return ansat.beregnLoen();
    }

    public static double samletLoen(ArrayList<Ansat> liste){
        int samletloenAlle = 0;

        for (int i = 0;i<liste.size();i++){

            samletloenAlle += samletloenUge(liste.get(i));
        }
        return samletloenAlle;
    };
}