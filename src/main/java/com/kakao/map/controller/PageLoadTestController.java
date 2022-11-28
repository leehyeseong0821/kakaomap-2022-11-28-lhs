package com.kakao.map.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageLoadTestController {
    //주소창에 요청을 날리면 무조건 Get 요청이다.
    //요청은 리퀘스트 맵핑으로
    @RequestMapping(value ="/t1",method = RequestMethod.GET)
    public String test1(){         //String으로 적어주면 return이 있다.
        System.out.println("t1 요청 들어옴");

        return "test1"; //html을 리턴값으로 불러온다 [응답].
    }
    @RequestMapping(value ="/t2",method = RequestMethod.GET)
    public String test2(){
        System.out.println("t2 요청 들어옴");

        return "test1";
    }

    @RequestMapping(value ="/test/page",method = RequestMethod.GET)
    public String test3(){

        return "test/test2";
    }
    @RequestMapping(value ="/map",method = RequestMethod.GET)
    public String kakaomap(){

        return "map";
    }
    @RequestMapping(value="/hi",method = RequestMethod.GET)
    public String test4(){
        return "test/test2";
    }
}
