
public class DoubleItems {
    // - Create an array variable named `ag`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Double all the values in the array

    public static void main(String[] args) {

        int[] ag = {3, 4, 5, 6, 7};

        for (int i = 0; i < ag.length; i++) {

            ag[i] *= 2;

        }

        for (int number:ag) {
            System.out.println(number);
        }

    }
}
