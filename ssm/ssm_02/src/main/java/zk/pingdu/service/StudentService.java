package zk.pingdu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zk.pingdu.domain.Student;

import java.util.List;

@Service
public interface StudentService {
    //查询所有用户信息
    List<Student> findAll();
    //保存用户信息
    void save(Student student);
}
