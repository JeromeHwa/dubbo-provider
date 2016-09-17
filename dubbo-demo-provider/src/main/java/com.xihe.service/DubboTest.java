package com.xihe.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.lang.management.ManagementFactory;

/**
 * Created by xihe on 2016/9/3.
 */
public class DubboTest {
  public static void main(String[] args) throws IOException {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
    context.start();

    String name = ManagementFactory.getRuntimeMXBean().getName();
    System.out.println(name);
// get pid
    String pid = name.split("@")[0];
    System.out.println("Pid is:" + pid);
    System.in.read();
  }
}
