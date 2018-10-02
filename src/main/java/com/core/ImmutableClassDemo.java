package com.core;

import java.util.Date;

final class ImmutableClass {
    private Integer id;
    private Date date ;

    private ImmutableClass() {}

    public ImmutableClass(Integer id, Date date) {
        this.id = id;
        this.date = date;
    }

    public Integer getId() { return id; }

    public Date getDate() { return (Date)date.clone(); }
}



public class ImmutableClassDemo {
    public static void main(String[] args) {
        ImmutableClass obj1 = new ImmutableClass(1, new Date());
        System.out.println("Before Modification " + obj1.getDate().getTime());

        obj1.getDate().setTime(100000L);
        System.out.println("After Modification " + obj1.getDate().getTime());
    }
}
