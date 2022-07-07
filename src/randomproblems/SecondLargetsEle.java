package randomproblems;

public class SecondLargetsEle {
    public static void main(String[] args) {
        int arr[] = {12, 10, 11, 1, 4,5};
        int n = arr.length;
        int smallest = arr[0];

        for(int i = 0; i<n;i++) {
            if(smallest > arr[i])
                smallest = arr[i];
        }

        int secSmallest = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            if(arr[i] != smallest && arr[i] < secSmallest) {
                secSmallest = arr[i];
            }
        }
        System.out.println(secSmallest);
    }
}
