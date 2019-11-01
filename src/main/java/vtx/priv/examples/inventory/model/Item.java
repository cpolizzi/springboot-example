package vtx.priv.examples.inventory.model;

import lombok.Data;

@Data
public class Item {
	private Long id;
	private String name;
	private String inventoryNumber;
	private String description;
	private Double wholesaleCost;
	private Double msrp;
	private Double price;
}
