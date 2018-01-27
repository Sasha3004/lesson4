public class TwoMassivs {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 6, 7};
        int[] array3 = new int[array1.length + array2.length];
        int namberElement = 0;
        for (int i = 0; i < array3.length - 1; i++) {
            namberElement = getSumArrays(array1, array2, array3, namberElement, i);
        }


    }

    private static int getSumArrays(int[] array1, int[] array2, int[] array3, int a, int i) {
        if (i < array2.length) {
            array3[a] = array1[i];
            System.out.println(array3[a]);
            ++a;
            array3[a] = array2[i];
            System.out.println(array3[a]);
            ++a;
        } else {
            array3[a] = array1[i];
            System.out.println(array3[a]);
            if (a < array3.length-1) {
                ++a;
            }

        }
        return a;
    }

}
