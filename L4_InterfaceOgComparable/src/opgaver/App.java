package opgaver;

public class App {
    public static void main(String[] args) {
        Chili c1 = new Chili("mdm",100);
        Chili c2 = new Chili("fff",2000);
        Chili c3 = new Chili("Ghost",30000);

        Measurable[] liste = new Measurable[3];

        liste[0]=c1;
        liste[1]=c2;
        liste[2]=c3;

        System.out.println(max(liste));
        System.out.println(avg(liste));
    }

    public static Measurable max(Measurable[] objects) {
        Measurable max = objects[0];

        for (Measurable mea : objects){
            if(mea.getMeasure()> max.getMeasure()){
                max = mea;
            }
        }
        return max;
    }
    public static double avg(Measurable[] objects) {
        double sum = 0;

        for (Measurable mea : objects){
                sum += mea.getMeasure();
        }
        return sum/objects.length;}
}
