package opgave1_2dobbelArray;

public class Opgave1DobbelArray {

    public static void main(String[] args) {
        int[][] values = {{0,4,3,9,6}, {1,3,5,2,2}, {3,3,1,0,1}, {0,0,9,7,1}};

        DobbelArrayMethods da = new DobbelArrayMethods();
        System.out.println("Værdien af tabellen udskrives");
        da.udskrivArray(values);

        //Opg 1
        System.out.println();
        System.out.println(da.getValueAt(values,1,1));

        //Opg 2
        System.out.println();
        da.setValueAt(values,1,1,1);
        System.out.println(da.getValueAt(values,1,1));

        //Opg 3
        System.out.println();
        System.out.println(da.sumRow(values,2));

        //Opg 4
        System.out.println();
        System.out.println(da.sumCol(values,2));

        //Opg 5
        System.out.println();
        System.out.println(da.sum(values));
    }




}
