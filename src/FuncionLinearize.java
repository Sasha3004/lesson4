public class FuncionLinearize {
    public static void main(String[] args) {

        int[][] array = {{1, 2, 3},
                {6, 7, 8}};
        int[] arrayNew = new int[6];
        int variable = 0;

        getTransformationTwoInOne(array, arrayNew, variable);
    }

    private static void getTransformationTwoInOne(int[][] array, int[] arrayNew, int variable) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                arrayNew[variable] = array[i][j];
                System.out.println(arrayNew[variable]);
                variable = ++variable;
            }
        }
    }
}

