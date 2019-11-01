package vtx.priv.examples.inventory.service;

public class InventoryException extends Exception {
	private static final long serialVersionUID = 6832648924112680409L;

	public InventoryException() {
		super();
	}

	public InventoryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InventoryException(String message, Throwable cause) {
		super(message, cause);
	}

	public InventoryException(String message) {
		super(message);
	}

	public InventoryException(Throwable cause) {
		super(cause);
	}
}
