package com.buzz.mysite.controller;

import com.buzz.mysite.pojo.Account;
import com.buzz.mysite.until.token.SessionImpl;
import com.buzz.mysite.until.token.TokenHelper;
import org.springframework.jca.cci.connection.NotSupportedRecordFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RestController(value = "login")
@RequestMapping(value = "login")
public class LoginController {
    TokenHelper tokenHelper = new SessionImpl();
    @RequestMapping(method = RequestMethod.GET,path = {"index","*"})
    public ModelAndView index() {
        Account account = new Account();
        account.setAccount("zhangsan");
        ModelAndView vm = new ModelAndView();
        Map<String, Object> map = new HashMap<>();
        map.put("account", account);
        return new ModelAndView("login/login", map);
    }

    @RequestMapping(method = RequestMethod.POST,path = "do")
    public LoginMessage Login(String account, String password) {
        LoginMessage message = new LoginMessage();
        if (account.equals("123")) {
            message.setCode("123");
            message.setMsg("shit");
        } else {
            message.setCode("456");
            message.setMsg("shit");
        }

        return message;
    }
}
class LoginMessage
{
    private  String msg ;
    private  String code;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
