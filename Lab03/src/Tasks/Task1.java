package Tasks;

import java.util.Scanner;

public class Task1 {
    public void Zadanie1() {
        Scanner inputData = new Scanner(System.in);
        double lPkt;

        System.out.println("Podaj ilość studentów w grupie: ");
        int n = inputData.nextInt();

        if (n < 0) {
            System.out.println("Liczba studentów w grupie nie może być < 0");
        } else {
            double suma = 0;
            int originalN = n;
            while (n > 0) {
                System.out.println("Podaj ilość punktów z przedziału [ 0 - 10 ]: ");
                lPkt = inputData.nextDouble();
                if (lPkt >= 0 && lPkt <= 10) {
                    suma += lPkt;
                    n--;
                } else {
                    System.out.println("Wprowadź punkty w zakresie od 0 do 10.");
                }
            }
            double srednia = suma / originalN;
            System.out.println("Średnia ilość punktów: " + srednia);
        }
    }

    public static void main(String[] args) {
        Task1 task = new Task1();
        task.Zadanie1();
    }
}
