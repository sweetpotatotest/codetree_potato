import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char[] save = new char[10];
        for(int i = 0; i<save.length; i++) {
            save[i] = sc.next().charAt(0);
        }

        for(int j = 9; j>=0; j--) {
            System.out.print(save[j]);
        }
    }
}