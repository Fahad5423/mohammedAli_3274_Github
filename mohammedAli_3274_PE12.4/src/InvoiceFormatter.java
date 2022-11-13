import java.util.ArrayList;

/**
 * 
 * @author Mohammed Ali
 * 11/6/2022
 *
 */
public class InvoiceFormatter {
	private Invoice invoice;
	private Address address;
	
	/**
	 * Constructs an InvoiceFormatter object.
	 * @param anInvoice the invoice
	 */
	public InvoiceFormatter(Invoice anInvoice) {
		invoice = anInvoice;
		address = anInvoice.getAddress();
	}
	
	/**
	 * Formats the invoice.
	 * @return the formatted invoice 
	 */
	public String format() {
		final int DESCRIPTION_WIDTH = 30;
		final int PRICE_WIDTH = 8;
		final int QTY_WIDTH = 5;
		final int TOTAL_WIDTH = 8;
		
		String r =  "                     I N V O I C E\n\n"
	            + address.getName()+ "\n"
	            + address.getStreet()+ "\n"
	            + address.getCity()+ ", "
	            + address.getState()+ " "
	            + address.getZip()+ "\n"
	            + String.format("\n\n%-" + DESCRIPTION_WIDTH + "s%" + 
	            		PRICE_WIDTH + "s%" + QTY_WIDTH + "s%" + TOTAL_WIDTH + "s\n",
	               "Description", "Price", "Qty", "Total");
		
		for(int i = 0; i < invoice.getLineItemCount(); i++) {
			LineItem item = invoice.getLineItem(i);
			
			r += String.format("%-" + DESCRIPTION_WIDTH + "s%" + PRICE_WIDTH
					+ "s%" + QTY_WIDTH + "s%" + TOTAL_WIDTH + "s",
					item.getDescription(),
					item.getPrice(),
					item.getQuantity(),
					item.getTotalPrice() ) + "\n";
			
		}
		
		r += String.format("\nAMOUNT DUE: $%8.2f", invoice.getAmountDue());
		
		return r;
	}
}
