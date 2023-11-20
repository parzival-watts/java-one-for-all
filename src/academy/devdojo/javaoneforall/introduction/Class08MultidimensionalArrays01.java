package academy.devdojo.javaoneforall.introduction;

public class Class08MultidimensionalArrays01 {
    public static void main(String[] args) {
        int[] days = new int[12];
//        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
//        for (int i = 0; i < myNumbers.length; ++i) {
//            for(int j = 0; j < myNumbers[i].length; ++j) {
//                System.out.println(myNumbers[i][j]);
//            }
//        }

        int[][] days2 = new int[3][3];

        for (int i = 0; i < days2.length; i++) {
            System.out.println(days2[i]);
            for (int j = 0; j < days2[i].length; j++) {
                System.out.println(days2[i][j]);
            }
        }

        System.out.println("-----------------------------------------------------------------------------------");
        for (int[] baseArray : days2) {
            System.out.println(baseArray);
            for (int day : baseArray) {
                System.out.println(day);
            }
        }

    }
}
