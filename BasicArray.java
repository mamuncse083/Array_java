package array;

public class BasicArray {

    public static void main(String[] args) {
        double[] myarray = {1, 5, 6.5, 23, 4, 6, 8, 2, 50};
        ArrayList(myarray);
        symArrayList(myarray);
        MaxArrayList(myarray);
    }

    private static void ArrayList(double[] myarray) {
        for (int i = 0; i < myarray.length; i++) {
            System.out.println(myarray[i]);
        }
    }

    private static void symArrayList(double[] myarray) {

        double sum = 0;
        for (int i = 0; i < myarray.length; i++) {
            sum = sum + myarray[i];

        }
        System.out.println("Sum of array = " + sum);
    }

    private static void MaxArrayList(double[] myarray) {
        double temp = 0;
        for (double value : myarray) {

            if (value > temp) {
                temp = value;
            }
        }
        System.out.println("Max Value = " + temp);
    }
}
