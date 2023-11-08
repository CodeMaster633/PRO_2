package opgaver;

public class Opgaverne {
    public static void main(String[] args) {
        System.out.println("Opgave 1");
        System.out.println("Factorial 5: " + factorial(5));
        System.out.println();
        System.out.println("Opgave 2");
        System.out.println("Power 5^3: " + power(5, 3));
        System.out.println("Power2 5^3: " + power2(5, 3));
        System.out.println();
        System.out.println("Opgave 3");
        System.out.println("Product 5*100: " + product(5, 100));
        System.out.println("ProductRus 5*100: " + productRus(5, 100));
        System.out.println();
        System.out.println("Opgave 4");
        System.out.println("Reverse RANSLIRPA: " + reverse("RANSLIRPA"));
        System.out.println();
        System.out.println("Opgave 5");
        System.out.println("Største Fælles Divisor 8 og 40: " + sfd(8, 40));
        System.out.println();
        System.out.println("Opgave 6");
        System.out.println("Dominostrimmel resultat input: 5: " + dominoStrimmel(5));

    }

    //Opgave 1
    public static int factorial(int n) {
        int result = 0;

        if (n == 0) {
            result = 1;
        } else {
            result = n * factorial(n - 1);
        }

        return result;
    }

    //Opgave 2
    public static int power(int n, int p) {
        int result = 0;

        if (p == 0) {
            result = 1;
        } else {
            result = n * power(n, p - 1);
        }

        return result;
    }

    public static int power2(int n, int p) {
        int result = 0;

        if (p == 0) {
            result = 1;
        } else if (p % 2 != 0) {
            result = n * power2(n, p - 1);
        } else if (p % 2 == 0) {
            result = power2((n * n), p / 2);
        }

        return result;
    }

    //Opgave 3
    public static int product(int a, int b) {
        int result = 0;

        if (a == 1) {
            result = b;
        } else {
            result = result + b + product(a - 1, b);
        }

        return result;
    }

    public static int productRus(int a, int b) {
        int result = 0;

        if (a == 0) {
            result = 0;
        } else if (a % 2 == 1 && a >= 1) {
            result = result + b + productRus(a - 1, b);
        } else if (a % 2 == 0 && a > 1) {
            result = result + productRus(a / 2, 2 * b);
        }

        return result;
    }

    // productRus() har færre behandlinger end product(). Især når a er væsentlig større end b


    //Opgave 4
    public static String reverse(String input) {

        String result = "";

        if (input.length() <= 0) {
            result = input;
        } else {
            result = reverse(input.substring(1)) + input.charAt(0);
        }

        return result;
    }

    //Opgave 5
    public static int sfd(int a, int b) {
        int result = 0;

        if (a % b == 0 && b <= a) {
            result = b;

        } else if (a < b) {
            result = sfd(b, a);

        } else {
            result = sfd(b, a % b);
        }

        return result;
    }

    //Opgave 6
    public static int dominoStrimmel(int n) {
        int result = 0;
        if (n <= 1) {
            result = n;
        } else if (n == 2) { //Dette er ekstra ift. fibonnaci
            result = n;
        } else {
            result = dominoStrimmel(n - 1) + dominoStrimmel(n - 2);
        }
        return result;
    }
}
