import java.awt.Color;

public class RecTurtle
{
	public static void drawSquare(Turtle t, double side)
	{
		// center your square at current turtle location
		// draw your square, then return turtle to original
		// location

		t.setAngle(90);
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

		drawSquare(t, initialSide);

		drawNestedSquares(t, initialSide + sideInc, sideInc, num - 1);

		// finish this...
	}

	public static void spiral(Turtle t, double side, double inc, int num)
	{

		if (num == 0)
		{

			return;
		}

		t.goForward(side);
		t.turnLeft(90);
		spiral(t, 50, 20, 20);

	}

	public static void main(String[] args)
	{

		Turtle t = new Turtle(0, 0, 0);

		t.setPenColor(Color.pink);
		/*
		 * drawSquare(t, 100.0); drawNestedSquares(t, 50, 20, 20);
		 */

		t.penDown();
		spiral(t, 10, 2, 100);
	}

}
