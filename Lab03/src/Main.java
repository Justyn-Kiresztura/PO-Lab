//import LabArrys.TaskArr;
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 132};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        for (int item : arr)
            System.out.println(item + " ");
    }
}