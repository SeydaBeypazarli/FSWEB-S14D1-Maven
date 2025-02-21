package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager (long id, String name, double salary){
        super(id,name,salary);
    }
    public HRManager(long id, String name, double salary, JuniorDeveloper[] juniorDevelopers, MidDeveloper[] midDevelopers, SeniorDeveloper[] seniorDevelopers) {
        this(id, name, salary);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }

    // Method to add JuniorDeveloper
    public void addEmployee( JuniorDeveloper juniorDeveloper) {
        for (int i = 0; i < juniorDevelopers.length; i++) {
            if (juniorDevelopers[i] == null) {
                juniorDevelopers[i] = juniorDeveloper;
                System.out.println("JuniorDeveloper " + juniorDeveloper.getName() + " " + i + ". indekse eklendi.");
                return;
            }
        }
        System.out.println("JuniorDeveloper için uygun bir indeks yok.");
    }

    // Method to add MidDeveloper
    public void addEmployee(MidDeveloper midDeveloper) {
        for (int i = 0; i < midDevelopers.length; i++) {
            if (midDevelopers[i] == null) {
                midDevelopers[i] = midDeveloper;
                System.out.println("MidDeveloper " + midDeveloper.getName() + " " + i + ". indekse eklendi.");
                return;
            }
        }
        System.out.println("MidDeveloper için uygun bir indeks yok.");
    }

    // Method to add SeniorDeveloper
    public void addEmployee( SeniorDeveloper seniorDeveloper) {
        for (int i = 0; i < seniorDevelopers.length; i++) {
            if (seniorDevelopers[i] == null) {
                seniorDevelopers[i] = seniorDeveloper;
                System.out.println("SeniorDeveloper " + seniorDeveloper.getName() + " " + i + ". indekse eklendi.");
                return;
            }
        }
        System.out.println("SeniorDeveloper için uygun bir indeks yok.");
    }
}