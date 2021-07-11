
public class EmU1 {
		int presentft;
		int empcheck;
	  	
		EmU1(int i,int e)
		{
		this.presentft = i;
		this.empcheck = e;
		}
		public EmU1(double d) {}
	void display(EmU1 object)
	{
		System.out.println(object.presentft+"  "+object.empcheck);
	}

		public static void main(String[] args) {
			EmU1 s1 = new EmU1(Math.floor(Math.random() * 10) % 2);
			{
				if (s1.presentft == s1.empcheck)
					s1.display(s1);
				
				{
				System.out.println("employee not present");
				}
			}
		}
}