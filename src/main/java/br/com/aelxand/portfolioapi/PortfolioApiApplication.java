package br.com.aelxand.portfolioapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PortfolioApiApplication {

    @Autowired
    public PortfolioApiApplication(){}

	public static void main(String[] args) {
		SpringApplication.run(PortfolioApiApplication.class, args);
	}

}
