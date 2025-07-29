import java.util.Scanner;

public class f_with_arguments {
    public static void  main(String[] args){
         Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=calsum(a,b);//actual parameters/arguments--> to call
        System.out.println("sum is: "+sum);
        swap(a,b);
        
    }
    public static int calsum(int a,int b){//formal parameters
        int sum=a+b;
        return sum;
    }
    //swap
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
