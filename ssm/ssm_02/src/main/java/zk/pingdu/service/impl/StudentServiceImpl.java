package zk.pingdu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zk.pingdu.domain.Student;
import zk.pingdu.mapper.StudentMapper;
import zk.pingdu.service.StudentService;

import java.util.List;
@Service("studentService")
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentMapper studentMapper;

    public List<Student> findAll() {
        System.out.println("studentService查询所有用户信息!!!");
        return studentMapper.findAll();
    }

    public void save(Student student) {
        System.out.println("studentService保存用户信息");
        studentMapper.Save(student);
    }
}
