package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.black);
		StdDraw.filledRectangle(.5,.5,.45,.3);
		
		StdDraw.setPenColor(Color.black);
		StdDraw.rectangle(.5,.5,.45,.3);

		StdDraw.setPenColor(Color.yellow);
		StdDraw.filledCircle(.5,.5,.2);

		StdDraw.setPenColor(Color.black);
		double[] xs = {.5,.95,.95};
		double[] ys = {.5,.8,.2};
		StdDraw.filledPolygon(xs,ys);
		
		StdDraw.setPenColor(Color.black);
		StdDraw.filledCircle(.5,.6,.02);
		
		StdDraw.setPenColor(Color.white);
		StdDraw.filledCircle(.85,.5,.02);
		
		StdDraw.setPenColor(Color.white);
		StdDraw.filledCircle(.75,.5,.02);
		
		StdDraw.setPenColor(Color.white);
		StdDraw.filledCircle(.65,.5,.02);

		StdDraw.setPenRadius(.01);
		StdDraw.setPenColor(Color.blue);
		StdDraw.rectangle(.5, .5, .45, .25);
		
		StdDraw.setPenColor(Color.blue);
		StdDraw.rectangle(.5, .5, .45, .275);
		
		StdDraw.setPenRadius(0.01);
		StdDraw.setPenColor(Color.black);
		StdDraw.rectangle(.5,.5,.45,.3);

	}
}