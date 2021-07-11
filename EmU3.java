public class EmU3 {
	int partime = 1
	int isfultime = 2;
	static int emrperhr = 20;
	static int Emphrs = 0;
	static int empwage = 0;
	int empcheck;  	
		EmU3(int i,int e,int eh,int ew,int p)
		{
		this.isfultime = i;
		this.emrperhr = e;
		this.Emphrs = eh;
		this.empwage = ew;
		this.partime = p;
		}
	public EmU3(double d) {}
	void display(EmU3 object)
	{
		System.out.println(object.isfultime+"  "+object.emrperhr+"  "+object.Emphrs+"  "+object.empwage+" "object.partime);
	}

		public static void main(String[] args) {
			EmU3 s1 = new EmU3(Math.floor(Math.random() * 10) % 2);
			{
				int Emphrs = 8;
				int empwage = 4;
				int empcheck;
				
					if (empcheck == isfultime)
					s1.display(s1);
				
				{
					int emprperhr;
		
				empwage = (Emphrs * emrperhr);
				System.out.println("empwage: " + empwage);
				}
			}
		}
	}