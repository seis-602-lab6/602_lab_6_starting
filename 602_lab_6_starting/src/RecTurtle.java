import java.awt.Color;

public class RecTurtle
{
	public static void drawSquare(Turtle t, double side)
	{
		// center your square at current turtle location
		// draw your square, then return turtle to original
		// location

		t.setAngle(90); // point up/north
		t.penUp();
		t.goForward(side / 2.0);
		t.penDown();
		t.turnLeft(90);
		t.goForward(side / 2.0);
		t.turnLeft(90);
		t.goForward(side);
		t.turnLeft(90);
		t.goForward(side);
		t.turnLeft(90);
		t.goForward(side);
		t.turnLeft(90);
		t.goForward(side / 2.0);
		t.turnLeft(-90);
		t.penUp();
		t.goForward(-side / 2.0);

	}

	public static void drawNestedSquares(Turtle t, double initialSide, double sideInc, int num)
	{
		if (num == 0)
			return;

		changeColor(t, num);
		// finish this...
		drawSquare(t, initialSide);

		drawNestedSquares(t, initialSide + sideInc, sideInc, num - 1);

	}

	private static void changeColor(Turtle t, int num)
	{
		switch (num % 3)
		{
		case 0:
			t.setPenColor(Color.BLUE);
			break;
		case 1:
			t.setPenColor(Color.RED);
			break;
		case 2:
			t.setPenColor(Color.GREEN);
			break;
		}
	}

	public static void spiral(Turtle t, double side, double inc, int num)
	{
		if (num == 0)
			return;
		
		changeColor(t,num);
		
		t.goForward(side);
		t.turnLeft(90);
		spiral(t, side+inc, inc, num-1);
	}
	
	public static void main(String[] args)
	{
		Turtle t = new Turtle(0.0, 0.0, 0.0);
		t.setPenRadius(0.005);
		t.setPenColor(Color.RED);

		// drawSquare(t, 200);

		// drawNestedSquares(t, 50, 20, 20);
		
		t.penDown();
		spiral(t,10,2,200);
		
	}

}
