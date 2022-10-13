package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(220,200,220);
		StdDraw.filledRectangle(.5,.5,.4,.25);
		
		StdDraw.setPenColor(240,240,200);
		StdDraw.filledCircle(.5,.5,.25);
		
		StdDraw.setPenColor(140,220,160);
		StdDraw.filledCircle(.5,.5,.18);
		
		StdDraw.setPenColor(150,200,220);
		StdDraw.filledCircle(.5,.5,.1);
		StdDraw.setPenColor(255,175,95);
		StdDraw.filledCircle(.8,.65,0.05);
		
		StdDraw.setPenColor(255,175,95);
		StdDraw.filledCircle(.2,.65,0.05);
		
		StdDraw.setPenColor(255,175,95);
		StdDraw.filledCircle(.2,.35,0.05);
		
		StdDraw.setPenColor(255,175,95);
		StdDraw.filledCircle(.8,.35,0.05);
		
		StdDraw.setPenColor(150,200,220);
		StdDraw.setPenRadius(0.025);
		StdDraw.rectangle(.5,.5, .4, .25);
		
	}
}