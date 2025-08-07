public class diagonalsum {
    public static void main(String[] args){
        int matrix[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        int result =diagonalSum(matrix);
        System.out.println(result);
    }

    public static int diagonalSum(int matrix[][]){
        int sum = 0;
        int n = matrix.length;

        for(int i = 0; i < n; i++){
            sum += matrix[i][i]; // primary diagonal
            if(i != n - 1 - i) { // avoid double counting the middle element in odd-sized matrices
                sum += matrix[i][n - 1 - i]; // secondary diagonal
            }
        }
        return sum; 
        
    }
}
