public class binarySearch {
    public static void main(String[] args){
        int numbers[] = {2,4,6,8,10,12};
        int key=10;

        System.out.println("index for key is : "+ binarys(numbers, key));
    }  
    
    public static int binarys(int numbers[],int key){
        int start=0, end=numbers.length-1;

        while(start<=end){
            int mid=(start + end) / 2;

            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start =mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

}
