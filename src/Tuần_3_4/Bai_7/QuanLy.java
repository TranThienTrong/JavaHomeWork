package Tuần_3_4.Bai_7;

import java.util.*;

public class QuanLy {

    List<Person> people = new ArrayList<Person>();

    public QuanLy() {
    }

    void add(Person person) {
        people.add(person);
    }

    void remove(String name) {
        for (int i = 0; i <= people.size(); i++) {
            if (people.get(i).getHoTen() == name)
                people.remove(people.get(i));
        }
    }

    void sort(List<String> people) {
        Collections.sort(people);
    }


    public static void main(String[] args) {
        Employee employee = new Employee();
        Student student = new Student();
        QuanLy quanLy = new QuanLy();
        quanLy.add(employee);
        quanLy.add(student);
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        int i = in.nextInt();
        switch (i) {
            case 1:
                student.setHoTen(name);
            case 2:
                employee.setHoTen(name);
        }
    }
}
