public class RepetitiveNamber {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 2, 3, 4, 4, 7, 4, 9};
        int[] array2 = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {

            getNamber(array1, array2, i);
            System.out.println(array2[i]);
        }

        System.out.println(array2[array1.length - 2] = array1[array1.length - 1]);

    }

    private static void getNamber(int[] array1, int[] array2, int i) {
        for (int a = i + 1; a < array1.length; a++) {
            if (array1[i] == array1[a]) {
                array2[i] = 0;

                break;
            } else array2[i] = array1[i];


        }
    }
}