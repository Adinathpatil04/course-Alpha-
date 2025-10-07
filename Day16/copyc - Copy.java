public class copyc {
    public static void main(String[] args){
        Students s1=new Students();
        s1.name="Shradhha";
        s1.roll=34;
        s1.passwd="abc";

        Students s2=new Students(s1);
        // s2.passwd="xyz";

    }
}
class Students{
    String name;
    int roll;
    String passwd;
    // int marks[];

    Students(Students s1){
        this.name=s1.name;
        this.roll=s1.roll;

    }

}
