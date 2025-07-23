import java.util.Scanner;

public class multiCondition {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

        if(age>18){
            System.out.println("The adult");
        }else if(age>=13 && age<=18){
            System.out.println("The teenager");
        }else{
            System.out.println("child");
        }
    }
}
