import java.util.Arrays;

public class inbuiltSort {
    public static void main(String[] args){
        int arr[]={5,4,1,3,2};
        Arrays.sort(arr);
        //for selected portion sorting
        // Arrays.sort(arr,0,3);
        //printing
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    // public static void Sort(int arr[]){
    //     Arrays.sort()
    // }
}
