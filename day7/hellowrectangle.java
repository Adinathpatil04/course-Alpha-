public class hellowrectangle {
    public static void main(String[] args){
        hollow_rect(4,4);
    }
    public static void hollow_rect(int totrows, int totcol){
         
        for(int i=1;i<=totrows;i++){
            for(int j=1;j<=totcol;j++){
                if(i==1 || i==totrows || j == 1 || j == totcol){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
}
