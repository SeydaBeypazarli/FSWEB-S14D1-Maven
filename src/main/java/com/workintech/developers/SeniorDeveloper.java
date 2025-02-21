package com.workintech.developers;

public class SeniorDeveloper extends Employee {
    public SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(getSalary() + 3000); // SeniorDeveloper için maaş artışı
        System.out.println("SeniorDeveloper " + getName() + " mentorluk yapıyor.");
    }
}
