public class update {
    public static void main(String[] args){

    }
    public static int ClearBit(int n,int i){
        int bitMask=~(1<<i);
        return n & bitMask;
    }

    public static int UpdateBit(int n,int i, int newBit){
        n = ClearBit(n,i);
        int bitMask=newBit<<i;
        return n| bitMask;
    }
}
