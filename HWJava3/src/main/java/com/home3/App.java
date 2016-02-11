package com.home3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        IBaker superBarista = (IBaker) context.getBean("superBarista");
        superBarista.bakeCake();
        IBarista superBarista1 = (IBarista) context.getBean("superBarista");
        superBarista1.makeCoffee();
        System.out.println();
        System.out.println("Super barista show time");
        IBaker ssbaristaAsB = (IBaker)context.getBean("ssuperBarista");
        ssbaristaAsB.bakeCake();
        IBarista ssbaristaAsBar = (IBarista)context.getBean("ssuperBarista");
        ssbaristaAsBar.makeCoffee();
    }
}
