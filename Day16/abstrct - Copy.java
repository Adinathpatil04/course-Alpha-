public class abstrct {
    public static void main(String [] args){
        Horse H=new Horse();
        H.eat();
        H.walk();

        chiken c=new chiken();
        c.eat();
        c.walk();
    }
}

abstract class Animal{
    void eat(){
        System.out.println("eats");
    }

    abstract void walk();

}

class Horse extends Animal{
    void walk(){
        System.out.println("walk on 4 legs");
    }
}
class chiken extends Animal{
    void walk(){
        System.out.println("Walk onn2 legs");
    }
}
