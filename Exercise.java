package array;

public class Exercise {

    public static void main(String[] args) {
        double[] myarray = {1, 5, 6.5, 23, 4, 6, 8, 2, 50};
        ArrayList(myarray);

    }

    private static void ArrayList(double[] myarray) {
        for (int i = 0; i < myarray.length; i++) {
            System.out.print("\t" + myarray[i]);
        }
        System.out.print("\n ");
        for (int i = myarray.length - 1; i >= 0; i--) {
            System.out.print("\t" + myarray[i]);
        }
        System.out.print("\n ");
    }

}
