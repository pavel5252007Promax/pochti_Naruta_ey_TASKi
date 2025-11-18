import java.util.Scanner;

public class Studentt {
    private String studentId;
    private String firstName;
    private String lastName;
    private int age;
    private double averageGrade;
    private String faculty;
    private Scanner myScanner = new Scanner(System.in);
    private static int totalStudents = 0;
    private static final String UNIVERSITY_NAME = "ЧМO";


    public Studentt() {
        this("52", "Cola", "Peppa", 14, 2.5, "Ferma");
    }

    public Studentt(String studentId, String firstName, String lastName, int age) {
        this(studentId, firstName, lastName, age, 4.5, "Сельское хозяйство");
    }

    public Studentt(String studentId, String firstName, String lastName, int age, double averageGrade, String faculty) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.averageGrade = averageGrade;
        this.faculty = faculty;
        totalStudents += 1;
    }

    public int getTotalStudents() {
        return totalStudents;
    }

    public void setAge(int age) {
        while (age < 16 || age > 70) {
            System.out.println("Введи нормальный возраст");
            age = myScanner.nextInt();
        }
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setAverageGrade(double averageGrade) {
        if (averageGrade >= 0.0 && averageGrade <= 5.0) {
            this.averageGrade = averageGrade;
        } else {
            System.out.println("Ввобще не корректный балл");
        }
    }

    public double getAverageGrade() {
        return this.averageGrade;
    }

    public void setStudentId(String studentId) {
        if (studentId != "" && studentId != null) {
            this.studentId = studentId;
        } else {
            System.out.println("Ам со сорри некорректный номер");
        }
    }

    public String getStudentId() {
        return this.studentId;
    }

    public void displayInfo() {
        System.out.println("Номер билета - " + this.studentId);
        System.out.println("Имя школьника - " + this.firstName);
        System.out.println("Фамилия школьника - " + this.lastName);
    }

    public void displayInfo(boolean detailed) {
        if (detailed) {
            System.out.println("Номер билета - " + this.studentId);
            System.out.println("Имя школьника - " + this.firstName);
            System.out.println("Фамилия школьника - " + this.lastName);
            System.out.println("Возраст школьника - " + this.age);
            System.out.println("СР балл школьника - " + this.averageGrade);
            System.out.println("Факультет школьника - " + this.faculty);
        } else {
            displayInfo();
        }
    }

    public void updateGrade(double newGrade) {
        setAverageGrade(newGrade);
    }

    public void updateGrade(double newGrade, String subject) {
        updateGrade(newGrade);
        System.out.println("Ср балл по " + subject + "равен " + averageGrade);
    }
}
