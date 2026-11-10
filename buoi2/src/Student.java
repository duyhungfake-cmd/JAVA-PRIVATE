public class Student {
    String studentId;
    String name;
    int age;
    Car car;

    public Student(String studentId, String name, int age, Car car) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.car = car;
    }
    public String introduce() {
        return "Mình tên là " + name + ", " + age + " tuổi, đi xe " + car.getBrand() + ", biển số " + car.getLicensePlate() + ".";
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
