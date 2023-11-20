package academy.devdojo.javaoneforall.introduction;

public class Class08MultidimensionalArrays02 {
    public static void main(String[] args) {
        int[][] baseArray = new int[3][3];
        int[] number = {1,2,3,4,5,6,7,8,9,10};
        baseArray[0] = new int[]{1,2,3,4,5};
        baseArray[1] = number;
        baseArray[2] = new int[]{1,2,3,4,5,6};

        int[][] baseArray2 = {{1,2},{1,2,3,4},{1,2,3,4,5}};


        for (int[] numbers : baseArray) {
            System.out.println("\n------");
            for (int num : numbers) {
                System.out.println(num);
            }
        }
    }
}
