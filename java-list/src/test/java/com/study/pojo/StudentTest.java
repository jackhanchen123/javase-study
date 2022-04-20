package com.study.pojo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {


    // 测试list去重对象：根据对应属性去重
    @Test
    public void testList(){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(0,"李四","男"));
        studentList.add(new Student(1,"李四","女"));
        studentList.add(new Student(2,"李四","男"));
        studentList.add(new Student(3,"李四","女"));
        studentList.add(new Student(4,"李四","男"));
        studentList.add(new Student(5,"小红","男"));
        studentList.add(new Student(6,"小红","女"));
        studentList.add(new Student(7,"小红","男"));
        studentList.add(new Student(8,"小红","女"));
        studentList.add(new Student(9,"小红","女"));
        for (Student s : studentList) {
            System.out.println(s);
        }
//------------------------造数据完毕------------------------------------------------------
        List<Student> newStudentList = new ArrayList<>();
        // 项目采用的去重方法
        for (Student s : studentList) {
            if (!newStudentList.contains(s)){
                // contains 实际是equals比较，所以重写对象对应的属性，也就是对对应的属性进行去重
                newStudentList.add(s);
            }
        }
        for (Student s : newStudentList) {
            System.out.println("去重后的studnet"+s);
        }
    }
}