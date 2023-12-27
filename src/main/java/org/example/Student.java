package org.example;

// Поля класу
public class Student {
    private String name; // Ім'я студента
    private int age; // Вік студента
    private int course; // Курс, на якому навчається студент
    private String specialty;  // Спеціальність студента
    private double averageScore; // Середній бал студента

    /**
     * Конструктор класу Student.
     *
     * @param name Ім'я студента.
     * @param age Вік студента.
     * @param course Курс, на якому навчається студент.
     * @param specialty Спеціальність студента.
     * @param averageScore Середній бал студента.
     */
    public Student(String name, int age, int course, String specialty, double averageScore) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.specialty = specialty;
        this.averageScore = averageScore;
    }

    // Гетери та сетери
    /**
     * Повертає ім'я студента.
     *
     * @return Ім'я студента.
     */
    public String getName() {
        return name;
    }

    /**
     * Повертає вік студента.
     *
     * @return Вік студента.
     */
    public int getAge() {
        return age;
    }

    /**
     * Повертає курс студента.
     *
     * @return Курс студента.
     */
    public int getCourse() {
        return course;
    }

    /**
     * Повертає спеціальність студента.
     *
     * @return Спеціальність студента.
     */
    public String getSpecialty() {
        return specialty;
    }

    /**
     * Повертає середній бал студента.
     *
     * @return Середній бал студента.
     */
    public double getAverageScore() {
        return averageScore;
    }

    /**
     * Встановлює нове ім'я студента.
     *
     * @param name Нове ім'я студента.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Встановлює новий вік студента.
     *
     * @param age Новий вік студента.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Встановлює новий курс студента.
     *
     * @param course Новий курс студента.
     */
    public void setCourse(int course) {
        this.course = course;
    }

    /**
     * Встановлює нову спеціальність студента.
     *
     * @param specialty Нова спеціальність студента.
     */
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    /**
     * Встановлює новий середній бал студента.
     *
     * @param averageScore Новий середній бал студента.
     */
    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }
}