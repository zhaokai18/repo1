package zk.pingdu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import zk.pingdu.domain.Account;
import zk.pingdu.service.AccountService;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String testFindAll(){
        System.out.println("所有用户信息");
        List<Account> accounts = accountService.findAll();
        for (Account account : accounts) {
            System.out.println(account);
        }
        return "list";
    }
    @RequestMapping("/save")
    public String testAave(Account account){
        System.out.println("保存用户信息");
        accountService.saveAccount(account);
        return "list";
    }

}
