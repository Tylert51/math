import java.util.Arrays;

public class slopefields {
    public static void main(String[] args) {

        int dimensions = 5;
        double[][] slopes = new double[dimensions][dimensions];

        int xi = 0;
        int yi = 0;

        for (int i = 0; i < slopes.length; i++) {
            for(int j = 0; j < slopes[0].length; j++) {

                int x = j + 1;

                slopes[i][j] = function(xi + i + 1, yi + j + 1);
            }
        }

        print2DArr(slopes);


    }

    public static double function(double x, double y) {
        double slope = 3 - x;

        return slope;
    }

    public static void print2DArr(double[][] arr) {
        for(double[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
    
}
