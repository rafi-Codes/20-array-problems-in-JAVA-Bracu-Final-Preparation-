import java.util.Scanner;
import java.util.Arrays;

public class codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int newArrSize = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && arr[j] != Integer.MIN_VALUE) {
                    arr[j] = Integer.MIN_VALUE; 
                    newArrSize--;
                }
            }
        }
        int newArr[] = new int[newArrSize];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != Integer.MIN_VALUE) {
                newArr[idx++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(newArr));
        sc.close();
    }
}
