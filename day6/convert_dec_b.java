public class convert_dec_b {
    public static void main(String[] args){
        dec_to_bin(7);
    }
    public static void dec_to_bin(int n){
        int pow=0;
        int mynum=n;
        int binNum=0;

        while(n>0){
            int rem=n%2;
            binNum=binNum+(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        
    }System.out.println("Binary of"+ mynum +"is ="+ binNum);
}
}