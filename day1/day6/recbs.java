public class recbs {
    public static void main(String[] args) {
        recbs obj = new recbs();
        obj.rec(5);
    }

    public int rec(int n) {
        if (n == 0) {
            return 0;
        }
        System.out.println(n);
        return rec(n - 1);
    }
}