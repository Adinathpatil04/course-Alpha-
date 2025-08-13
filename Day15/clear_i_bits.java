public class clear_i_bits {
    public static void main(String[] args){
        System.out.println(Clear_Bits(15,2 ));

    }

    public static int Clear_Bits(int n, int i){
        int bitMask= (~0)<<i;
        return n & bitMask;

    }
}
