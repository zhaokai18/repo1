package zk.pingdu.service;

import zk.pingdu.domain.Account;

import java.util.List;

public interface AccountService {

    //查询所用户信息
    List<Account> findAll();

    //保存用户
    void saveAccount(Account account);
}
