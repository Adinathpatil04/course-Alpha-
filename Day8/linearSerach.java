public class linearSerach {
    public static void main(String[] args){
        int number[]={3,4,5,6,7,8,9,0};
        int key=6;
        int index=linear(number,key);
        if(index==-1){
            System.out.println("not find");
        }else{
            System.out.println("find at index: " + index);
        }

    }

    public static int linear(int number[], int key){
        for(int i=0;i<=number.length;i++){
            if(number[i]==key){
                return i;
            }
            
        }return -1;
    }
}
