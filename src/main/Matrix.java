import java.util.ArrayList;

public class Matrix {
    int[][] matrix = {
            { 84,  67,  22, -72,  95},
            { 72, -70,   2, -88,  30},
            { 95, -79, -87, -27, -97},
            {-52, -64, -13, -19, -27},
            { 79,  89,  95, -84, -53},
    };


public static int countNumbersDivisibleBySeven(int[][] matrix) {
    ArrayList<Integer> result = new ArrayList<>();
    for (int number : list) {
        if (number % 7 == 0) {
            result.add(number);
        }
    }
    return result;
}
        }
public static int columnsWithMax(int matrix[][]){
        int i,j;
        int ment_i=0;
        int max=0;

        for(i=0;i<matrix.length;i++){
        for(j=0;j<matrix[i].length;j++){
        if(max<matrix[i][j]){
        max=matrix[i][j];
        ment_i=i;
        }
        return matrix[ment_i];
        }
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int number : list) {
        if (number % 2 == 0) {
        result.add(number);
        }
        }
        return result;
        }
}



