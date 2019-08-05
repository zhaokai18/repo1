package zk.pingdu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import zk.pingdu.domain.Student;
import zk.pingdu.service.StudentService;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/findAll")
    public String testFindAll(){
        System.out.println("查询用户信息执行了");
        List<Student> students = studentService.findAll();
        for (Student student : students) {
            System.out.println(student);
        }
        return "success";
    }
    @RequestMapping("/save")
    public String testSave(Student student){
        System.out.println("保存用户信息执行了");
        studentService.save(student);
        return "success";
    }
}
