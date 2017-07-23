package com.jike.spring.introduce;

import java.io.PrintStream;

public class ForumService
{
  public void removeTopic(int topicId)
  {
    System.out.println("模拟删除Topic记录:" + topicId);
    try
    {
      Thread.currentThread();Thread.sleep(20L);
    }
    catch (Exception e)
    {
      throw new RuntimeException(e);
    }
  }
  
  public void removeForum(int forumId)
  {
    System.out.println("模拟删除Forum记录:" + forumId);
    try
    {
      Thread.currentThread();Thread.sleep(40L);
    }
    catch (Exception e)
    {
      throw new RuntimeException(e);
    }
  }
}
