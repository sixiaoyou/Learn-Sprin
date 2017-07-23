package com.jike.spring.introduce;

import java.io.PrintStream;

public class PerformanceMonitor
{
  private static ThreadLocal<MethodPerformace> performaceRecord = new ThreadLocal();
  
  public static void begin(String method)
  {
    System.out.println("begin monitor...");
    MethodPerformace mp = (MethodPerformace)performaceRecord.get();
    if (mp == null)
    {
      mp = new MethodPerformace(method);
      performaceRecord.set(mp);
    }
    else
    {
      mp.reset(method);
    }
  }
  
  public static void end()
  {
    System.out.println("end monitor...");
    MethodPerformace mp = (MethodPerformace)performaceRecord.get();
    mp.printPerformace();
  }
}
