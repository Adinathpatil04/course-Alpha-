public class overload_byType {
    public static void main(String[] args) {
        System.out.println(sum(3,6));
        System.out.println(sum(3.3f,8.9f));
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum( float a,float b){
        return a+b;
    }
}
