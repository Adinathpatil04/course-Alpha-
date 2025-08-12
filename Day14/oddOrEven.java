public class oddOrEven {

    public static void main(String[] args){
        OddorEven(3);
        OddorEven(13);
    }

    public static void OddorEven(int n){
        int Bitmask=1;

        if((n & Bitmask) == 0){
            System.out.println("Number is even");
        }else{
            System.out.println("Odd");
        }
    }
}