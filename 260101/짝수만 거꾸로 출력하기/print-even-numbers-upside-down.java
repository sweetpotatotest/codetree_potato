import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int[] arr = new int[count];

        for(int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }


        for(int i = count - 1; i >= 0; i--) {
            if(arr[i] % 2 == 0)
                System.out.print(arr[i] + " ");
        }
    }
}