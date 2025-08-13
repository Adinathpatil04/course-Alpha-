public class clearBit {
    public static void main(String[] args){
        System.out.println(ClearBit(10, 1));

    }
    public static int ClearBit(int n,int i){
        int bitMask=~(1<<i);
        return n & bitMask;
    }
}
