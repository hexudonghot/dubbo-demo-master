package cn.com.pk.controller;

import com.mushan.DemoServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/12/20.
 */
@Controller
@RequestMapping("/")
public class TstController
{

    @Autowired
    DemoServer server;
    @RequestMapping(value="/s", method = RequestMethod.GET)
    public  String abc()
    {
        //System.out.println( server.sayHello("aaa"));;
        System.out.println(11);
        return "index";
    }
}
