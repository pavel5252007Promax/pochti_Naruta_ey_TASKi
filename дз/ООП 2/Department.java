public class Department {
    private String departmentName;
    private String headOfDepartment;
    private String officeRoom;
    private String email;
    private String phoneNumber;
    private double budget;
    private static int totalDepartments = 0;
    private static final int UNIVERSITY_BUDGET = 500;

    public Department() {
        this("Свин", "Пеппыч", "520", "psina@zalupa.com", "+790055555", 1000.2);
    }

    public Department(String departmentName, String headOfDepartment) {
        this(departmentName, headOfDepartment, "520", "psina@zalupa.com", "+790055555", 3000.2);
    }

    public Department(String departmentName, String headOfDepartment, String officeRoom, String email, String phoneNumber, double budget) {
        this.departmentName = departmentName;
        this.headOfDepartment = headOfDepartment;
        this.officeRoom = officeRoom;
        this.email = email;
        this.budget = budget;
        this.phoneNumber = phoneNumber;
    }

    public void setEmail() {
        if (email.matches("[A-Za-zа-яА-Я0-9.,-]+@[A-Za-zа-яА-Я0-9,.-]{3,}")) {
            System.out.println("Иба чоткй имайлчик");
            this.email = email;
        } else {
            System.out.println("Имайл фуфло");
        }

    }

    public String getEmail() {
        return email;
    }

    public void setBudgetl() {
        if (budget < 0) {
            System.out.println("А че бюджет то отррицательный");
        } else {
            this.budget = budget;
        }
    }

    public double getBudget() {
        return budget;
    }

    public void setPhoneNumber() {
        if (this.phoneNumber.matches("[0-9]")) {
            System.out.println("номер заебатый");
        } else {
            System.out.println("Номер вери бэд и вообще не корректен");
        }
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void contact() {
        System.out.println("Контакты: Номер телефона - " + this.phoneNumber + "Почта - " + this.email);
    }

    public void contact(String message) {
        contact();
        System.out.println("На твой телефон пришло новое сообщение: " + message);
    }

    public void allocateBudget(double amount) {
        if (this.budget >= amount) {
            System.out.println("отложено ровно " + amount);
        } else {
            System.out.println("Кафедра сосет палец");
        }
    }

    public void allocateBudget(double amount, String purpose) {
        System.out.println("На цель " + purpose + " необходимо " + amount);
        allocateBudget(amount);

    }

}

