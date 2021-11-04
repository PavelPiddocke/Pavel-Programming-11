
    //Main class to run program and display data from the other classes
public class Main {
    public static void main(String[] args) {

        //Create a new school called JO
        School JO = new School(2,"JO", 10);

        //create students
        Student Pavel = new Student("Pavel", "Piddocke", "A");
        Student AJ = new Student("AJ", "Bumble", "C");
        Student Duncan = new Student("Duncan", "Callaghan", "B");
        Student Gavin = new Student("Gavin", "Wong", "A");
        Student Edwin = new Student("Edwin", "Wong", "C");
        Student Joanna = new Student("Joanna", "Piddocke", "B");
        Student Bobby = new Student("Bobby", "Newhouse", "A");
        Student Teebone = new Student("Teebone", "Jackson", "C");
        Student Doncho = new Student("Doncho", "Donev", "F");
        Student Luca = new Student("Luca", "Breiddal", "F");

        //create teachers
        Teacher Laumen = new Teacher("T.", "Laumen", "Math");
        Teacher Lee = new Teacher("S.", "Lee", "Socials");
        Teacher Lau = new Teacher("I.", "Lau", "Science");


        //add 10 students to JO
        JO.addStudent(Pavel);
        JO.addStudent(AJ);
        JO.addStudent(Duncan);
        JO.addStudent(Gavin);
        JO.addStudent(Edwin);
        JO.addStudent(Joanna);
        JO.addStudent(Bobby);
        JO.addStudent(Teebone);
        JO.addStudent(Doncho);
        JO.addStudent(Luca);

        //add 3 teachers to JO
        JO.addTeacher(Laumen);
        JO.addTeacher(Lee);
        JO.addTeacher(Lau);

        //print out after additions of students and teachers to JO
        System.out.println(JO);
        System.out.println(JO.showTeachers());
        System.out.println(JO.showStudents());

        //remove 2 students from JO
        JO.removeStudent(Doncho);
        JO.removeStudent(Gavin);

        //remove 1 teacher from JO
        JO.removeTeacher(Laumen);


        //print out after removals of students and teacher from JO
        System.out.println();
        System.out.println(JO);
        System.out.println(JO.showTeachers());
        System.out.println(JO.showStudents());

    }
}
