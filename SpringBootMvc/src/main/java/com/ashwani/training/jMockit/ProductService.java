package com.ashwani.training.jMockit;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProductService {

	private SearchService searchService;
	private PricingService pricingService;

	public List<Product> find(String token) {
		List<Product> products = searchService.search(token);

		List<Long> skus = new ArrayList<>();
		for (Product product : products) {
			skus.add(product.getSku());
		}
		
		Map<String, Double> priceMap = pricingService.getPrice(skus);
		for (Product product : products) {
			product.setPrice(priceMap.get(product.getSku()));
		}

		return products;
	}

}
