package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Створення масиву студентів
        List<Student> students = Arrays.asList(
                new Student("Іван", 20, 3, "Комп'ютерні науки", 4.5),
                new Student("Марія", 19, 2, "Фізика", 4.8)
                // Додати інших студентів
        );

        // Сортування за середнім балом за зростанням
        Collections.sort(students, Comparator.comparingDouble(Student::getAverageScore));

        // Сортування за віком за спаданням
        Collections.sort(students, (s1, s2) -> s2.getAge() - s1.getAge());

        // Вивід відсортованого списку студентів
        for (Student s : students) {
            System.out.println(s.getName() + ", " + s.getAge() + " років, Середній бал: " + s.getAverageScore());
        }
    }
}