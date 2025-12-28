import java.util.Scanner;
import java.util.Arrays;

public class codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int lastZeroIdx = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 0 && lastZeroIdx == -1) {
                lastZeroIdx = i;
            } else if (arr[i] != 0 && lastZeroIdx != -1) {
                arr[lastZeroIdx] = arr[i];
                arr[i] = 0;
                lastZeroIdx--; 
            }
        }

        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
