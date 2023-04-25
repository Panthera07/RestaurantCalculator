package RestaurantCalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] s = new String[]{"Pepperoni    ", "Margherita    ", "Hawajska    ", "Kawa     ", "Herbata", "Woda    ", "Cola     ", "Lody   ", "Ciasto    ", "Koniec     "};
        int[] rate = new int[]{30, 25, 35, 10, 9, 5, 8, 12, 15, 0};
        int[] qt = new int[10];
        int sum = 0;
        boolean quit = true;


        do {
            System.out.println("Rodzaj:" + "\t\t\tCena [zł]:");
            for (int i = 0; i < 10; i++)
                System.out.println((i + 1) + "." + s[i] + "\t\t" + rate[i]);


            int ch = input.nextInt();
            if (ch > 0 && ch < 10) {
                System.out.println("Podaj ilość: " + s[ch - 1]);
                int q = input.nextInt();
                qt[ch - 1] += q;

            } else {
                quit = false;

            }

        } while (quit);


        System.out.println("Podsumowanie Twojego zamówienia:\n");
        for (int i = 0; i < 10; i++) {
            if (qt[i] != 0) {
                sum += qt[i] * rate[i];
                System.out.println(s[i] + "*   " + qt[i] + " = " + qt[i] * rate[i] + "zł");
            }
        }


        System.out.println("Razem do zapłaty: " + sum + "zł");

        System.out.println("Dziękujemy za skorzystanie z naszych usług!");


    }

}