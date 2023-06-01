package Gmail;

public class R2
{
	public static void main(String[]args)
	{
		System.out.println(Flipkart.get_coupon("yeshu",8498));
		Flipkart.set_coupon("yeshu",8498,"AA4321");
		System.out.println(Flipkart.get_coupon("yeshu",8498));
	}

}
