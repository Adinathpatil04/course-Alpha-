public class OOPS{
    public static void main(String[] args){
        Pen p1=new Pen();//contructor
        p1.setColor("blue");
        System.out.println(p1.Color);
        p1.setTip(7);
        System.out.println(p1.Tip);

        Student Std=new Student();
        // System.out.println(Std.name);
    }

}

class Pen{
    String Color;
    int Tip;

    void setColor(String NewColor){ 
      Color = NewColor;
    }
    void setTip(int NewTip){
        Tip=NewTip;
    }
}

class Student{
    String name;
    int roll;

    // Student(String name){
    //     this.name=name;

    Student(){
        System.out.println("Constructor Calles..");
    }
    
}