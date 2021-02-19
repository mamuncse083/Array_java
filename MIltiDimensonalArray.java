package array;

public class MIltiDimensonalArray {

    public static void main(String[] args) {
        double[][] myarray = {
            {1, 5, 6.5},
            {23, 4, 6},
            {8, 2, 50}
        };
        ArrayList(myarray);
        symArrayList(myarray);
    }

    private static void ArrayList(double[][] myarray) {
        for (int i = 0; i < myarray.length; i++) {
            for (int j = 0; j < myarray[i].length; j++) {
                System.out.print(myarray[i][j] + ",\t");
            }
            System.out.println("\n");
        }
    }

    private static void symArrayList(double[][] myarray) {

        double sum = 0;
        for (int i = 0; i < myarray.length; i++) {
            for (int j = 0; j < myarray[i].length; j++) {
                sum = sum + myarray[i][j];
            }

        }
        System.out.println("Sum of array = " + sum);
    }

}
