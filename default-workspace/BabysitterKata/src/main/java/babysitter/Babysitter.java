package babysitter;

import java.math.BigDecimal;
import java.util.Scanner;

public class Babysitter {

	public static void main(String[] args) {

		int earlyHourRate = 12;
		int bedHourRate = 8;
		int lateHourRate = 16;
		int startTime;
		int bedTimeHours = 0;
		int lateHours = 0;
		int earlyHours = 0;
		int totalHours;
		{

			Scanner input = new Scanner(System.in);
			System.out.println(
					"Please enter the hour you started in,(For example, if you started at 6:30, please enter 6)");
			startTime = input.nextInt();

			if ((startTime >= 5) && (startTime < 8)) {
				earlyHours = (8 - startTime);
			}
			//if ((startTime > 8) && (startTime < 12)) {
				//bedTimeHours = (12 - startTime);
			//} else {
				//lateHours = (4 - startTime);
			}
			System.out.println("Total pay for the day will be" + lateHours + bedTimeHours + earlyHours);
		}
	}

