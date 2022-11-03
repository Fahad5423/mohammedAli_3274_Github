/**
 * 
 * @author Mohammed Ali
 *
 */
public class QuantityItem extends AbstractItem {
    private Product prd;
    private double quantity;
    
    public QuantityItem(Product prd, double quantity) {
    	this.prd = prd;
    	this.quantity = quantity;
    }
    
    public double getTotalPrice() {
    	return prd.getPrice() + quantity;
    }
    
    public String getDescription(int length) {
		return String.format("%-" + (length - 13) + "s%8.2f        ", prd.getDescription(), quantity);
	}
}