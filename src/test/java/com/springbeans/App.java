package com.springbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Livro livro = factory.getBean(Livro.class);
		livro.setNome("O Senhor dos Anéis");
		livro.setCodigo("A4242A");
		
		Autor autor = factory.getBean(Autor.class);
		autor.setNome("J.R.R Tolkien");
		
		livro.exibir();

		((AbstractApplicationContext)factory).close();
	}

}
