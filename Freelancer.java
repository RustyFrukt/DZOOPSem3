package ru.geekbrains.lesson3.task2;

// 20 * 8

/**
 * TODO: Спроектировать класс Freelancer самостоятельно в рамках домашнего задания
 */
public class Freelancer extends Employee {
    private int workHoursInThisMonth;
    public Freelancer(String name, String surname, double salary, int age, String role, int workedHours) {
        super(name, surname, salary, age, role);
        this.workHoursInThisMonth = workedHours;
    }

    @Override
    public double calculateSalary() {
        return workHoursInThisMonth * salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Должность: %s; %d лет; Оплата за час: %.2f (руб.); Оплата за месяц(отработал %d часов): %.2f (руб.)",
                this.surname, this.name, this.role, this.age, this.salary, this.workHoursInThisMonth, this.calculateSalary());
    }
}