package com.springbatch;

import in.gov.uidai.token.db.mysql.TokenCacheStore;

public class ItemProcessor implements
		org.springframework.batch.item.ItemProcessor<Integer, Integer> {
	TokenCacheStore tokenCacheStore;

	@Override
	public Integer process(Integer number) throws Exception {
		tokenCacheStore.loadSaltEntities(null, null, null, number, number, null);
		Integer reversedNumber = number;
		while (number > 0) {
			int remainder = number % 10;
			number = number / 10;
			reversedNumber = reversedNumber * 10 + remainder;
		}
		return reversedNumber;
	}

}
