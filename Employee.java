package ru.geekbrains.lesson3.task2;

public abstract class Employee implements Comparable<Employee> {

    protected String name;
    protected String surname;
    protected double salary; // Ставка заработной платы
    protected int age;
    protected String role;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String surname, String name, double salary, int age, String role) {
        this.surname = surname;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.role = role;
    }

    /**
     * Расчет среднемесячной заработной платы
     * @return
     */
    public abstract double calculateSalary();
    public abstract String toString();

    @Override
    public int compareTo(Employee o) {
        int res = surname.compareTo(o.surname);
        if (res == 0){
            return this.name.compareTo(o.name);
        }
        return res;
    }
}