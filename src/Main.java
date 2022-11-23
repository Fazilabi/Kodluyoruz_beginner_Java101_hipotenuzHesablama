import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b;
        double c = 1.0;

        Scanner input = new Scanner(System.in);
        System.out.print("Ucbucagin bir terefinin uzunlugunu daxil edin: ");
        a = input.nextInt();
        System.out.print("Ucbucagin ikinci terefinin uzunlugunu daxil edin: ");
        b = input.nextInt();
        c= a*a+b*b;

        System.out.println("hipotenuzun uzunlugu : "+ Math.sqrt(c));

    }
}