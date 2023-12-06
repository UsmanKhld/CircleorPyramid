import java.util.*;

public class CircleorPyramid {

	public static void main(String[] args) 
	{
		String userInput;
		int radius, length, height, width;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Circle or Pyramid: ");
		userInput = input.next();
		
		if (userInput.equalsIgnoreCase("circle"))
		{
			System.out.print("What is the radius of your circle? ");
			radius = input.nextInt();
			Calculate_circle(radius);
		}
		else if (userInput.equalsIgnoreCase("pyramid"))
		{
			System.out.print("What is the length of your pyramid? ");
			length = input.nextInt();
			
			System.out.print("What is the height of your pyramid? ");
			height = input.nextInt();
			
			System.out.print("What is the width of your pyramid? ");
			width = input.nextInt();
			Calculate_pyramid(length, width, height);
			
		}
		else
		{
			System.out.println("Not a valid input");
		}
		input.close();
	}
	
	public static void Calculate_circle(int radius)
	{
		double area = Math.PI * radius * radius;;
		double circumference = 2 * Math.PI * radius;
		
		System.out.printf("The area of the circle: %.2f ", area);
		System.out.println();
		System.out.printf("The circumference of the circle: %.2f ", circumference);
	}
	
	public static void Calculate_pyramid(int l, int w, int h)
	{
		double baseArea = l * w;
		double volume = baseArea * h / 3;
		
		System.out.printf("The base area of the pyramid: %.2f ", baseArea);
		System.out.println();
		System.out.printf("The volume of the pyramid: %.2f ", volume);
	}

}
