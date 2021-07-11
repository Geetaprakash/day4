

public class EmU2 {
	int isfultime = 1;
	static int emrperhr = 20;
	static int Emphrs = 8;
	static int empwage = 0;
	int empcheck;  	
		EmU2(int i,int e,int eh,int ew)
		{
		this.isfultime = i;
		this.emrperhr = e;
		this.Emphrs = eh;
		this.empwage = ew;
		}
	public EmU2(double d) {}
	void display(EmU2 object)
	{
		System.out.println(object.isfultime+"  "+object.emrperhr+"  "+object.Emphrs+"  "+object.empwage);
	}

		public static void main(String[] args) {
			EmU2 s1 = new EmU2(Math.floor(Math.random() * 10) % 2);
			{
				int Emphrs = 8;
				int empwage = 0;
				int empcheck;
				if (s1.isfultime == s1.empcheck)
					s1.display(s1);
				
				{
					int emprperhr;
		
				empwage = (Emphrs * emrperhr);
				System.out.println("empwage: " + empwage);
				}
			}
		}
	}