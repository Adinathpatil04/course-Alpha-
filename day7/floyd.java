public class floyd {
    public static void main(String[] args){
        f_triangle(5);
    }
    public static void f_triangle(int n){ 
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+ " ");
                count++;
            }
            System.out.println();
        }
    }
}
