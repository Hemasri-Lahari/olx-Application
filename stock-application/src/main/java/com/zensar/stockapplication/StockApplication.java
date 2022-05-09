package com.zensar.stockapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ImportResource("Beans.xml")
public class StockApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockApplication.class, args);
		Stock stock=new Stock();
		stock.getName();
		stock.getStockId();
		stock.setStockId(10L);
	}

}
