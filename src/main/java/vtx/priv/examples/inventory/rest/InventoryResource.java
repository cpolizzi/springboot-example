package vtx.priv.examples.inventory.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import vtx.priv.examples.inventory.model.Item;
import vtx.priv.examples.inventory.service.InventoryException;
import vtx.priv.examples.inventory.service.InventoryService;

@RestController
@RequestMapping("/inventory")
public class InventoryResource {

    private InventoryService service;

    @Autowired
    public InventoryResource(InventoryService service) {
        this.service = service;
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.POST,
    		consumes = { MediaType.APPLICATION_JSON_VALUE },
            produces = { MediaType.APPLICATION_JSON_VALUE })
    public void add(@RequestBody Item item) throws InventoryException {
    	service.addItem(item);
    }
    
    @RequestMapping(value = "/remove/{inventoryNumber}", method = RequestMethod.DELETE,
            produces = { MediaType.APPLICATION_JSON_VALUE })
    public Item remove(@PathVariable("inventoryNumber") String inventoryNumber) {
    	return service.removeItem(inventoryNumber);
    }
    
    @RequestMapping(value = "/getAll", method = RequestMethod.GET,
            produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<Item> getAllItems() {
		return service.getAllItems();
	}
}
