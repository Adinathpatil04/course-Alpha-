public class stairCase {
    public static void main(String[] args){
        int matrix[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        stairCaseSearch(matrix,15 );
    }

    public static boolean stairCaseSearch(int matrix[][], int key){
        int row=0;
       
        int col = matrix[0].length - 1;

        while(row<matrix.length && col>=0){
            if(matrix[row][col] == key){
                System.out.println("found at row: " + row + " col: " + col);
                return true; // key found
            } else if(matrix[row][col] > key){
                col--; // move left
            } else {
                row++; // move down
            }
        }System.out.println("not found");
        return false; // key not found
    }
}
