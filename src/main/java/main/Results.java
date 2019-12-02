package main;

public class Results {

	static float physics = 150;
	static float chemistry = 15;
	static float biology = 150;
	static float total = physics+chemistry+biology;
	static float percentage = (total*100)/450;

	public static void main(String[] args) {

		printResults();
		printPercentage();
		passCheck();		
	}

	public static void printResults(){

		System.out.println("Physics:	"+physics);
		System.out.println("Chemistry:	"+chemistry);
		System.out.println("Biology:	"+biology);
		System.out.println("\nTotal:		"+total);
	}

	public static void printPercentage(){

		double rounded = Math.round(percentage * 100.0) / 100.0;
		System.out.println("Percentage:	"+rounded+"%");
	}

	public static void passCheck(){

		if (percentage > 60)
		{
			System.out.println("\nPASSED");
			passedEachExam();
		}

		else
		{
			System.out.println("\nFAILED:");
			passedEachExam();
		}
	}

	public static void passedEachExam(){

			float physPercent = (physics*100)/150;
			float chemPercent = (chemistry*100)/150;
			float bioPercent = (biology*100)/150;

			int tally = 0;

			if (physPercent < 60)
			{
				System.out.println("Failed Physics");
				tally++;
			}

			if (chemPercent < 60)
			{
				System.out.println("Failed Chemistry");
				tally++;
			}

			if (bioPercent < 60)
			{
				System.out.println("Failed Biology");
				tally++;
			}
			
			if (tally > 0)
			{
				System.out.println("\nNumber of courses failed: "+tally);
			}
	}
}