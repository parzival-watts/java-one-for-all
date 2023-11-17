package academy.devdojo.javaoneforall.introduction;

public class Class06LoopStatements01 {
    public static void main(String[] args) {
        // while, do-while, for
        int counter = 0;

        while (counter < 10){
            System.out.println(counter);
            counter++;
        }

        do {
            System.out.println(counter);
        }while (counter < 10);

        for (int i = 0;i < 10 ;i++){
            System.out.println("Inside FOR" + i);
        }
    }
}
