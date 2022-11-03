//HIDE
public abstract class AbstractItem
{
   /**
      Gets the total price.
      @return the total price
   */
   public abstract double getTotalPrice();

   /**
      Gets a description of this item.
      @param length the length of the description string
      @return a description of this item
   */
   public abstract String getDescription(int length);

   /**
      Formats this item.
      @return a formatted string of this item
   */
   public String format()
   {
      final int COLUMN_WIDTH = 43;
      return getDescription(COLUMN_WIDTH) + String.format("%8.2f", getTotalPrice());
   }
}
