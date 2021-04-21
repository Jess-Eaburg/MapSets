package mapSets;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapsandSets 
{
	private static Set<Long> processing;
	private static Map<String, Set<Long>> clockTime;
	private static final int STOP = 12;

	public static void main(String[] args) 
	{
		processing = new TreeSet<>();
		clockTime = new TreeMap<String, Set<Long>>();
		long start = System.nanoTime();
		long halfTime;
		for (int iterations = 1; iterations <= STOP; ++iterations)
		{
			{
				halfTime = System.nanoTime();
				processing.add(halfTime - start);
				start = System.nanoTime();
			}
		}
		clockTime.put("first test", processing);
		halfTime = System.nanoTime();
		processing.add(halfTime - start);
		System.out.println(clockTime);
	}
}
