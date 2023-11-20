package academy.devdojo.javaoneforall.javacore.Aintroductionclasses.test;

import academy.devdojo.javaoneforall.javacore.Aintroductionclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.name = "kami";
        professor.age = 30;
        professor.gender = 'M';

        System.out.println(professor.name);
        System.out.println(professor.age);
        System.out.println(professor.gender);
    }
}
