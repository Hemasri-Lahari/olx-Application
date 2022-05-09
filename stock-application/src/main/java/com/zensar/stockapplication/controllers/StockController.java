package com.zensar.stockapplication.controllers;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zensar.stockapplication.Stock;
import com.zensar.stockapplication.service.StockService;

@Controller
//@CrossOrigin("*")
@RequestMapping("/stocks")
 public class StockController {
@Autowired
private StockService stockservice;

/*public StockController() {
	stocks.add(new Stock(1L,"RIL","bse",2610));
	stocks.add(new Stock(2L,"Zensar","bse",342));
}*/
@GetMapping
@ResponseBody
@RequestMapping(method=RequestMethod.GET)
public List<Stock> getAllStocks(){
	return stockservice.getAllStocks();
}
@RequestMapping(value="/test",method= {RequestMethod.GET,RequestMethod.POST})
public void test() {
	System.out.println("I am inside test method");
}
/*@GetMapping("/{stockId}")
@RequestMapping(value="/{stockId}",method=RequestMethod.GET)
public Stock getStock(@PathVariable("stockId") long id) {
	for(Stock stock:stocks) {
		if(stock.getStockId()==id){
		return stock;	
		}
	}
	return null;
	
}*/
@RequestMapping(value="/{stockId}",method=RequestMethod.GET)
public Stock getStock(@PathVariable("stockId") long id) {
	Optional<Stock>stock1=stocks.stream().filter(stock->stock.getStockId()==id).findAny();
	if(stock1.isPresent()) {
		return stock1.get();
	}else {
		return stock1.orElseGet(()->{return new Stock();});
	}
	
}
/*@GetMapping("/stocks")
public Stock getStockByRequestParam(@Requestparam(required=false,value="id",defaultValue=2)) {
	for(Stock stock:stocks) {
		if(stock.getStockId()==id){
		return stock;	
		}
	}
	return null;
}*/
//@PostMapping("/stocks")
@RequestMapping(method=RequestMethod.POST)
@PostMapping(produces= {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE},consumes= {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
public ResponseEntity<Stock> createStock(@RequestBody Stock stock,@RequestHeader("auth-token")String token) {
if(token.equals("hl66609")){	
	stocks.add(stock);
}else {
	return new ResponseEntity<Stock>(HttpStatus.BAD_REQUEST);
}
	return new ResponseEntity<Stock>(stock,HttpStatus.CREATED);
}
@DeleteMapping("{stockId}")
public String deleteStock(@PathVariable("stockId")long stockId) {
	for(Stock stock:stocks) {
		if(stock.getStockId()==stockId) {
			stocks.remove(stock);
			return "Stock deleted with stock id"+stockId;
		}
	}
	return "Sorry,stock id is not available";
	
}
@PutMapping("{stockId}")
public Stock updateStock(@PathVariable int stockId,@RequestBody Stock stock) {
	Stock availableStock=getStock(stockId);
	availableStock.setMarketName(stock.getMarketName());
	availableStock.setName(stock.getName());
	availableStock.setPrice(stock.getPrice());
	return availableStock;
	
}
@DeleteMapping
public ResponseEntity<String>deleteAllStocks(){
	stocks.removeAll(stocks);
	return new ResponseEntity<String>("All stocks deleted successfully",HttpStatus.OK);
}
}
