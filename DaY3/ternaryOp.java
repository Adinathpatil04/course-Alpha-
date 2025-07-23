import java.util.Scanner;

public class ternaryOp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        String type=(a%2==0)?"Even":"odd";
        System.out.println(type);

    }
}
