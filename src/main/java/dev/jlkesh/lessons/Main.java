package dev.jlkesh.lessons;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("dev.jlkesh.lessons");
        /*context.register(Configs.class);
        context.refresh();*/
//        System.out.println(context.getBean("manager2", Manager2.class));
        System.out.println(System.identityHashCode(context.getBean("manager", Manager.class)));
        System.out.println(System.identityHashCode(context.getBean("manager", Manager.class)));
        System.out.println(System.identityHashCode(context.getBean("manager", Manager.class)));
        System.out.println(System.identityHashCode(context.getBean("manager", Manager.class)));
        AuthController authController = context.getBean(AuthController.class);
        System.out.println(authController);
        context.close();
    }
}
