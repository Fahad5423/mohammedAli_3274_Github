//HIDE
public class QuantityItemTester
{
   public static void main(String[] args)
   {

      AbstractItem a = new QuantityItem(new Product("Toaster", 29.95), 3);
      AbstractItem b = new QuantityItem(new Product("Hair dryer", 24.95), 1);
      AbstractItem c = new QuantityItem(new Product("Car vacuum", 19.99), 2);

      System.out.println(a.format());
      System.out.println("Expected: Toaster                          29.95    3   89.85");
      System.out.println(b.format());
      System.out.println("Expected: Hair dryer                       24.95    1   24.95");
      System.out.println(c.format());
      System.out.println("Expected: Car vacuum                       19.99    2   39.98");
   }
}
