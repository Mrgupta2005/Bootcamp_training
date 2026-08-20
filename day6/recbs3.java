public class recbs3 {
    public static void main(String[] args) {
        recbs3 obj = new recbs3();
        System.out.println(obj.rec(5));
    }

    public int rec(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * rec(n - 1);
    }
}
