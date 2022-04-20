package abc;
class S{
	private int a;
	private int b;
	private int c;
	void seta(int a)
	{
		this.a = a;
	}
	int geta()
	{
		return this.a;
	}
	void setb(int b)
	{
		this.b = b;
	}
	int getb()
	{
		return this.b;
	}
	void setc(int c)
	{
		this.c = c;
	}
	int getc()
	{
		return this.c;
	}
}

public class abc{
	public static void main(String args[])
	{
		S s = new S();
		s.seta(1000);
		System.out.println(s.geta());
		s.setb(20);
		System.out.println(s.getb());
		s.setc(30);
		System.out.println(s.getc());
		
	}
	
}