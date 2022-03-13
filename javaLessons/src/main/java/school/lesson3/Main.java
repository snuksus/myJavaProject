package school.lesson3;

public class Main {
    public static void main(String[] args){
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Ivanov Ivan Ivanovich", "Engineer", "ivivan@mailbox.com",
                "892312312", 30000, 30);
        employeeArray[1] = new Employee("Petrov Petr Petrovich", "Developer", "pepetr@mailbox.com",
                "894124122", 35000, 35);
        employeeArray[2] = new Employee("Sidorov Michail Michailovich", "Chief", "chief@mailbox.com",
                "892777777", 45000, 45);
        employeeArray[3] = new Employee("Kovalev Sergey Sergeevich", "Driver", "driver@mailbox.com",
                "892350350", 25000, 25);
        employeeArray[4] = new Employee("Smirnova Galina Petrovna", "Accountant", "finance@mailbox.com",
                "892444444", 40000, 42);

        for (int i = 0; i< employeeArray.length; i++){
            if (employeeArray[i].getAge() > 40) {
                employeeArray[i].print();
            }
        }
    }
}
