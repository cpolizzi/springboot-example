package vtx.priv.examples.inventory.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import vtx.priv.examples.inventory.model.Item;

@Component
public class InventoryService {
	private Map<String, Item> inventory = new HashMap<>();
	
	public void addItem(Item item) throws InventoryException {
		if (item.getInventoryNumber() == null) {
			throw new InventoryException("Inventory number is  required");
		}

		if (item.getInventoryNumber().isEmpty()) {
			throw new InventoryException("Inventory number is  required");
		}
		
		inventory.put(item.getInventoryNumber(), item);
	}
	
	public Item removeItem(String inventoryNumber) {
		return findItemByInventoryNumber(inventoryNumber);
	}
	
	public List<Item> getAllItems() {
		return new ArrayList<Item>(inventory.values());
	}
	
	public Item findItemByInventoryNumber(String inventoryNumber) {
		return inventory.get(inventoryNumber);
	}
}
