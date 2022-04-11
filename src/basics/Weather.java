package basics;

public class Weather {
	public static void main(String[] args)
	{
		// This program will give us suggestions what to wear according
		// to the weather (temperature & sun condition)
		int temperature = 65;
		String sunCondition = "Sunny";
		
		if (temperature > 80)
		{
			System.out.println("Its pleasant wear shorts and T-shits.");
		}
		else if (temperature > 60 && sunCondition == "Sunny")
		{
			System.out.println("Its a little windy perhaps wear full selves");
			System.out.println("Wear a hat to block the sun.");
		}
		else if (temperature > 50 || sunCondition == "Overcast")
		{
			System.out.println("This is a cool day make sure to wear warm clothes.");
		}
		else
		{
			System.out.println("Wear warm clothes its cold outside");
		}
		
	}

}
