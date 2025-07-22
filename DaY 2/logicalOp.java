public class logicalOp {
    public static void main(String[] args){
        System.out.println((3>2 && 5>0));  // only T and T = T
        System.out.println((3>12 || 5>10));  // only F and F = F
        System.out.println(!(3>2));  // T to F and F to T conversion
        
    }
}
