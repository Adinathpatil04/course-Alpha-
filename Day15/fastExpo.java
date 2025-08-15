public class fastExpo {
    public static void main(String[] args){
        System.out.println(fast_Expo(5, 3));

    }

    public static int fast_Expo(int a,int n){
        int ans=1;
        while(n>0){
            if((n&1)!=0){//checks Lsb
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }return ans;
    }
}
