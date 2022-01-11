package com.maycon.springbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

    public static void main(String[] args) {

        // CHAMANDO INTERFACE DO ApplicationContext DO SPRING FRAMEWORK
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        
        
        Livro livro = factory.getBean(Livro.class);
        livro.exibir();
		

    }
    
}
