package ru.geekbrains.lesson3.task2;

public class Worker extends Employee {

    public Worker(String name, String surname, double salary, int age, String role) {
        super(name, surname, salary, age, role);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Должность: %s; %d лет; Среднемесячная заработная плата (фиксированная месячная оплата): %.2f (руб.)",
                this.surname, this.name, this.role, this.age, calculateSalary());
    }
}
