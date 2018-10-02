package com.designpatterns.singleton;

class BillPughSingleton {

    private BillPughSingleton() {}

    private static class BillPughSingletonHelper {
        private static BillPughSingleton instance = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return BillPughSingletonHelper.instance;
    }

    public String getMessage() { return "BillPughSingleton"; }
}

public class BillPughSingletonDemo {
    public static void main(String[] args) {
        BillPughSingleton obj = BillPughSingleton.getInstance();
        System.out.println(obj.getMessage());
    }
}

