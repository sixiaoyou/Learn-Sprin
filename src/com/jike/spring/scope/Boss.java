package com.jike.spring.scope;

public class Boss {
private String name;
private Car car;
public Boss() {
    super();
}
public Car getCar() {
    return car;
}
public void setCar(Car car) {
    this.car = car;
}
@Override
public String toString() {
    return "name:" + name + "\n car:" + car;
}


    
    
    
    
}
