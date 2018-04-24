package com.lrd.ProxyPattern.ProtecteProxyPattern;

import java.lang.reflect.Proxy;
import java.util.HashMap;

public class MatchMakingTestDrive {

    HashMap<String,PersonBean> personBeanHashMap = new HashMap<>();

    public static void main(String[] args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }

    public MatchMakingTestDrive() {
        initializeDatabase();
    }

    public void drive() {
        PersonBean joe = getPersonFromDatabase("Joe Javabean");
        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println("Name is: "+ownerProxy.getName());
        ownerProxy.setInterests("bowling,Go");
        System.out.println("Interests set for owner proxy");

        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("Can't set rating from owner proxy!");
        }
        System.out.println("Rating is: "+ownerProxy.getHotOrNotRating());

        System.out.println("\n");
        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is: "+nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("bowling,Go");
        } catch (Exception e) {
            System.out.println("Can't set interests from non owner proxy!");
        }

        nonOwnerProxy.setHotOrNotRating(3);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is "+nonOwnerProxy.getHotOrNotRating());


    }

    public PersonBean getPersonFromDatabase(String key) {
        return personBeanHashMap.get(key);
    }

    public void initializeDatabase() {

        personBeanHashMap.put(
                "Joe Javabean",new PersonBeanImpl("Joe","Man",7,1));
        personBeanHashMap.put(
                "Steven Javabean",new PersonBeanImpl("Steven","Man",5,1));
        personBeanHashMap.put(
                "Luce Javabean",new PersonBeanImpl("Luce Javabean","Woman",3,1));
    }

    public PersonBean getNonOwnerProxy(PersonBean personBean) {

        return (PersonBean) Proxy.newProxyInstance(
                personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(personBean)
        );
    }


    public PersonBean getOwnerProxy(PersonBean personBean) {

        return (PersonBean) Proxy.newProxyInstance(
                personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new OwnerInvocationHandler(personBean)
        );
    }

}
