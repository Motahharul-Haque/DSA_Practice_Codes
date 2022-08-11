package array;

public class Problem2 {
    private static int checkEquilibrium(int[] arr) {
        //do sum of array elements
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int lSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (lSum == sum - arr[i]) {
                return i + 1;
            }
            lSum += arr[i];
            sum -= arr[i];
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 8, -9, 20, 6};
        System.out.println("isEquilibrium at index : " + checkEquilibrium(arr));
    }
}
