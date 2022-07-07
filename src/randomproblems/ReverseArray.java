package randomproblems;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 6, 8, 9};
        int n = arr.length;
        int i = 0, j = n-1;

        while(i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int iter : arr) {
            System.out.println(iter
            );
        }
    }
}
