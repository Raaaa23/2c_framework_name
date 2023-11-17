package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class gitItemListController {


     //画面表示用
     @RequestMapping(path = "/gititemlist",method = RequestMethod.GET )
     public String doListGet() {
    	 
    	 //htmlを表示
    	 return"gititemlist";
       }
     }