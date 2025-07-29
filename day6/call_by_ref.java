public class call_by_ref {
    public static void main(String[] args) {
        int a=12;
        int b=23;
        int prod=multiply(a, b);
        System.out.println("product is : "+ prod);
    }
    public static int multiply(int a, int b){
        int product=a*b;
        return product;

    }
}
