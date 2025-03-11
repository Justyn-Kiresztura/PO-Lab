package Tasks;

import java.util.Random;

public class RandomValue {

    /**
     *
     * @param a - poczatek przedzialu losowania
     * @param b - koniec przedzialu losowania
     * @param ilosc - ilosc elementow do wylosowania
     * @return metoda zwraca wylosowana wartosc
     * */
    public static int[] RandValueArr(int a, int b, int ilosc){
        if (a>b) {
            System.out.println("Poczatek przedzialu nie moze byc wiekszy od konca");
            return null;
        }
        if (ilosc < 0){
            System.out.println("Ilosc elementow do wylosowania nie moze byc < 0");
            return null;
        }
        Random rand = new Random();
        int[] values = new int[ilosc];
        for (int i =0; i < values.length; i++){
            values[i] = rand.nextInt( b-a+1)+a;
        }
        return values;
    }
}
