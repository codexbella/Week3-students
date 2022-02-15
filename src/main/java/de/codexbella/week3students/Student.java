package de.codexbella.week3students;

public class Student {
    private final String name;
    private final int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student: " +
                "name = '" + name + '\'' +
                ", id = " + id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

