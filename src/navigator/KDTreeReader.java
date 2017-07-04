package navigator;

import java.io.FileNotFoundException;
import java.util.*;

import datastructures.KDTree;
import smartcity.gtfs.Stop;
import smartcity.util.CSVReader;

public class KDTreeReader {

	public static KDTree loadMapFromFile(String filename) throws FileNotFoundException {
		List<String> stops = new ArrayList<String>();
		CSVReader reader = new CSVReader(filename, ",");
		
		while(reader.hasNext()) {
			String id = reader.next();
			reader.skipNext();
			String name = reader.next();
			reader.skipNext();
			double lat = reader.nextDouble();
			double lon = reader.nextDouble();
			stops.add(new Stop(id,name,lat,lon));
		}
		
		KDTree tree = new KDTree(stops);
		
		return tree;
	}
	
}
