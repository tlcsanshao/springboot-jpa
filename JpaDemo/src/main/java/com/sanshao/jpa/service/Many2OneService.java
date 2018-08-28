package com.sanshao.jpa.service;

import com.sanshao.jpa.domain.many2one.Classroom;
import com.sanshao.jpa.domain.many2one.ClassroomRepository;
import com.sanshao.jpa.domain.many2one.Student;
import com.sanshao.jpa.domain.many2one.StudentRepository;
import com.sanshao.jpa.domain.one2one_b.Husband;
import com.sanshao.jpa.domain.one2one_b.HusbandRepository;
import com.sanshao.jpa.domain.one2one_b.Wife;
import com.sanshao.jpa.domain.one2one_b.WifeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

//@Component
public class Many2OneService implements CommandLineRunner {

    @Autowired
    ClassroomRepository classroomRepository;

    @Autowired
    StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("添加");
        Classroom classroom = new Classroom();
        classroom.setName("一号教室");

        Student student1 = new Student();
        student1.setName("aa");
        student1.setClassroom(classroom);

        Student student2 = new Student();
        student2.setName("bb");
        student2.setClassroom(classroom);

        classroomRepository.save(classroom);
        studentRepository.save(student1);
        studentRepository.save(student2);

//        TimeUnit.SECONDS.sleep(10);
//        System.out.println("Delete 操作");
//        classroomRepository.delete(classroom);
//        studentRepository.delete(student1);
//        studentRepository.delete(student2);


        TimeUnit.SECONDS.sleep(2);
        System.out.println("Update 操作");

        classroom = classroomRepository.findById(1).get();
        classroom.setName("二号教室");

        student1 = studentRepository.findById(2).get();
        student1.setName("111");
        student1.setClassroom(classroom);

        student2 = studentRepository.findById(3).get();
        student2.setName("222");
        student1.setClassroom(classroom);


        classroomRepository.save(classroom);
        studentRepository.save(student1);
        studentRepository.save(student2);

    }


}
