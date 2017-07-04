package com.navigator;

import datastructures.KDTree;

public class Navigator {

	public static void main(String[] args) {
		
		// read the file and populate the tree;
		FileHandler fileHandler = new FileHandler("files/stops.txt");

		try {
			fileHandler.readFile();
			
			// adds in the structure
			KDTree kdt = new KDTree(5);
			double x[] = new double[2];
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// find the nearest bus line to the destination point;
		// (do I need to verify all lines?)
		
		// find the nearest point in the bus line that is the nearest to my actual position;

	}

}
