import java.util.Scanner;

public class input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S=sc.next();
        System.out.println(S);

        String name=sc.nextLine();
        System.out.println(name);

        //sum of a nd b 
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Ther sum of a and b is : " + sum);


        //product of a nad b
        int product =a*b;
        System.out.println("The product is : " + product);


        //Are of circle 
        float rad=sc.nextFloat();
        float area= 3.142f * rad * rad;
        System.out.println("The area of circle is : " + area);


    }
}
