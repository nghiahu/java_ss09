package baitap.bai10;

import java.util.Scanner;

public class Student {
    public enum Gender{
        MALE, FEMALE, OTHER
    }
    int id;
    String name;
    int age;
    Gender gender;
    String address;
    String phoneNumber;

    public Student(){
        this.id = 0;
        this.name = "";
        this.age = 0;
        this.gender = Gender.OTHER;
        this.address = "";
        this.phoneNumber = "";
    }
    public Student(int id, String name, int age, Gender gender, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void input(Scanner scanner){
        System.out.print("Nhập id sinh viên: ");
        this.id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập tên sinh viên: ");
        this.name = scanner.nextLine();
        System.out.print("Nhập tuổi sinh viên: ");
        this.age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập giới tính sinh viên: ");
        this.gender = (Gender.valueOf(scanner.nextLine().toUpperCase()));
        System.out.print("Nhập địa chỉ sinh viên: ");
        this.address = scanner.nextLine();
        System.out.print("Nhập số điện thoại sinh viên: ");
        this.phoneNumber = scanner.nextLine();
    }
    public void displayData(){
        System.out.println("Id: " + id);
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + gender);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Số điện thoại: " + phoneNumber);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] student = new Student[100];
        int index = 0;
        do{
            System.out.println("================MENU===================");
            System.out.println("1. Hiển thị danh sách tất cả sinh viên");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3. Sửa thông tin sinh viên dựa trên mã sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    for(int i = 0; i < index; i++){
                        System.out.println("Thông tin sinh viên: " + i+1);
                        student[i].displayData();
                    }
                   break;
                case 2:
                    System.out.println("Nhập thông tin sinh viên mới");
                    student[index] = new Student();
                    student[index].input(scanner);
                    index++;
                    break;
                case 3:
                    System.out.print("Nhập mã sinh viên cần sửa: ");
                    int idFix = scanner.nextInt();
                    for(int i = 0; i < index; i++){
                        if(student[i].id == idFix){
                            student[i].displayData();
                        }
                    }
                    break;
                case 4:
                    System.out.println("Nhập mã sinh viên cần xóa: ");
                    int idDeL = scanner.nextInt();
                    int indexDeL = 0;
                    for(int i = 0; i < index; i++){
                        if(student[i].id == idDeL){
                            indexDeL = i;
                        }
                    }
                    for(int i = indexDeL; i < index - 1; i++){
                        if(student[i].id == idDeL){
                            student[i] = student[i+1];
                        }
                    }
                    index--;
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ vui lòng chọn lại!");
            }
        }while (true);
    }
}
