package Gmail;
	public class Gmail 
	{
		static Gmail g1=null;
		private Gmail()
		{
			
		}
		public static Gmail get_gmail_instance()
		{
			if (g1==null)
			{
				g1=new Gmail();
			}
			return g1;
			
			
		}
	}



