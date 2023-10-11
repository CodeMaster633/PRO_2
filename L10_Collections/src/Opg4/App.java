package Opg4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class App {
    public static void main(String[] args) {
        try {
            File myObj = new File("Filmanmeldelser.txt");
            Scanner myReader = new Scanner(myObj);

            String antalAnmeldelser = myReader.nextLine();
            Map<String, ArrayList<Integer>> anmeldelser = new HashMap();

            while (myReader.hasNextLine()) {
                String navn = myReader.nextLine();
                String karakter = myReader.nextLine();
                if(!anmeldelser.containsKey(navn)){
                    ArrayList list = new ArrayList();
                    list.add(Integer.parseInt(karakter));
                    anmeldelser.put(navn,list);
                }else{
                    anmeldelser.get(navn).add(Integer.parseInt(karakter));
                }
            }

            System.out.println(anmeldelser);

            anmeldelser.forEach((navn,karakter) -> {
            double gennemsnit = begeregnGennemsnit(anmeldelser.get(navn));
                System.out.println(navn+gennemsnit);
            });

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static double begeregnGennemsnit(ArrayList<Integer> list){
        int sum = 0;
        for (int j = 0; j < list.size(); j++) {
            sum=sum+list.get(j);
        }
        return sum/list.size();
    }
}
