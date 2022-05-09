package com.zensar.stockapplication.service;

import java.util.List;

import com.zensar.stockapplication.Stock;

public interface StockService {
	List<Stock> getAllStocks();

	Stock getStock(long id);

	Stock createStock(Stock stock, String token);

	String deleteStock(long stockId);

	Stock updateStock(int stockId, Stock stock);

	String deleteAllStocks();

	Stock getAllStocks(long id);

	Stock getStocks(long id);
}
