public class convert_B_to_dec {
    public static void main(String[] args){
        B_To_dec(101);
    }
    public static void B_To_dec(int binNum){
        int mynum=binNum;
        int pow=0;
        int decNum=0;

        while(binNum>0){
            int lastdigit = binNum%10;
            decNum= decNum + (lastdigit*(int)Math.pow(2,pow));

            pow++;
            binNum=binNum/10;
        }
        System.out.println("decimal of "+ mynum+ "="+ decNum);

    }
}
