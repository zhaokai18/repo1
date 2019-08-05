package zk.pingdu.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import zk.pingdu.domain.Student;

import java.util.List;

@Repository
public interface StudentMapper {

    //查询用户信息
    @Select("select * from student")
    List<Student> findAll();
    //保存用户
    @Insert("insert into student(sname,age,sex)values(#{sname},#{age},#{sex})")
    void Save(Student student);
}
