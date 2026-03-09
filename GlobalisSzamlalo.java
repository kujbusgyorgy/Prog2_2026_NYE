class Student {

    static int studentCount = 0;

    Student() {
        studentCount++;
    }

    static void printStudentCount() {
        System.out.println("Létrehozott diákok száma: " + studentCount);
    }
}

public class GlobalisSzamlalo {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        Student.printStudentCount();
    }
}