import java.util.Scanner;

public class inpout {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String name=sc.next();//next only takes one word
        System.out.println(name);


        String name2=sc.nextLine(); //nextLine takes the whole line
        System.out.println(name2);
    }
}
