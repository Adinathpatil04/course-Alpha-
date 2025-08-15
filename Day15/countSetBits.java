public class countSetBits {
    public static void main(String[] args){
        System.out.println(Count_Set_Bits(15));

    }

    public static int Count_Set_Bits(int n){
        int count=0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }return count;
    }
}
