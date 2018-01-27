public class ShiftCycle {
    public static void main(String[] args) {

        int[] Array1 = {1, 2, 3, 4, 5, 6};
        int[] ChangeArray = new int[6];

        for (int i = 0; i < Array1.length; i++) {

            if (i == 0) {
                ChangeArray[0] = Array1[Array1.length - 1];
            } else {
                ChangeArray[i] = Array1[i - 1];
            }
            System.out.println(ChangeArray[i]);
        }

    }
}

