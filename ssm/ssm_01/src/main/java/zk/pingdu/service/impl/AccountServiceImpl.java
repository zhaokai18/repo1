package zk.pingdu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import zk.pingdu.domain.Account;
import zk.pingdu.mapper.AccoutMapper;
import zk.pingdu.service.AccountService;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccoutMapper accoutMapper;

    public List<Account> findAll() {
        System.out.println("AccountService查询所有用户.....");
        return accoutMapper.findAll();
    }

    public void saveAccount(Account account) {
        accoutMapper.saveAccount(account);
        System.out.println("AccountService保存用户.....");
    }
}
