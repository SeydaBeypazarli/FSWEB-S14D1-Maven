package com.workintech.developers;

public class JuniorDeveloper extends Employee {
    public JuniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(getSalary() + 1000); // JuniorDeveloper için maaş artışı
        System.out.println("JuniorDeveloper " + getName() + " kod yazıyor.");
    }

}
