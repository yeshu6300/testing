package Gmail;

public class Flipkart
{
  private static String coupon="AA123";
  public static String get_coupon (String un,int pin)
  {
	  if (un.equals("yeshu")&& pin==8498)
	  {
		  return coupon;
	  }
	  else 
	  {
		 return"invalid credentials";
		
	  }
  }
  public static void set_coupon(String un,int pin ,String coupon)
  {
	  if (un.equals("yeshu")&&(pin==8498))
	  {
		  Flipkart.coupon=coupon;
	  }
	  else
	  {
		  System.out.println("invaild credentials");
	  }
  }
}

