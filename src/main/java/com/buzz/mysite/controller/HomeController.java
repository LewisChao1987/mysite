package com.buzz.mysite.controller;

import com.buzz.mysite.pojo.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value ={ "/home","/"})
public class HomeController {
@RequestMapping(method = RequestMethod.GET,value = {"","index"})
   public  String index(){
   String str ="";
   return  "index";
   }

}
