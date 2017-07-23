package com.jike.spring.advice;

import javax.management.RuntimeErrorException;

public class ForumService {

    public void removeForum() {

        throw new RuntimeException("removeForum:Exception .....");

    }

    public void updateForum() {

        throw new RuntimeException("updateForum:Exception.....");
    }

}
