package dev.jlkesh.lessons;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationSettings.xml");
        /*User user = context.getBean("user", User.class);*/
        /*User user = context.getBean(User.class);
        System.out.println(user);
        UserService userService = context.getBean("userService1",UserService.class);
        System.out.println(userService);
        System.out.println(System.identityHashCode(user));
        System.out.println(System.identityHashCode(context.getBean(User.class)));
        System.out.println(System.identityHashCode(context.getBean(User.class)));
        System.out.println(System.identityHashCode(context.getBean(User.class)));*/
        /*System.out.println(context.getBean(User.class))*/;
        /*for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            System.out.println("beanDefinitionName = " + beanDefinitionName);
        }*/
        System.out.println(context.getBeanDefinitionCount());
        System.out.println(context.getBean(AuthController.class));
        context.close();
    }
}