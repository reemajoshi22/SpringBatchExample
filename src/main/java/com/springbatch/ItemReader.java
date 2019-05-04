package com.springbatch;

import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class ItemReader implements
		org.springframework.batch.item.ItemReader<Integer> {
	int number;

	@Override
	public Integer read() throws Exception, UnexpectedInputException,
			ParseException, NonTransientResourceException {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}
}
