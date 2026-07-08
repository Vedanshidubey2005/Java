import java.util.Arrays;

public class bubblesort{
    public static void main(String[] args) {
        int[] arr= {3,1,2,4,5};
        bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
static void bubble_sort(int[] arr){
    boolean swapp ;
    for(int i=0;i < arr.length;i++){
        swapp = false;
        for (int j = 1; j < arr.length - i; j++) {
            if(arr[j]<arr[j-1]){
                int temp;
                temp= arr[j];
                arr[j]= arr[j-1];
                arr[j-1]= temp;
                swapp = true;
            }
        }
        if( swapp == false) break;
    }
    // [1, 2, 3, 4, 5]
}
}
