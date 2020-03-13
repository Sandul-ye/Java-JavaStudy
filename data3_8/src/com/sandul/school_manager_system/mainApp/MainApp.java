package com.sandul.school_manager_system.mainApp;

import com.sandul.school_manager_system.bisic_class.Person;
import com.sandul.school_manager_system.bisic_class.Student;
import com.sandul.school_manager_system.bisic_class.Teacher;
import com.sandul.school_manager_system.utils.Utils;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        //学生集合
        ArrayList<Student> students = new ArrayList<>();
        //教师集合
        ArrayList<Teacher> teachers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.学员信息管理 2.教师信息管理 3.退出");
            //输入选择
            String userChoose = sc.next();
            switch (userChoose) {
                case "1":
                    System.out.println("欢迎进入学生管理系统!");
                    studentsManager(students, sc);
                    break;
                case "2":
                    System.out.println("欢迎进入教师管理系统!");
                    teacherManager(teachers, sc);
                    break;
                case "3":
                    System.out.println("欢迎再次使用校园综合系统!");
                    return;
                default:
                    System.out.println("输入有误!");
                    break;


            }
        }
    }

    public static void teacherManager(ArrayList<Teacher> teachers, Scanner sc) {
        //教师管理系统
        System.out.println("【教师信息管理】");
        while (true) {
            System.out.println("1.添加教员 2.修改教员 3.删除教员 4.查询教员 5.返回上一级");
            String userChoose = sc.next();
            switch (userChoose) {
                case "1":
                    System.out.println("添加教员");
                    addTeacher(teachers, sc);
                    break;
                case "2":
                    System.out.println("修改教员");
                    revampTeacher(teachers, sc);
                    break;
                case "3":
                    System.out.println("删除教员");
                    deleteTeacher(teachers, sc);
                    break;
                case "4":
                    System.out.println("查询教员");
                    findTeacher(teachers, sc);
                    break;
                case "5":
                    System.out.println("返回上一级");
                    return;
                default:
                    System.out.println("输入有误!请重新输入!");
                    break;
            }
        }
    }

    public static void findTeacher(ArrayList<Teacher> teachers, Scanner sc) {
        if (teachers.size() == 0) {
            System.out.println("系统中还没有添加信息!请添加信息后再操作!");
            return;
        }
        Utils.printArrayList(teachers);
    }

    public static void deleteTeacher(ArrayList<Teacher> teachers, Scanner sc) {
        if (teachers.size() == 0) {
            System.out.println("系统中还没有添加信息!请添加信息后再操作!");
            return;
        }
        System.out.println("请输入你要删除的教员的ID号:");
        int input = sc.nextInt();
        for (int i = 0; i < teachers.size(); i++) {
            if (input == teachers.get(i).getId()) {
                Teacher t = teachers.get(i);
                Utils.printPerson(teachers.get(i));
                System.out.println("是否确定删除此教员信息?(y/n)");
                switch (sc.next()) {
                    case "y":
                        teachers.remove(teachers.get(i));
                        System.out.println("删除ID为:" + t.getId() + "的教员成功!");
                        return;
                    case "n":
                        System.out.println("取消操作成功!");
                        return;
                    default:
                        System.out.println("输入有误!");
                        return;
                }
            }
        }
        System.out.println("没有查询到此ID!请重新输入!");

    }

    public static void revampTeacher(ArrayList<Teacher> teachers, Scanner sc) {
        if (teachers.size() == 0) {
            System.out.println("系统中没有数据,请添加数据之后再操作!");
            return;
        }
        System.out.println("请输入你要修改的教员ID号码:");
        int input = sc.nextInt();
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getId() == input) {
                Utils.printPerson(teachers.get(i));
                while (true) {
                    System.out.println("请输入要修改的信息(1.修改性别;2.修改生日日期;3.取消修改)");
                    switch (sc.next()) {
                        case "1":
                            teachers.get(i).setGender(sc.next().charAt(0));
                            System.out.println("修改性别成功!");
                            return;
                        case "2":
                            teachers.get(i).setBirth(sc.next());
                            System.out.println("修改生日日期成功!");
                            return;
                        case "3":
                            System.out.println("取消修改操作成功!");
                            return;
                        default:
                            System.out.println("输入有误!");
                            return;
                    }
                }
            }
        }
        System.out.println("没有找到ID为:" + input + "的教员信息!");


    }

    public static void addTeacher(ArrayList<Teacher> teachers, Scanner sc) {
        System.out.println("请输入教员姓名:");
        String teacherName = sc.next();
        System.out.println("请输入教员姓别(男/女):");
        char teacherGender = sc.next().charAt(0);
        System.out.println("请输入教员生日(yyyy-MM-dd):");
        String teacherBirth = sc.next();
        teachers.add(new Teacher(++Utils.teaId, teacherName, teacherGender, teacherBirth));
    }

    public static void studentsManager(ArrayList<Student> students, Scanner sc) {
        //学生管理系统
        System.out.println("【学员信息管理】");
        while (true) {
            System.out.println("1.添加学员 2.修改学员 3.删除学员 4.查询学员 5.返回");
            String userChoose = sc.next();
            switch (userChoose) {
                case "1":
                    System.out.println("添加学员");
                    addStudent(students, sc);
                    break;
                case "2":
                    System.out.println("修改学员");
                    revampStudent(students, sc);
                    break;
                case "3":
                    System.out.println("删除学员");
                    deleteStudent(students, sc);
                    break;
                case "4":
                    System.out.println("查询学员");
                    findStudents(students);
                    break;
                case "5":
                    System.out.println("返回上一级");
                    return;
                default:
                    System.out.println("输入有误!");
                    break;
            }
        }
    }

    public static void revampStudent(ArrayList<Student> students, Scanner sc) {
        if (students.size() == 0) {
            System.out.println("系统中没有学生信息!");
            return;
        }

        System.out.println("请输入需要修改的学员的id:");
        int studentId = sc.nextInt();
        for (int i = 0; i < students.size(); i++) {
            if (studentId == students.get(i).getId()) {
                System.out.println("查询到的学生信息为:");
                Utils.printPerson(students.get(i));
                while (true) {
                    System.out.println("请输入你要修改的学生信息(1修改性别,2修改生日,3退出修改):");
                    String input = sc.next();
                    switch (input) {
                        case "1":
                            System.out.println("修改性别!请输入性别(男/女):");
                            students.get(i).setGender(sc.next().charAt(0));
                            System.out.println("修改成功!修改为:" + students.get(i).getGender());
                            break;
                        case "2":
                            System.out.println("修改生日!请输入生日(yyyy-MM-dd):");
                            students.get(i).setBirth(sc.next());
                            System.out.println("修改成功!修改为:" + students.get(i).getBirth());
                            break;
                        case "3":
                            System.out.println("退出修改!");
                            return;
                        default:
                            System.out.println("输入有误!");
                            break;
                    }
                }
            }
        }

    }

    public static void deleteStudent(ArrayList<Student> students, Scanner sc) {
        if (students.size() == 0) {
            System.out.println("系统中没有学生信息!");
            return;
        }

        System.out.println("请输入需要删除的学员的id:");
        int studentId = sc.nextInt();
        for (int i = 0; i < students.size(); i++) {
            if (studentId == students.get(i).getId()) {
                System.out.println("查询到的学生信息为:");
                Person p = students.get(i);//这是系统查询到的学生
                Utils.printPerson(students.get(i));
                System.out.println("你确定要删除此学生信息吗?(y/n)");
                String input = sc.next();
                if (input.equals("y")) {
                    students.remove(p);
                    System.out.println("删除id为:  " + p.getId() + "   的学生成功!");
                    return;
                } else if (input.equals("n")) {
                    System.out.println("删除已取消!");
                    return;
                } else {
                    System.out.println("输入有误!删除不成功!");
                    return;
                }
            }
        }
        System.out.println("没有找到此id!");
    }

    public static void findStudents(ArrayList<Student> students) {
        if (students.size() == 0) {
            System.out.println("系统中没有学生信息!");
            return;
        }
        Utils.printArrayList(students);
    }

    public static void addStudent(ArrayList<Student> students, Scanner sc) {
        System.out.println("请输入学生姓名:");
        String studentName = sc.next();
        System.out.println("请输入学生性别:");
        char studentGender = sc.next().charAt(0);
        System.out.println("请输入学生生日(格式:yyyy-MM-dd):");
        String studentBirth = sc.next();
        Student student = new Student(++Utils.stuId, studentName, studentGender, studentBirth); //创建学生对象
        students.add(student);
    }
}
