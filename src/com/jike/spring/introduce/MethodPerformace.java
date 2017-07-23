package com.jike.spring.introduce;

import java.io.PrintStream;

public class MethodPerformace
{
  private long begin;
  private long end;
  private String serviceMethod;
  
  public MethodPerformace(String serviceMethod)
  {
    reset(serviceMethod);
  }
  
  public void printPerformace()
  {
    this.end = System.currentTimeMillis();
    long elapse = this.end - this.begin;
    System.out.println(this.serviceMethod + "花费" + elapse + "毫秒。");
  }
  
  public void reset(String serviceMethod)
  {
    this.serviceMethod = serviceMethod;
    this.begin = System.currentTimeMillis();
  }
}
