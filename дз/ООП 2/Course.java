public class Course {
    private String courseCode;
    private String courseName;
    private int maxStudents;
    private int currentStudents;
    private boolean isActive;
    private static int totalCourses;
    private static final int MAX_CREDITS_PER_SEMESTER = 30;

    public Course() {
        this("PEN IS", "RUS IS", 25, 20, true);
    }

    public Course(String courseCode, String courseName) {
        this(courseCode, courseName, 22, 33, true);
    }

    public Course(String courseCode, String courseName, int maxStudents, int currentStudents, boolean isActive) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.maxStudents = maxStudents;
        this.currentStudents = currentStudents;
        this.isActive = isActive;
        totalCourses += 1;
    }

    public void Validnost() {
        if (this.currentStudents > this.maxStudents) {
            System.out.println("Записанных лошар больше  епта");
        }
    }

    //1 з.е. = 36 академ.ч., 1 академ.ч. = 45 мин. 1 кредит = 36 академ.ч. Объем 1 уч.г = 60 кредитов
    public static void calculateWorkload(int credits) {
        int workLoad_hours = (credits * 36 * 45) / 30;
        if (credits >= MAX_CREDITS_PER_SEMESTER) {
            System.out.println("Студент успешно прошел 1 год обучения!");
        }
        System.out.println("Общая нагрузка составила: " + workLoad_hours + " ч.");
    }

    public void enrollStudent() {
        this.currentStudents++;
    }

    public void enrollStudent(String studentId) {
        enrollStudent();
        System.out.println("Данный студент по айдишнику " + studentId);
    }

    public void displayInfo() {
        System.out.println("Код курса " + courseCode);
        System.out.println("Название курса " + courseName);
    }

    public void displayInfo(boolean showAvailability) {
        if (showAvailability) {
            displayInfo();
        } else {
            System.out.println("Код курса " + courseCode);
            System.out.println("Название курса " + courseName);
            System.out.println("Макс колво студентов " + maxStudents);
            System.out.println("Текущее количество записанных  " + currentStudents);
            if (isActive) {
                System.out.println("Доступен");
            } else {
                System.out.println("не очень доступен");
            }
        }
    }

}
