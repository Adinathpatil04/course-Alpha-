public class facto {
    public static void main(String[] args) {
        int n=4;
        int fa=factorial(n);
        System.out.println(fa);

    }
    public static int factorial(int n){
        int f=1;

        for(int i=1;i<=n;i++){
            f=f*i;
        }return f;

    }
}
