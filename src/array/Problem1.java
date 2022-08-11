package array;
public class Problem1 {
    public static int getSum(int[] prefixSum, int l, int r)
    {
        //process query using these logics
        if (l != 0) {
            return prefixSum[r] - prefixSum[l - 1];
        }
        else{
            return prefixSum[r];
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 10, 13, 22, 28, 33, 37};
        //create array of same length w.r.t arr
        int[] prefixSum = new int[arr.length];
        //initialize 0th index with the oth index of arr[0]
        prefixSum[0] = arr[0];

        //populate prefixSum array using below logic
        //i.e. pre-calculation of sum
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        System.out.println("Get sum between 0 to 2 : " + getSum(prefixSum, 0, 2));//25
        System.out.println("Get sum between 2 to 4 : " + getSum(prefixSum, 2, 4));//63
    }
}
