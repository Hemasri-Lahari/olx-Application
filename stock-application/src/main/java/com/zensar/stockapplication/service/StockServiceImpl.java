package com.zensar.stockapplication.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.zensar.stockapplication.Stock;
@Service

public class StockServiceImpl implements StockService {

	 
		static List<Stock> stocks=new ArrayList<Stock>();
		static {
			stocks.add(new Stock(1L,"RIL","bse",2610));
			stocks.add(new Stock(2L,"zensar","bse",342));
			
		return stocks;
	}

	@Override
	public Stock getStocks(long id) {
		
		return null;
	}

	@Override
	public Stock createStock(Stock stock, String token) {
		return null;
	}

	@Override
	public String deleteStock(long stockId) {
		return null;
	}

	@Override
	public Stock updateStock(int stockId, Stock stock) {
		return null;
	}

	@Override
	public String deleteAllStocks() {
		return null;
	}

	@Override
	public List<Stock> getAllStocks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stock getStock(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stock getAllStocks(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
