public class isPowerOFTwo {
    public static void main(String[] args){
        System.out.println(is_power_of_Two(16));
    }

    public static boolean is_power_of_Two(int n){
        return (n&(n-1))==0;
    }
}
