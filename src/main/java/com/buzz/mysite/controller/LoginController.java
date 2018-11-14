package com.buzz.mysite.controller;

import com.buzz.mysite.pojo.Account;
import com.buzz.mysite.until.CommHelper;
import com.buzz.mysite.until.token.JSession;
import com.buzz.mysite.until.token.SessionImpl;
import com.buzz.mysite.until.token.TokenHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController(value = "login")
@RequestMapping(value = "login")
public class LoginController {
    @Autowired
 private   TokenHelper tokenHelper;
    @Autowired
    public HttpServletResponse response;
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
            JSession jSession = new JSession();
            jSession.setjSessionId(RequestContextHolder.currentRequestAttributes().getSessionId());
            jSession.setToken(CommHelper.newGUID(true));
            jSession.setTokenName("UserId");
            jSession.setAppId("PC");
            tokenHelper.addToken(jSession);
            Cookie cookie = new Cookie("UserId", jSession.getToken());

            response.addCookie(cookie);
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
