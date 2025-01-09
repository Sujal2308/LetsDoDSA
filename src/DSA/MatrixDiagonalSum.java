package DSA;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] arr = {
            {1}
        };
        System.out.println(MDS(arr));
    }


    static int MDS(int[][] mat){
        int sum = 0;
        int len = mat.length;
        if(len == 1){
            return mat[0][0];
        }
        if(len%2==1) {
            for (int i = 0; i < mat.length; i++) {

                if (i == 0 || i == mat.length - 1) {
                    sum = sum + mat[i][0] + mat[i][mat[i].length - 1];
                } else {
                    for (int j = 1; j <= mat.length - 2; j++) {
                        sum = sum + mat[i][j];
                    }
                }
            }
        }

            else
            {
            for (int i = 0; i < mat.length; i++) {

                if (i == 0 || i == mat.length - 1) {
                    sum = sum + mat[i][0] + mat[i][mat[i].length - 1];
                } else {
                    for (int j = 1; j <= mat.length - 2; j++) {
                        sum = sum + mat[i][j];
                    }
                }
            }

        }
        return sum;
    }
}
