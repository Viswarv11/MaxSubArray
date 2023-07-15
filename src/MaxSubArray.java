import java.util.Scanner;

public class MaxSubArray {
    public static int maximumSubArray(int array[],int size,int b) {
        int result = 0;
        for(int i=0;i<size;i++) {
            int sum = 0;
            for(int j=0;j<size;j++) {
                if(sum+array[j] <= b) {
                    sum += array[i];
                }
            }
            if(result<sum) {
                result = sum;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++) {
            array[i] = scanner.nextInt();
        }
        int b = scanner.nextInt();
        int results = maximumSubArray(array,n,b);
        System.out.println(results);
    }
}
