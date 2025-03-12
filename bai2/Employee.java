package baitap.bai2;

public class Employee {
    // Thuộc tính của lớp
    //Xác định các thuộc tính cơ bản: id, name, department, salary.
    int id;
    String name;
    String department;
    int salary;

    //Constructor
    //Viết constructor có tham số để khởi tạo thông tin nhân viên.
    public Employee(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    //Phương thức hiển thị thông tin(displayInfo())
    // Viết phương thức hiển thị thông tin nhân viên bao gồm: mã, tên và phòng ban.
    public void displayInfo(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
    //Getter và Setter
    //Viết getter và setter cho thuộc tính salary để thay đổi lương nếu cần.
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    // Phương thức tăng lương(increaseSalary(double percentage))
    //Viết phương thức để tăng lương nhân viên dựa trên phần trăm(percentage) nhập vào.
    public void increaseSalary(double percentage){
        salary += (int)(salary * percentage)/100;
    }
    // Khởi tạo và sử dụng đối tượng
    // Viết đoạn mã trong hàm main để tạo đối tượng nhân viên(Employment) và thực hiện các thao tác: hiển thị thông tin, tăng lương.
    public static void main(String[] args) {
        Employee employee1 = new Employee(1,"Nguyễn Văn B","Nhân sự",1000);
        employee1.displayInfo();
        employee1.increaseSalary(10);
        System.out.println("Lương nhân viên sau khi tăng: " + employee1.getSalary());
    }
}
