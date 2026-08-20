public class binary {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 3;
        int Left = 0;
        int right = arr.length - 1;
        while (Left <= right) {
            int mid = Left + ((right - Left) / 2);
            if (arr[mid] == target) {
                System.out.println(mid);
                break;
            } else if (arr[mid] < target) {
                Left = mid + 1;
            } else {
                right = mid - 1;
            }

        }

    }
}