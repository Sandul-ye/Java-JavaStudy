package com.sandul.manager_system_second.main_app;


import com.sandul.manager_system_second.domain.Student;
import com.sandul.manager_system_second.domain.Teacher;
import com.sandul.manager_system_second.utils.Utils;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Teacher> teachers = new ArrayList<>();


        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎来到校园管理系统!");
        while (true) {
            System.out.println("1.学员信息管理 2.教师信息管理 3.退出系统");
            System.out.println("请输入你的选择:");
            switch (sc.next()) {
                case "1":
                    System.out.println("欢迎来到学员信息管理系统!");
                    studentManager(students, sc);
                    break;
                case "2":
                    System.out.println("欢迎来到教师信息管理系统!");
                    teacherManager(teachers, sc);
                    break;
                case "3":
                    System.out.println("感谢您的使用!再见!");
                    return;
                default:
                    System.out.println("输入有误!请重新输入!");
                    break;
            }
        }
    }

    public static void studentManager(ArrayList<Student> students, Scanner sc) {
        while (true) {
            System.out.println("1.添加新成员 2.修改成员 3.删除成员 4.查询成员 5.返回上一级菜单");
            switch (sc.next()) {
                case "1":
                    addStudent(students, sc);
                    break;
                case "2":
                    revampStudent(students, sc);
                    break;
                case "3":
                    deleteStudent(students, sc);
                    break;
                case "4":
                    findStudent(students, sc);
                    break;
                case "5":
                    return;
                default:
                    System.out.println("输入有误!");
                    break;
            }
        }
    }

    public static void findStudent(ArrayList<Student> students, Scanner sc) {
        if (students.size()==0){
            System.out.println("暂无数据,请添加数据后再进行操作!");
            return;
        }
        Utils.printArrayList(students);
    }

    public static void deleteStudent(ArrayList<Student> students, Scanner sc) {
        if (students.size() == 0) {
            System.out.println("暂无数据,请添加数据后再进行操作!");
            return;
        }
        System.out.println("请输入要删除的成员的ID:");
        int input = sc.nextInt();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == input) {
                System.out.println("确定要删除吗?(y/n)");
                switch (sc.next()) {
                    case "y":
                        students.remove(students.get(i));
                        System.out.println("删除成功!");
                        return;
                    case "n":
                        System.out.println("删除操作已取消!");
                        return;
                    default:
                        System.out.println("输入有误!删除操作失败!");
                        break;
                }

            }

        }
        System.out.println("输入有误!没有查询到此ID!");
    }

    public static void revampStudent(ArrayList<Student> students, Scanner sc) {
        if (students.size() == 0) {
            System.out.println("暂无数据,请添加成员后再进行操作!");
            return;
        }
        System.out.println("请输入要更改的成员的ID:");
        int input = sc.nextInt();
        for (int i = 0; i < students.size(); i++) {
            if (input == students.get(i).getId()) {
                while (true) {
                    System.out.println("1.修改姓名;2.修改性别;3.修改生日日期;4.返回上一层菜单");
                    switch (sc.next()) {
                        case "1":
                            System.out.println("请输入姓名:");
                            students.get(i).setName(sc.next());
                            System.out.println("姓名修改成功!");
                            break;
                        case "2":
                            System.out.println("请输入姓别:");
                            students.get(i).setGender(sc.next().charAt(0));
                            System.out.println("姓别修改成功!");
                            break;
                        case "3":
                            System.out.println("请输入新的生日日期(yyyy-MM-dd):");
                            students.get(i).setBirthDay(sc.next());
                            System.out.println("生日日期修改成功!");
                            break;
                        case "4":
                            return;
                        default:
                            System.out.println("输入有误,请重新输入!");
                            break;
                    }
                }
            }
        }
        System.out.println("输入有误!没有此ID信息!");
    }

    public static void teacherManager(ArrayList<Teacher> teachers, Scanner sc) {
        while (true) {
            System.out.println("1.添加新成员 2.修改成员 3.删除成员 4.查询成员 5.返回上一级菜单");
            switch (sc.next()) {
                case "1":
                    addPerson(teachers, sc);
                    break;
                case "2":
                    revampPerson(teachers, sc);
                    break;
                case "3":
                    deletePerson(teachers, sc);
                    break;
                case "4":
                    findPerson(teachers, sc);
                    break;
                case "5":
                    return;
                default:
                    System.out.println("输入有误!");
                    break;
            }
        }
    }

    public static void findPerson(ArrayList<Teacher> teachers, Scanner sc) {
        if (teachers.size() == 0) {
            System.out.println("暂无数据,请添加数据之后再查询!");
            return;
        }
        Utils.printArrayList(teachers);
    }

    public static void deletePerson(ArrayList<Teacher> teachers, Scanner sc) {
        if (teachers.size() == 0) {
            System.out.println("暂无数据,请添加数据后在操作!");
            return;
        }
        System.out.println("请输入您要删除的成员的ID:");
        int input = sc.nextInt();
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getId() == input) {
                Utils.printPerson(teachers.get(i));
                while (true) {
                    System.out.println("是否确认删除?(y/n)");
                    switch (sc.next()) {
                        case "y":
                            teachers.remove(teachers.get(i));
                            System.out.println("删除成功!");
                            return;
                        case "n":
                            System.out.println("取消删除操作成功!");
                            return;
                        default:
                            System.out.println("输入有误!操作不成功!");
                            break;
                    }
                }
            }
        }
    }

    public static void revampPerson(ArrayList<Teacher> teachers, Scanner sc) {
        if (teachers.size() == 0) {
            System.out.println("暂无数据,请添加数据后再操作!");
            return;
        }
        System.out.println("请输入你要修改的成员ID:");
        int input = sc.nextInt();
        for (int i = 0; i < teachers.size(); i++) {
            if (input == teachers.get(i).getId()) {
                while (true) {
                    System.out.println("1.修改姓名;2.修改性别;3.修改生日日期;4.返回上一层菜单");
                    switch (sc.next()) {
                        case "1":
                            System.out.println("请输入新的姓名:");
                            teachers.get(i).setName(sc.next());
                            System.out.println("姓名修改成功!");
                            break;
                        case "2":
                            System.out.println("请输入新的姓别:");
                            teachers.get(i).setGender(sc.next().charAt(0));
                            System.out.println("姓别修改成功!");
                            break;
                        case "3":
                            System.out.println("请输入新的生日日期(yyyy-MM-dd):");
                            teachers.get(i).setBirthDay(sc.next());
                            System.out.println("生日日期修改成功!");
                            break;
                        case "4":

                            return;
                        default:
                            System.out.println("输入有误,请重新输入!");
                            break;

                    }
                }
            }
        }
    }

    public static void addPerson(ArrayList<Teacher> teachers, Scanner sc) {
        //添加新成员
        System.out.println("请输入新成员的姓名:");
        String name = sc.next();
        System.out.println("请输入新成员的性别(男/女):");
        char gender = sc.next().charAt(0);
        System.out.println("请输入新成员的生日(yyyy-MM-dd):");
        String birthDate = sc.next();
        teachers.add(new Teacher(++Utils.teaID, name, gender, birthDate));
        System.out.println(name + "添加成功");

    }

    public static void addStudent(ArrayList<Student> students, Scanner sc) {
        //添加新成员
        System.out.println("请输入新成员的姓名:");
        String name = sc.next();
        System.out.println("请输入新成员的性别(男/女):");
        char gender = sc.next().charAt(0);
        System.out.println("请输入新成员的生日(yyyy-MM-dd):");
        String birthDate = sc.next();
        students.add(new Student(++Utils.stuID, name, gender, birthDate));
        System.out.println(name + "添加成功");

    }
}
