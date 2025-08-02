public class largestnumber {
    public static void main(String[] ags){
        int numbers[]={3,4,5,6,7,9};
        System.out.println("the largest value is : "+ largernumber(numbers));
    }

    public static int largernumber(int numbers[]){
        int large=   Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>large){
                large=numbers[i];
            }
        }return large;
    }
}
