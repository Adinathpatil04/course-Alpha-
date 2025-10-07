public class Constructors {
    public static void main(String[] args){
        // Students s1= new Students();
        Students s2= new Students("Adya");
        Students s3= new Students(1234);
        
    }
}
class Students{
    String name;
    int roll;

    // Students{
    //     System.out.println("Yes constructor");
    // }

    Students(String name){
        this.name=name;
    }
    Students(int roll){
        this.roll=roll;
    }
}
 