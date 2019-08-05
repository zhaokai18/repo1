package zk.pingdu.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import zk.pingdu.domain.Account;

import java.util.List;
@Repository
public interface AccoutMapper {

    //查询所有用户信息
    @Select("select * from account")
    List<Account> findAll();

    //保存用户
    @Insert("insert into account (name,money) values (#{name},#{money})")
    void saveAccount(Account account);
}
