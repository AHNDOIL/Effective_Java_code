package Item12;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s (%d)", name, age);
    }


    public static Person fromString(String str) {
        // 문자열에서 이름과 나이 추출
        String[] parts = str.split(" \\(");
        String name = parts[0];
        int age = Integer.parseInt(parts[1].substring(0, parts[1].length() - 1));
        return new Person(name, age);
    }

    Person person = new Person("John Doe", 30);
    String str = person.toString();
    Person newPerson = Person.fromString(str);
}
