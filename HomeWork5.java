public class HomeWork5 {
    private static Object employee;

    public static void main(String[] args) {
        Employee[] emplArr = new Employee[5];
        createEmployees(emplArr);
        doSelection(emplArr);
        }

    static void createEmployees(Employee[] emplArr) {

        emplArr[0] = new Employee("Турчан Анна", "Генеральный директор", "aturchan@icloud.com", "89277193532", 650000, 31);
        emplArr[1] = new Employee("Турчан Максим", "Заместитель генерального директора", "mturchan@icloud.com", "89272056284", 450000, 32);
        emplArr[2] = new Employee("Бузова Ольга", "Уборщица", "kiska1020@mail.ru", "89277193532", 15000, 45);
        emplArr[3] = new Employee("Витязь Павел", "Менеджер", "chuvak@bk.ru", "89259681425", 102000, 27);
        emplArr[4] = new Employee("Николай Басков", "Повар", "naturblod@gmail.com", "89259009090", 40000, 65);
    }

    static void doSelection(Employee[] emplArr) {

        System.out.println("Сотрудники старше 40: ");

        for(Employee employee : emplArr) {
            if(employee.getAge() > 40) employee.showInfo();
            System.out.println();

        }

    }
}
