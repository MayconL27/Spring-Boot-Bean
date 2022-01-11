package com.maycon.springbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// CLASSE DE CONFIGURAÇÃO DO BEAN.
@Configuration
public class AppConfig {

    
    // CRIANDO PRIMEIRO BEAN
    @Bean // ANOTAÇÃO INFORMANDO QUE É UM BEAN
    public Livro getLivro() {
        return new Livro();
    }
    //  <bean id="livro" class="com.springbeans.Livro"/>
    
    
}
