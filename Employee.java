public class Employee {

    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }

    String getPosition() {
        return position;
    }

    int getSalary() {
        return salary;
    }

    String getEmail() {
        return email;
    }

    String getPhone() {
        return phone;
    }

    void showInfo() {
        System.out.printf(" Имя: %s%n Позиция: %s%n Почта: %s%n Номер телефона: %s%n Зарплата: %s%n Возраст: %s%n", name, position, email, phone, salary, age
        );

    }


}
