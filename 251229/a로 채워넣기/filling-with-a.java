import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        int len = x.length();

        x = x.substring(0, 1) + "a" + x.substring(2);
        x = x.substring(0, len - 2) + "a" + x.substring(len -1);

        System.out.println(x);
    }
}