package com.buzz.mysite.controller;

import com.buzz.mysite.pojo.Account;
import com.buzz.mysite.until.session.SessionHelper;
import com.buzz.mysite.until.token.SessionImpl;
import com.buzz.mysite.until.token.TokenHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.util.Base64;

@Controller
@RequestMapping(value ={ "/home","/"})
public class HomeController {
   @Autowired
   public HttpSession session;
   @Autowired()
   @Qualifier("redis")
   SessionHelper sessionHelper;

   String userName;

@RequestMapping(method = RequestMethod.GET,value = {"","index"})
   public  ModelAndView index() throws UnsupportedEncodingException {
   Object object  = sessionHelper.get("userId");
   if (object==null)
   {
       sessionHelper.add("userId","120120012");
   }
   object = sessionHelper.get("userId");
   ModelMap map = new ModelMap();
   map.addAttribute("token",object);
   String sessionId = Base64.getEncoder().encodeToString(session.getId().getBytes("utf8"));
   map.addAttribute("sss",userName);
   return new ModelAndView("index",map);
   }

}
