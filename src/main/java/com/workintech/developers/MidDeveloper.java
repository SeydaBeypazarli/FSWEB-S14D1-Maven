package com.workintech.developers;

public class MidDeveloper extends Employee {
    public MidDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(getSalary() + 2000); // MidDeveloper için maaş artışı
        System.out.println("MidDeveloper " + getName() + " özellikler geliştiriyor.");
    }
}
