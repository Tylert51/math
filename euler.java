public class euler {
    public static void main(String[] args) {
        // y_n = y_n-1 + f'(x_n-1 , y_n-1) * h;


        double xi = 0;
        double yi = 1;
        double y = yi;

        double xf = 1;

        int n = 10;
        double h = xf / n;

        int i = 0;

        System.out.println("n       x        y");

        for(double x = xi; x <= xf; x += h ) {

            printLine(i, x, y);
            y = y + function(x, y) * h;
            i++;

        }
    }

    public static double function(double x, double y) {
        double slope = Math.pow(Math.E, (x * y));

        return slope;
    }

    public static void printLine(int n, double x, double y) {
        System.out.println(padZeros(n, 2) + "    " + decimalPlaces(x, 3) + "    " + decimalPlaces(y, 3));
    }

    public static String padZeros(int value, int n) {
        return String.format("%0"+n+"d", value);
    }

    public static String decimalPlaces(double value, int n) {
        return String.format("%."+n+"f", value);
    }
}
