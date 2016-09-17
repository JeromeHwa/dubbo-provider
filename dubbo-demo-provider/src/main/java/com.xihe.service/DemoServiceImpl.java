package com.xihe.service;

import com.xihe.api.DemoService;

import java.util.Date;

/**
 * Created by xihe on 2016/9/3.
 */
public class DemoServiceImpl implements DemoService {

  public String getMsg(String name) {
    System.out.println("调用开始"+new Date());
    try {
      Thread.sleep(20000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("处理完毕"+new Date());
    return "Hello Dubbo, My name is " + name;
  }
}
