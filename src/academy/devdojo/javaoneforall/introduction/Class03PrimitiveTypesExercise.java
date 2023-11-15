package academy.devdojo.javaoneforall.introduction;

public class Class03PrimitiveTypesExercise {
    public static void main(String[] args) {
        String name = "Parzival";
        String address = "439 East District";
        float salary = 5340.21f;
        // dd/MM/yyyy
        String receivedSalaryDate = "14/11/2023";
        String report = "I " + name + ", living at " + address + ", confirm that I received the salary of " + salary + " on " + receivedSalaryDate;

        System.out.println(report);
    }
}
