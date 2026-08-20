public class grtr10 {
    public static void main(String[] args) {
        int[] arr = { 5, 12, 8, 20, 3, 15 };
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 10) {
                count++;
                System.out.println(arr[i] + " is greater than 10");
            }
        }
        System.out.println("Number of elements greater than 10: " + count);
    }

}
