package com.ashwani.training.jMockit;

import java.util.List;
import java.util.Map;

public interface PricingService {

	Map<String, Double> getPrice(List<Long> skus);

}
