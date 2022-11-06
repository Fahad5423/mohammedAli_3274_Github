import java.util.ArrayList;

/**
 * 
 * @author Mohammed Ali
 * 11/6/2022
 *
 */
public class InvoiceFormatter {
	private static ArrayList<LineItem> lineItems;

	private static String format(LineItem item,Product product) {
		return String.format("%-30s%8.2f%5d%8.2f",
		product.getDescription(), product.getPrice(),
		item.getQuantity(), item.getTotalPrice());
	}

	public static String format(Invoice invoice) {
		lineItems=invoice.getItems();

		String r = " I N V O I C E\n\n"
		+ invoice.getAddress().format()
		+ String.format("\n\n%-30s%8s%5s%8s\n",
		"Description", "Price", "Qty", "Total");

		for (LineItem li : lineItems) {
			r = r + format(li,li.getProduct()) + "\n";
		}

		r = r + String.format("\nAMOUNT DUE: $%8.2f", invoice.getAmountDue());

		return r;
	}
}
