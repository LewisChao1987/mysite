package com.buzz.mysite.controller;

import com.buzz.mysite.pojo.Account;
import com.buzz.mysite.until.token.SessionImpl;
import com.buzz.mysite.until.token.TokenHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value ={ "/home","/"})
public class HomeController {
@RequestMapping(method = RequestMethod.GET,value = {"","index"})
   public  ModelAndView index(){
   TokenHelper tokenHelper = new SessionImpl();
   String token ="";
   ModelMap map = new ModelMap();
   map.addAttribute("token",token);
   return new ModelAndView("index",map);
   }

}
