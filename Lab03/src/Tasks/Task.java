package Tasks;
public class Task {
    public static void TaskArr1(){
        InputData input = new InputData();
        System.out.println("Podaj poczatek przedzialu: ");
        int a = input.InputInt();
        System.out.println("Podaj koniec przedzialu: ");
        int b = input.InputInt();
        System.out.println("Podaj ilosc elementow tablicy: ");
        int ilosc = input.InputInt();

        int[]arr = RandomValue.RandValueArr(a,b,ilosc);
        for (int item:arr)
        System.out.print(item+" ");
    }
}
