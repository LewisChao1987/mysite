package com.buzz.mysite.controller;

import com.buzz.mysite.model.User;
import com.buzz.mysite.pojo.Account;
import com.buzz.mysite.service.UserService;
import com.buzz.mysite.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import java.time.LocalDateTime;
import java.util.*;

@Controller
@RequestMapping(value = "register")
public class RegisterController {
    @Autowired
    private UserService userService;
    @RequestMapping(method = RequestMethod.GET, value = {"*", "index"})
    public ModelAndView register( ) {
       // ModelMap model = new ModelMap();
        Account account = new Account();
        account.setPassword("123");
        ModelMap map = new ModelMap();
        map.addAttribute("account",account);
        return  new ModelAndView("/register/index",map);
    }

    @RequestMapping(method = RequestMethod.POST, value = "add")
    public String addAccount( RedirectAttributes redirectAttributes,  ModelMap model ,@Validated  Account account, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            bindingResult.getFieldErrors().forEach(a -> {
                model.addAttribute(a.getField() + "Valid", a.getDefaultMessage());
                model.addAttribute("test",account);
            });
            return "register/index";
        }
        //todo  用户注册

        User user  = new User();
        user = new User();
        user.setAccountNo(account.getAccount());
        user.setUserName(account.getName());
        user.setCreateDate(new Date());
        user.setUpdatedId("1");
        user.setCreateId("1");
        userService.addUser(user);

        account.setPassword("123456");
        account.setName("12");
        account.setAccount("23434");
        Map<String,Object> map = new HashMap<>();
       map.put("name","sdsd");
       map.put("account","show");
       map.put("password","123");
       map.put("msg","success");
        redirectAttributes.addAllAttributes(map);
        return "redirect:/register/success";
    }

    @RequestMapping(method = RequestMethod.GET, value = "success")
    public ModelAndView registerSuccess(@ModelAttribute Account account,String msg){
        ModelAndView modelAndView = new ModelAndView();
        ModelMap map = new ModelMap();
        modelAndView.addObject("account",account);
        modelAndView.setViewName("register/success");
        return modelAndView;
    }

    public static void main(String[] args) {
        UserService s = new UserServiceImpl();
        User user  = new User();
        user = new User();
        user.setAccountNo("23223");
        user.setUserName("3434");
        user.setCreateDate(new Date());
        user.setUpdatedId("1");
        user.setCreateId("1");
        s.addUser(user);
    }
}
