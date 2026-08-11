import java.util.Scanner;

public class recbs2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        recbs2 obj = new recbs2();
        obj.rec(n);

    }

    public int rec(int n) {
        if (n == 0) {
            return 0;
        }
        rec(n - 1);
        System.out.println(n);
        return 0;
    }
}
