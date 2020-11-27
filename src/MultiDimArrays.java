public class MultiDimArrays {
    public static void main(String[] args) {

        /*
        [0,0,0,][0,0,0]
        [0,0,0,][0,5,0]
         */

        int [][] matrix = new int [2][3];
        matrix [1][1] = 5;

        char [][] chars = {
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'o'},
        };

        //System.out.println(matrix.length);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }
}
