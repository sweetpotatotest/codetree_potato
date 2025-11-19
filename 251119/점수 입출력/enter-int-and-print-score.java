import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N <= 1000 && N >= 1) {
            System.out.println("Your score is " + N + " point.");
        }
    }
}