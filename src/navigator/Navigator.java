package navigator;

import java.util.Map;
import smartcity.gtfs.*;


public class Navigator {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		
		// Read user input
		double[] coordinate = {-4, 2};
		
		/**
		 * Reads the file and mount the tree.
		 */
		// String source = "/home/igor/git/workspace/FeedDatabase/src/files/routes.txt";
		// FileHandler fileHandler = new FileHandler(source);
		double[][] points = {{-1,   3,
							  -1,  10,
							   0.5, 4,
							   3,   3,
							  -5,   6,
							   2, 0.5,
							   2,  -5,
							  -4,  -4}};
		
		double[] closest = nearestPoints(coordinate, points);
		System.out.println("Nearest coordinates: " + closest[x] + ", " + closest[y]);
		
		double finalDistance = distance(coordinate[x], coordinate[y], closest[x], closest[y]);
		System.out.println("Nearest distance: " + finalDistance);
		
		/**
		 * Once found the bus line that reaches our destination, 
		 * we need to find out the point of the same bus line that is 
		 * the nearest of our actual position.  
		 */
		
		
		

	}
	
	public static double distance(double x1, double y1, double x2, double y2) {
		double x = Math.pow(x2 - x1, 2);
		double y = Math.pow(y2 - y1, 2);
		return Math.sqrt(x + y);
	}
	
	public static double[] nearestPoints(double[] coordinates, double[][] points) {
		int x = 0;
		int y = 1;
		double[] closestPoint = points[0];
		double closestDist = distance(coordinates[x], coordinates[y], closestPoint[x], closestPoint[y]);
		
		for (int i = 0; i < points.length; i++) {
			System.out.println(coordinates[x]+"::"+coordinates[y]+"::"+points[i][x]+"::"+points[i][y]);
			
			double dist = distance(coordinates[x], coordinates[y], points[i][x], points[i][y]);
			System.out.println(dist+"<"+closestDist);
			if (dist < closestDist && dist != 0.0) {
				closestDist = dist;
				closestPoint = points[i];
			}
		}
		
		return closestPoint;
	}

}
