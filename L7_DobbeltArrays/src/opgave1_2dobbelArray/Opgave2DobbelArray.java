package opgave1_2dobbelArray;

public class Opgave2DobbelArray {

    public static void main(String[] args) {
        final int ROW = 8;
        final int COL = 8;
        int[][] values = new int[ROW][COL];
        DobbelArrayMethods da = new DobbelArrayMethods();

        //Udskriv values på tabel form
        da.udskrivArray(values);
        

        // Opg 2.1
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[0].length; j++) {
                da.setValueAt(values,i,j,5);
            }
        }

        System.out.println();
        System.out.println("Nedenfor skulle der stå 5 på alle pladser");
        System.out.println();
        da.udskrivArray(values);
        
       // Opg 2.2
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[0].length; j++) {
                if(i%2==0){da.setValueAt(values,i,j,2);
            }else{da.setValueAt(values,i,j,3);}
            }
        }
        
        System.out.println();
        System.out.println("Nedenfor skulle der stå 2 og 3 på hver anden række");
        System.out.println();
        da.udskrivArray(values);

        // Opg 2.3
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[0].length; j++) {
                if(j%2==0){da.setValueAt(values,i,j,2);
                }else{da.setValueAt(values,i,j,3);}
            }
        }

        System.out.println();
        System.out.println("Nedenfor skulle der stå 2 og 3 på hver anden søjle");
        System.out.println();
        da.udskrivArray(values);


        // Opg 2.4
        boolean active = false;
        for (int i = 0; i < values.length; i++) {
            active=!active;
            for (int j = 0; j < values[0].length; j++) {
                if(active){da.setValueAt(values,i,j,0);
                    active=false;
                }else{da.setValueAt(values,i,j,1);
                    active=true;
                }
            }
        }
        
        System.out.println();
        System.out.println("Nedenfor skulle der stå 0 og 1 på alle pladser som på skakbræt");
        System.out.println();
        da.udskrivArray(values);

        // Opg 2.5
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[0].length; j++) {
                if(j==0||j==values[0].length-1||i==0||i== values.length-1){da.setValueAt(values,i,j,5);
                }else{da.setValueAt(values,i,j,2);}
            }
        }
        System.out.println();
        System.out.println("Nedenfor skulle der stå 5 i kanten og 2 ellers");
        System.out.println();
        da.udskrivArray(values);


    }



}
