package academy.devdojo.javaoneforall.introduction;

public class Class05ConditionalStatement02 {
    public static void main(String[] args) {
        // age < 15 category junior
        // age >= 15 && age < 18 category senior
        // age >= 18 category master
        int age = 15;
        String category;
        if (age < 15){
            category = "Category Junior";
        }else if (age >= 15 && age < 18){
            category = "Category senior";
        }else {
            category = "Category master";
        }
        category = age < 15 ? "Category Junior" : age >= 15 && age < 18 ? "Category senior" : "Category master";
        System.out.println(category);
    }
}
