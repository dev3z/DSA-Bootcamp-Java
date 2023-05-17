import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int []a= { -3,-5,-6,3,0,42,23,4};
        Bubblesort(a);
        System.out.println(Arrays.toString(a));
    }

    static void Bubblesort(int []arr) {
        //pass n-1 times ( n-1 steps)
        for (int i =0 ;i <arr.length ; i++){
        boolean swap = false;
        //for each steps max element comes to last index
         for (int j =1 ; j < arr.length -1 ; j++){
             if ( arr[j] < arr[j-1]) {
                 int temp = arr[j-1];
                 arr[j-1] = arr [j];
                 arr[j] = temp;
                 swap = true;
             }
         }
            if (!swap) {
                break;
            }
            }
    }
}
