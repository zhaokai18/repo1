package zk.pingdu.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import zk.pingdu.domain.Account;
import zk.pingdu.mapper.AccoutMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestOne {

    @Test
    public void test01() throws Exception {
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder factoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = factoryBuilder.build(is);
        SqlSession session = build.openSession();
        AccoutMapper mapper = session.getMapper(AccoutMapper.class);
        List<Account> accounts = mapper.findAll();
        for (Account account : accounts) {
            System.out.println(account);
        }
        session.close();
        is.close();
    }
}
