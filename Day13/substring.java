public class substring {
    public static void main(String[] args){
         String str="Hello,World";
         System.out.println(substringreturn(str,0,4));

    }

    public static String substringreturn(String str, int si, int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }return substr;
    }
}
