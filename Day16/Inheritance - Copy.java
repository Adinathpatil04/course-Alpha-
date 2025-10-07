public class Inheritance {
    public static void main(String[] args){
        // Animal shark=new Animal();

        // shark.eat();
        dog doggy = new dog();
        doggy.eat();

    }
}

class Animal{
    String color;

    void eat(){
        System.out.println( "eats");
    }
    void breathe(){
        System.out.println("Breaths");
    }
}

// 
class mammmals extends Animal{
    String legs;
}
class dog extends mammmals{
    String bark;
}

class lion extends Animal{
    void run(){
        System.out.println("Running");
    }
}

class tiger extends Animal{
    void darkali(){
        System.out.println("darkali");
    }
}