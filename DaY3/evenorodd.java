import java.util.Scanner;

public class evenorodd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        if(a%2==0){                        //using if else condition
            System.out.println("The Number is Even");
        }else{
            System.out.println("The number is odd");
        }
    }
}
