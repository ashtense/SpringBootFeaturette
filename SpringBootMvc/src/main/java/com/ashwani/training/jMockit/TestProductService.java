package com.ashwani.training.jMockit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import mockit.Expectations;
import mockit.Injectable;
import mockit.Tested;

public class TestProductService {

	@Tested
	private ProductService productService;
	
	@Injectable
	private SearchService searchService;
	
	@Injectable
	private PricingService pricingService;
	
	private List<Product> products;
	private Map<Long, Double> priceMap;
	
	@Before
	public void setup(){
		products = Arrays.asList(new Product(11l),new Product(11l));
		priceMap = new HashMap<>();
		priceMap.put(11l, 111.90);
		priceMap.put(11l, 112.90);
	}
	
	@Test
	public void shouldFindProducts(){
		new Expectations() {
			{
				searchService.search("Java Threading");
				result = products;
				times = 1;
				
				pricingService.getPrice((List<Long>)any);
				result = priceMap;
			}
		};
		List<Product> products = this.productService.find("Java Threading");
		assertEquals(2, products.size());
		assertEquals(112.90, products.get(0).getPrice(), 0);
	}
}
