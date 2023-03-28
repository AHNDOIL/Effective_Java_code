package Item13;

public class Student implements Cloneable{

    String name;
    String id;
    double total_score;

    public Student(String name, String id, double total_score){
        this.name = name;
        this.id = id;
        this.total_score = total_score;
    }

    @Override
    public String toString() {
        return "이름: " + name + ", 학번: " + id + ", 총 학점: " + total_score;
    }

//    @Override
//    public Object clone() throws CloneNotSupportedException{
//        return new Student(this.name, this.id, this.total_score);
//    }

//    @Override
//    public Student clone() throws CloneNotSupportedException{
//        return (Student) super.clone();
//    }

    public Student(Student other){
        this.name = other.name;
        this.id = other.id;
        this.total_score = other.total_score;
    }

    public static Student copy(Student other){
        return new Student(other.name, other.id, other.total_score);
    }

    public static void main(String[] args) throws CloneNotSupportedException{
        Student A = new Student("튜브", "0001", 4.5);
        //Student B = A.clone(); //Object 타입의 clone을 호출 하므로 형변환 해줘야함
        //Student B = new Student(A);
        Student B = copy(A);

        System.out.println(A);
        System.out.println(B);
    }
}
