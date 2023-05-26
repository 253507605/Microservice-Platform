package com.model.test;

import com.model.abstractFactory.AbstractFactory;
import com.model.abstractFactory.HuaWeiFactory;
import com.model.abstractFactory.XiaomiFactory;
import com.model.builder.AtdPersonPaycode;
import com.model.builder.AtdPersonPaycode1;
import com.model.builder.Builder;
import com.model.builder.ConcreterBuilder;
import com.model.factoryMethod.Factory;
import com.model.factoryMethod.HuaweiFactory;
import com.model.factoryMethod.IPhoneFactory;
import com.model.prototype.ConcretePrototype;
import com.model.prototype.ConcretePrototype1;
import com.model.prototype.prototype;
import com.model.singleton.HungrySingleton;
import com.model.singleton.LazySingleton;
import com.model.singleton.StaticInnerSingleton;
import com.model.strategy.BusFactory;
import com.model.strategy.Context;
import com.model.strategy.factory;
import com.model.strategy.strategy;
import com.model.templateMethod.Exam;
import com.model.templateMethod.Game;
import com.model.templateMethod.template;
import com.model.visitor.*;

import java.util.UUID;
import java.util.concurrent.*;

/**
 * @Author Jason.Chen
 * @create 2023/4/27 15:05
 */
public class Test {

    public static void main(String[] args) {
        //饿汉式单例模式
//        ExecutorService executorService = new ThreadPoolExecutor(1,2,1000, TimeUnit.MILLISECONDS,new LinkedBlockingQueue<>());
//        for(int i=0;i<50;i++) {
//            executorService.execute(() -> {
//                HungrySingleton instance = HungrySingleton.getInstance();
//                System.out.println(instance.hashCode());
//            });
//        }
        //懒汉式单例模式
//        for(int i=0;i<50;i++) {
//            executorService.execute(() -> {
//                StaticInnerSingleton instance = StaticInnerSingleton.getInstance();
//                System.out.println(instance.hashCode());
//            });
//        }
//        executorService.shutdown();


        //工厂方法模式
//        Factory factory = new IPhoneFactory();
//        Factory factory1 = new XiaomiFactory();
//        Factory factory2 = new HuaweiFactory();
//        factory.buildPhone().make();
//        factory1.buildPhone().make();
//        factory2.buildPhone().make();

        //抽象工厂模式
//        AbstractFactory factory = new XiaomiFactory();
//        AbstractFactory factory1 = new HuaWeiFactory();
//        factory.makePhone().buildPhone();
//        factory.makeComputer().buildComputer();
//        factory1.makePhone().buildPhone();
//        factory1.makeComputer().buildComputer();

        //建造者模式
//        ConcreterBuilder builder = new ConcreterBuilder();
//        AtdPersonPaycode jason = builder.addId(UUID.randomUUID().toString()).addTenantCode("jason").addAtdTime("123456").build();
//        System.out.println(jason.getId());
//        //实现方式2
//        AtdPersonPaycode1 jason1 = AtdPersonPaycode1.createBuilder().addId(UUID.randomUUID().toString()).addTenantCode("jason").addAtdTime("123456").build();
//        AtdPersonPaycode1 jason2 = AtdPersonPaycode1.createBuilder().addId(UUID.randomUUID().toString()).addTenantCode("jason").addAtdTime("123456").build();
//        System.out.println(jason1.getId());
//        System.out.println(jason1.hashCode());
//        System.out.println(jason2.hashCode());

        //原型模式
        //浅克隆
//        prototype prototype = new prototype();
//        prototype.setId(UUID.randomUUID().toString());
//        prototype.setName("jason");
//        prototype.setAtdPersonPaycode(new AtdPersonPaycode());
//        prototype clone = prototype.clone();
//        prototype clone1 = prototype.clone();
//        System.out.println(clone.getAtdPersonPaycode().hashCode());
//        System.out.println(clone.getId());
//        System.out.println(clone.getName());
//        System.out.println(clone1.getAtdPersonPaycode().hashCode());
//        System.out.println(clone1.getId());
//        System.out.println(clone1.getName());
//        //深克隆实现方式1---对象内部也实现clone接口
//        ConcretePrototype concretePrototype = new ConcretePrototype();
//        concretePrototype.setId(UUID.randomUUID().toString());
//        concretePrototype.setName("jason");
//        concretePrototype.setAtdPersonPaycode1(new AtdPersonPaycode1());
//        ConcretePrototype clone2 = concretePrototype.clone();
//        ConcretePrototype clone3 = concretePrototype.clone();
//        System.out.println(clone2.getAtdPersonPaycode1().hashCode());
//        System.out.println(clone2.getId());
//        System.out.println(clone2.getName());
//        System.out.println(clone3.getAtdPersonPaycode1().hashCode());
//        System.out.println(clone3.getId());
//        System.out.println(clone3.getName());
        //深克隆实现方式2---流的方式
//        ConcretePrototype1 concretePrototype1 = new ConcretePrototype1();
//        concretePrototype1.setId(UUID.randomUUID().toString());
//        concretePrototype1.setName("jason");
//        concretePrototype1.setAtdPersonPaycode1(new AtdPersonPaycode1());
//        ConcretePrototype1 clone = concretePrototype1.clone();
//        ConcretePrototype1 clone1 = concretePrototype1.clone();
//        System.out.println(clone.getId());
//        System.out.println(clone.getName());
//        System.out.println(clone.getAtdPersonPaycode1().hashCode());
//        System.out.println(clone1.getId());
//        System.out.println(clone1.getName());
//        System.out.println(clone1.getAtdPersonPaycode1().hashCode());

        //访问者模式
//        Computer computer = new Computer();
//        computer.addComputerPart(new Mouse());
//        computer.addComputerPart(new Cpu());
//        computer.addComputerPart(new KeyBoard());
//        computer.accpet(new Engineer());
//        computer.accpet(new Worker());

        //模板方法模式
//        template template = new Exam();
//        template template1 = new Game();
//        template.template();
//        template1.template();

        //策略模式
        factory factory = new BusFactory();
        Context context = new Context();
        context.setStrategy(factory.createStrategy());
        context.toDestination();
    }
}
