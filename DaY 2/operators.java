public class operators {
    public static void main(String[] args){
        int a=10;
        int b=19;
        System.out.println("Add = "+ (a+b));
        System.out.println("sub = "+ (a-b));
        System.out.println("prod = "+ (a*b));
        System.out.println("div = "+ (a/b));
        System.out.println("reminder = "+ (a%b));

        //unary operator---preincrement
        int k=90;
        int x=++k;
        System.out.println(k);
        System.out.println(x);
        //post increment
        int k1=90;
        int x1=k++;
        System.out.println(k1);
        System.out.println(x1);
    }
}
