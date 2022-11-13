import java.util.ArrayList;

/**
   Describes an invoice for a set of purchased products.
*/
public class Invoice
{  
	private Address billingAddress;
	   private ArrayList<LineItem> items;

	   /**
	      Constructs an invoice.
	      @param anAddress the billing address
	   */
	   public Invoice(Address anAddress)
	   {  
	      items = new ArrayList<LineItem>();
	      billingAddress = anAddress;
	   }
	  
	   /**
	      Adds a charge for a product to this invoice.
	      @param aProduct the product that the customer ordered
	      @param quantity the quantity of the product
	   */
	   public void add(Product aProduct, int quantity)
	   {  
	      LineItem anItem = new LineItem(aProduct, quantity);
	      items.add(anItem);
	   }

	   

	   /**
	      Computes the total amount due.
	      @return the amount due
	   */
	   public double getAmountDue()
	   {  
	      double amountDue = 0;
	      for (LineItem item : items)
	      {  
	         amountDue = amountDue + item.getTotalPrice();
	      }
	      return amountDue;
	   }
	   
	   /***
	    * Getters for solution to 12.4 follow
	    */
	   public LineItem getLineItem(int i) {
		   return (LineItem) items.get(i);
	   }
	   
	   public int getLineItemCount() {
		   return items.size();
	   }
	   
	   public Address getAddress() {
		   return billingAddress;
	   }
}

