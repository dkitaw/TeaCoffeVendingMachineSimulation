package com.yash.service;

import java.util.List;

import com.yash.enums.Coin;
import com.yash.enums.Item;
import com.yash.util.Container;

public interface VendingMachineService {
	public void RefillContainers();

	public long selectItemAndGetPrice(Item item);

	public void insertCoin(Coin coin);

	public List<Coin> refund();

	public Container<Item, List<Coin>> collectItemAndChange();

	public void reset();

	public long getTotalSales();

	public void printStats();
}
