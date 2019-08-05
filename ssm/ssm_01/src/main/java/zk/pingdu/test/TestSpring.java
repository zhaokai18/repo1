package zk.pingdu.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zk.pingdu.domain.Account;
import zk.pingdu.service.AccountService;

import java.util.List;

public class TestSpring {

    @Test
    public void testSpring(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountService service = (AccountService) context.getBean("accountService");
        service.findAll();
    }
}
