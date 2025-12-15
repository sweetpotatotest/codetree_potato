import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] save = new String[9];
        for(int i = 0; i<save.length; i++) {
            save[i] = sc.nextLine();
        }

        for(int j = 0; j<save.length; j++) {
            System.out.print(save[9-j]);
        }
    }
}