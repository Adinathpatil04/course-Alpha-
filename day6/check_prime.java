public class check_prime {
    public static void main(String[] args) {
        System.out.println(prime(12));
    }
    public static boolean prime(int n){
        boolean isprime=true;

        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isprime=false;
                break;
            }
        }return isprime;
    }
}
