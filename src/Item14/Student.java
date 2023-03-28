package Item14;

import java.util.Arrays;
import java.util.Comparator;

public class Student implements Comparable<Student>{

    String name;
    String id;
    double major_score;
    double general_score;
    double total_score;

    public Student(String name, String id,  double major_score, double general_score, double total_score){
        this.name = name;
        this.id = id;
        this.major_score = major_score;
        this.general_score = general_score;
        this.total_score = total_score;
    }

    @Override
    public String toString() {
        return "이름: " + name + ", 학번: " + id + ", 전공학점: " + major_score +
                ", 교양학점: " + general_score + ", 총 학점: " + total_score;
    }


    public static final Comparator<Student> COMPARATOR =
            Comparator.comparingDouble((Student o) -> o.major_score)
                    .thenComparingDouble(o ->o.general_score);

    @Override
    public int compareTo(Student o){
        return COMPARATOR.compare(this, o);
    }




    public static void main(String args[]){

        Student[] students = new Student[4];
        students[0] = new Student("라이언", "0001", 4.3, 3.7, 4);
        students[1] = new Student("제이지", "0002", 4.0, 4.1, 4.05);
        students[2] = new Student("어피치", "0003", 3.2, 3.6, 3.4);
        students[3] = new Student("춘식이", "0004", 3.2, 3.8, 3.5);

        Arrays.sort(students);

        for(int i=0; i<students.length; i++){
            System.out.println(students[i].toString());
        }

        System.out.println("##################");


        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s1.total_score, s2.total_score);
            }
        };


        Arrays.sort(students, comparator);

        for(int i=0; i<students.length; i++){
            System.out.println(students[i].toString());
        }
    }
}
