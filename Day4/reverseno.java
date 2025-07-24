public class reverseno {
    public static void main(String[] args){
        int n=119023;

        // while(n>0){
        //     int lastdig=n%10;  //to get last digit of the number 
        //     System.out.print(lastdig+" ");
        //     n =n/10; //to remove last digit 
     
        // }
        // System.out.println();

        //OR
        int rev=0;
        while(n>0){
            int lastdig=n%10;
            rev=(rev*10)+lastdig;
            n=n/10;
        }System.out.println(rev);
    }
}
