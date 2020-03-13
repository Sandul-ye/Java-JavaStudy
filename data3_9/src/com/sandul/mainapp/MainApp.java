package com.sandul.mainapp;

import com.sandul.domain.Person;
import com.sandul.domain.Student;
import com.sandul.domain.Teacher;
import com.sandul.utils.Utils;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("欢迎来到校园管理系统!");
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>(); //学生管理系统数据库
        ArrayList<Teacher> teachers = new ArrayList<>(); //教师管理系统数据库
        while (true) {
            System.out.println("1.学生管理系统    2.教师管理系统    3.退出校园管理系统");
            switch (sc.next()) {
                case "1":
                    // 学生管理系统
                    studentsManagerSystem(students, sc);
                    break;
                case "2":
                    //教师管理系统
                    teachersManagerSystem(teachers, sc);
                    break;
                case "3":
                    //退出校园管理系统
                    return;
                default:
                    System.out.println("输入错误!");
                    break;

            }
        }
    }

    public static void teachersManagerSystem(ArrayList<Teacher> teachers, Scanner sc) {
        System.out.println("欢迎来到教师管理子系统!");
        while (true) {
            System.out.println("1.增加新教师  2.修改教师信息  3.删除教师信息  4.查询教师信息  5.退出子系统");
            switch (sc.next()) {
                case "1":
                    addTeacher(teachers, sc);
                    break;
                case "2":
                    changeStudent(teachers, sc);
                    break;
                case "3":

                    deleteStudent(teachers, sc);
                    break;
                case "4":
                    findStudent(teachers);
                    break;
                case "5":
                    return;
                default:
                    System.out.println("输入有误!");
                    break;

            }
        }
    }

    public static void addTeacher(ArrayList<Teacher> teachers, Scanner sc) {

        System.out.println("请输入姓名;");
        String name = sc.next();
        System.out.println("请输入性别(男/女):");
        char gender = sc.next().charAt(0);
        System.out.println("请输入生日日期(yyyy-MM-dd)");
        String birthDate = sc.next();
        teachers.add(new Teacher(++Utils.tID, name, gender, birthDate));
        System.out.println("添加姓名为:" + name + "进入系统成功!");
    }

    public static void studentsManagerSystem(ArrayList<Student> students, Scanner sc) {
        System.out.println("欢迎来到学生管理子系统!");
        while (true) {
            System.out.println("1.增加新学生  2.修改学生信息  3.删除学生信息  4.查询学生信息  5.退出子系统");
            switch (sc.next()) {
                case "1":
                    addStudent(students, sc);
                    break;
                case "2":
                    changeStudent(students, sc);
                    break;
                case "3":

                    deleteStudent(students, sc);
                    break;
                case "4":
                    findStudent(students);
                    break;
                case "5":
                    return;
                default:
                    System.out.println("输入有误!");
                    break;

            }
        }
    }

    public static void deleteStudent(ArrayList<? extends Person> students, Scanner sc) {
        if (students.size() == 0) {
            System.out.println("系统中没有数据!请添加数据后进行操作!");
            return;
        }
        System.out.println("请输入您要删除的ID:");  //系统有数据,那么判断系统中是否有输入的数据
        int input = sc.nextInt();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == input) {   //系统中找到对应的数据
                Utils.printPerson(students.get(i));
                System.out.println("确定删除此ID的信息吗?(y/n)");
                switch (sc.next()) {
                    case "y":
                        students.remove(students.get(i));
                        System.out.println("删除成功!");
                        return;
                    case "n":
                        System.out.println("修改操作已取消!");
                        return;
                    default:
                        System.out.println("输入有误!操作失败!");
                        return;
                }

            }
        }
        System.out.println("系统中没有此ID!");

    }

    public static void changeStudent(ArrayList<? extends Person> students, Scanner sc) {
        if (students.size() == 0) {
            System.out.println("系统中没有数据!请添加数据后进行操作!");
            return;
        }

        System.out.println("请输入您要修改的ID:");  //系统有数据,那么判断系统中是否有输入的数据
        int input = sc.nextInt();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == input) {   //系统中找到对应的数据
                Utils.printPerson(students.get(i));
                System.out.println("确定修改此ID的信息吗?(y/n)");
                switch (sc.next()) {
                    case "y":
                        System.out.println("1.修改姓名  2.修改性别  3.修改生日日期    4.返回上一层菜单");
                        switch (sc.next()) {
                            case "1":
                                changeName(students.get(i), sc);
                                break;
                            case "2":
                                changeGender(students.get(i), sc);
                                break;
                            case "3":
                                changeBirthDay(students.get(i), sc);
                                break;
                            case "4":
                                return;
                            default:
                                System.out.println("输入有误!");
                                break;

                        }
                        return;
                    case "n":
                        System.out.println("修改操作已取消!");
                        return;
                    default:
                        System.out.println("输入有误!操作失败!");
                        return;
                }

            }
        }

        System.out.println("系统中没有此ID!");

    }

    public static void changeBirthDay(Person person, Scanner sc) {
        System.out.println("请输入修改后的生日日期(yyyy-MM-dd):");
        person.setBirthDate(sc.next());
        System.out.println("生日日期: " + person.getBirthDate() + "   修改成功!");
    }

    public static void changeGender(Person person, Scanner sc) {
        System.out.println("请输入修改后的姓别:");
        person.setGender(sc.next().charAt(0));
        System.out.println("姓别: " + person.getGender() + "   修改成功!");
    }

    public static void changeName(Person person, Scanner sc) {
        System.out.println("请输入修改后的姓名:");
        person.setName(sc.next());
        System.out.println("姓名: " + person.getName() + "   修改成功!");
    }

    public static void findStudent(ArrayList<? extends Person> students) {
        if (students.size() == 0) {
            System.out.println("系统中没有数据!请添加数据后进行操作!");
            return;
        }
        Utils.printArrayList(students);
    }

    public static void addStudent(ArrayList<Student> students, Scanner sc) {
        System.out.println("请输入要添加的学生姓名:");
        String name = sc.next();
        System.out.println("请输入要添加的学生性别(男/女):");
        char gender = sc.next().charAt(0);
        System.out.println("请输入要添加的学生的生日日期(yyyy-MM-dd):");
        String birthDate = sc.next();
        students.add(new Student(++Utils.sID, name, gender, birthDate));
        System.out.println("姓名为:" + name + "的学生添加系统成功!");
    }

}
