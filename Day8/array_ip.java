import java.util.Scanner;

public class array_ip {
    public static void main(String[] args){
        int marks[]=new int[100];
        //INPUT
        Scanner sc= new Scanner(System.in); 

        marks[0]=sc.nextInt();//math
        marks[1]=sc.nextInt();//phy
        marks[2]=sc.nextInt();//chem
    //OUTPUT
        System.out.println("math :"+ marks[0]);
        System.out.println("phy :"+ marks[1]);
        System.out.println("chem :"+ marks[2]);

        //UPDATE
        marks[2]=marks[2]+1;
        System.out.println("phy :"+marks[2]);

        //claculate length of array;
        System.out.println(marks.length);
    }
}
