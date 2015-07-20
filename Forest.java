interface Tree
{
	void oxygen();
	void carbon();
}


interface Animals
{
	void veg();
	void eat();
}


interface Birds
{
	void flying();
	void nonflying();	
}


class Forest1 implements Tree
{
	public void oxygen()
	{
		System.out.println("It take oxygen at night");
	}
	public void carbon()
	{
		System.out.println("It omits carbon");
	}
}


class Forest2 implements Animals
{
	public void eat()
	{
		System.out.println("Tiger");
	}
}

class Forest3 implements Birds
{
	public void flying()
	{
		System.out.println("Parrot is a flying bird");
	}
}
class Forest
{
	public static void main(String args[])
	{
		Forest1 ap=new Forest1();
		ap.oxygen();
		ap.carbon();

		Forest2 ap2=new Forest2();
		ap2.eat();

		Forest3 ap3=new Forest3();	
		ap3.flying();
	}
}



/*Error occured during compilation*/
/*1.Forest.java:35:error: Forest2 is not abstract and does not override abstract method veg() in animals
  2.Forest.java:43:error: Forest3 is not abstract and does not override abstract method nonflying() in birds*/
