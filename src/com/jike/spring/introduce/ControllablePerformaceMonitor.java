package com.jike.spring.introduce;

import java.io.PrintStream;
import java.lang.reflect.Method;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

public class ControllablePerformaceMonitor
  extends DelegatingIntroductionInterceptor
  implements Monitorable, Testable
{
  private ThreadLocal<Boolean> MonitorStatusMap = new ThreadLocal();
  
  public void setMonitorActive(boolean active)
  {
    this.MonitorStatusMap.set(Boolean.valueOf(active));
  }
  
  public Object invoke(MethodInvocation mi)
    throws Throwable
  {
    Object obj = null;
    if ((this.MonitorStatusMap.get() != null) && (((Boolean)this.MonitorStatusMap.get()).booleanValue()))
    {
      PerformanceMonitor.begin(
        mi.getClass().getName() + "." + mi.getMethod().getName());
      obj = super.invoke(mi);
      PerformanceMonitor.end();
    }
    else
    {
      obj = super.invoke(mi);
    }
    return obj;
  }
  
  public void test()
  {
    System.out.println("dd");
  }
}

