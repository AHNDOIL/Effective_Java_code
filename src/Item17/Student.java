package Item17;


public class Student {
    private String name;
    private Address address;

    public Student(String name, Address address){
        this.name = name;
        //this.address = address;
        this.address = new Address(address.getAddr());
    }


    public static void main(String[] args){
        Address address = new Address();
        address.setAddr("address1");
        //Student에서 address를 직접 참조
        Student student = new Student("lion", address);
        String before = student.getAddress().getAddr();

        //address를 수정
        address.setAddr("address2");
        //변경 후의 Student의 address
        String after = student.getAddress().getAddr();

        System.out.println(before.toString());
        System.out.println(after.toString());
    }


    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}

class Address{
    private String addr;

    public Address() {
    }

    public Address(String addr) {
        this.addr = addr;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}