package basics;

public class Cities {
	public static void main(String[] args)
	{
		// declare & define an array
		String[] cities = {"NewYork", "Dublin", "Germany", "Dallas"};
		System.out.println(cities[0]);
		System.out.println("------------------------------------------");
		//declare & define array size
		String[] states = new String[4];
		states[0] = "UAE";
		states[1] = "Australia";
		states[2] = "Sweden";
		states[3] = "Pakistan";
		
		int i = 0;
		// do loop first enter the loop & then tests condition
		do 
		{
			System.out.println(states[i]);
			i = i + 1;	
		}
		while(i < 4);
		//declare array
		String[] regions;
		
		//define array
		regions = new String[5];
		regions[0] = "Europe";
		regions[1] = "Asia";
		regions[2] = "Middle East";
		regions[3] = "America";
		regions[4] = "Africa";
		
		// while loop tests condition first & then run the loop
		System.out.println("------------------------------------------");
		int index = 0;
		boolean regionFound = false;
		while(!regionFound)
		{
			String r = regions[index];
			if (r == "Asia")
			{
				regionFound = true;
				System.out.println("I belong to region : "+ r);	
			}
			index = index + 1;	
		}
		
		// For loop
		System.out.println("------------------------------------------");
		for(int x = 0; x < 3; x++)
		{
			System.out.println(cities[x]);
		}
		
	}

}
