
public class Rectangle {
	
	private int lenght;
	private int width;
	
	
	public Rectangle(int lenght, int width)
	{
		this.lenght = lenght;
		this.width = width;
	}
	
	public void draw()
	{
		for(int i=0; i<this.width; i++)
		{
			for(int j=0; j<this.lenght; j++)
			{
				System.out.print("X");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public int calcArea()
	{
		int sum = this.lenght * this.width;
		return sum;
	}
	
	public int calcPerimeter()
	{
		int sum = (this.lenght) * 2 + (this.width * 2);
		return sum;
	}
	
	public void scale(int factor) 
	{
		this.lenght = this.lenght * factor;
		this.width = this.width * factor;
	}
	
	public String toString() 
	{
		String str = "" + this.lenght + ", " + this.width;
		return str;
	}
	
	

}