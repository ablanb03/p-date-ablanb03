package es.unileon.prg.date;

public class Date {

	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) throws DateException{
		this.year = year;
		if (month < 1 || month > 12) {
			throw new DateException("Mes " + month + " no valido" + " Valores posibles entre 1 y 12.");
		} else {
			this.month = month;
		}
		
		switch (month){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				if((day<1)||(day>31)){
					throw new DateException("Day " + day + " no valido" + " Valores posibles entre 1 y 31.");
				}else{
					this.day = day;
				}
				break;
			case 2:
				if((day<1)||(day>28)){
					throw new DateException("Day " + day + " no valido" + " Valores posibles entre 1 y 28.");
				}else{
					this.day = day;
				}
				break;
			case 4: case 6: case 9: case 11:
				if((day<1)||(day>30)){
					throw new DateException("Day " + day + " no valido" + " Valores posibles entre 1 y 30.");
				}else{
					this.day = day;
				}
				break;
		}
	}
	
	public int getYear(){
		return this.year;
	}
	
	public int getMonth(){
		return this.month;
	}
	
	public int getDay(){
		return this.day;
	}
	
	public boolean isSameYear(Date date){
		boolean isSameYear=false;
		if(this.year==date.getYear()){
			isSameYear=true;
		}else{
			isSameYear=false;
		}
		return isSameYear;
	}
	
	public boolean isSameMonth(Date date){
		boolean isSameMonth=false;
		if(this.month==date.getMonth()){
			isSameMonth=true;
		}else{
			isSameMonth=false;
		}
		return isSameMonth;
	}
	
	public boolean isSameDay(Date date){
		boolean isSameDay=false;
		if(this.day==date.getDay()){
			isSameDay=true;
		}else{
			isSameDay=false;
		}
		return isSameDay;
	}
	
	public boolean isSame(Date date){
		boolean isSame=false;
		if((isSameYear(date)==true)&&(isSameMonth(date)==true)&&(isSameDay(date)==true)){
			isSame=true;
		}else{
			isSame=false;
		}
		return isSame;
	}
	
	public boolean isSameYearNoIf(Date date){
		boolean isSameYearNoIf=false;
		int otherYear=date.getYear();
		while(this.year==date.getYear()){
			isSameYearNoIf=true;
			return isSameYearNoIf;
		}
		return isSameYearNoIf;
	}
	
	public boolean isSameMonthNoIf(Date date){
		boolean isSameMonthNoIf=false;
		isSameMonthNoIf=this.month==date.getMonth();
		return isSameMonthNoIf;
	}
	
	public boolean isSameDayNoIf(Date date){
		boolean isSameDayNoIf=false;
		isSameDayNoIf=!(this.month!=date.getMonth());
		return isSameDayNoIf;
	}
	
	public boolean isSameNoIf(Date date){
		boolean isSameNoIf=false;
		int isSameYearNoIf=(isSameYearNoIf(date)) ? 1:0;
		int isSameMonthNoIf=(isSameMonthNoIf(date)) ? 1:0;
		int isSameDayNoIf=(isSameDayNoIf(date)) ? 1:0;
		switch(isSameYearNoIf){
			case 1:
				switch(isSameMonthNoIf){
					case 1:
						switch(isSameDayNoIf){
							case 1:
								isSameNoIf=true;
								break;
							case 0:
								isSameNoIf=false;
								break;
						}
						break;
					case 0:
						isSameNoIf=false;
						break;
				}
				break;
			case 0:
				isSameNoIf=false;
				break;
		}
		return isSameNoIf;
	}
	
	public String monthName(){
		String monthName=new String();
		switch (this.month){
			case 1:
				monthName="January";
				break;
			case 2:
				monthName="February";
				break;
			case 3:
				monthName="March";
				break;
			case 4:
				monthName="April";
				break;
			case 5:
				monthName="May";
				break;
			case 6:
				monthName="June";
				break;
			case 7:
				monthName="July";
				break;
			case 8:
				monthName="August";
				break;
			case 9:
				monthName="September";
				break;
			case 10:
				monthName="October";
				break;
			case 11:
				monthName="November";
				break;
			case 12:
				monthName="December";
				break;
		}
		return monthName;
	}
	
	public boolean checkDayOfTheMonth(){
		boolean checkDayOfTheMonth=false;
		switch (this.month){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				if((this.day<1)||(this.day>31)){
					checkDayOfTheMonth=false;
				}else{
					checkDayOfTheMonth=true;
				}
				break;
			case 2:
				if((this.day<1)||(this.day>28)){
					checkDayOfTheMonth=false;
				}else{
					checkDayOfTheMonth=true;
				}
				break;
			case 4: case 6: case 9: case 11:
				if((this.day<1)||(this.day>30)){
					checkDayOfTheMonth=false;
				}else{
					checkDayOfTheMonth=true;
				}
				break;
		}
		return checkDayOfTheMonth;
	}
	
	public String seasonOfTheMonth(){
		String seasonOfTheMonth=new String();
		if((this.month==12)||((this.month>=1)&&(this.month<=2))){
			seasonOfTheMonth="Winter";
		}else if((this.month>=3)&&(this.month<=5)){
			seasonOfTheMonth="Spring";
		}else if((this.month>=6)&&(this.month<=8)){
			seasonOfTheMonth="Summer";
		}else if((this.month>=9)&&(this.month<=11)){
			seasonOfTheMonth="Autumn";
		}
		return seasonOfTheMonth;
	}
	
	public int monthsLeft(){
		int monthsLeft=0;
		switch (this.month){
			case 1:
				monthsLeft=11;
				break;
			case 2:
				monthsLeft=10;
				break;
			case 3:
				monthsLeft=9;
				break;
			case 4:
				monthsLeft=8;
				break;
			case 5:
				monthsLeft=7;
				break;
			case 6:
				monthsLeft=6;
				break;
			case 7:
				monthsLeft=5;
				break;
			case 8:
				monthsLeft=4;
				break;
			case 9:
				monthsLeft=3;
				break;
			case 10:
				monthsLeft=2;
				break;
			case 11:
				monthsLeft=1;
				break;
			case 12:
				monthsLeft=0;
				break;
		}
		return monthsLeft;
	}
	
	public String toString(){
		String dateString;
		dateString=new String(this.day + "/" + this.month + "/" + this.year);
		return dateString;
	}
	
	public String datesUntilEndOfTheMonth(){
		StringBuffer datesUntilEndOfTheMonth;
		datesUntilEndOfTheMonth=new StringBuffer();
		int totalDays=0;
		switch (this.month){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				totalDays=31;
				break;
			case 2:
				totalDays=28;
				break;
			case 4: case 6: case 9: case 11:
				totalDays=30;
				break;
		}
		for(int i=(this.day+1);i<=totalDays;i++){
			datesUntilEndOfTheMonth.append(i + "/" + this.month + "/" + this.year + "\n");
		}
		return datesUntilEndOfTheMonth.toString();
	}
	
	public String monthsWithSameNumberOfDays(){
		String monthsWithSameNumberOfDays=new String();
		int totalDays=0;
		switch (this.month){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				monthsWithSameNumberOfDays="January, March, May, July, August, October, December";
				break;
			case 2:
				monthsWithSameNumberOfDays="February";
				break;
			case 4: case 6: case 9: case 11:
				monthsWithSameNumberOfDays="April, June, September, November";
				break;
		}
		return monthsWithSameNumberOfDays;
	}
	
	public int daysSinceFirstOfTheYear(){
		int daysSinceFirstOfTheYear=0;
		switch (this.month){
			case 1:
				daysSinceFirstOfTheYear=this.day;
				break;
			case 2:
				daysSinceFirstOfTheYear=31 + this.day;
				break;
			case 3:
				daysSinceFirstOfTheYear=59 + this.day;
				break;
			case 4:
				daysSinceFirstOfTheYear=90 + this.day;
				break;
			case 5:
				daysSinceFirstOfTheYear=120 + this.day;
				break;
			case 6:
				daysSinceFirstOfTheYear=151 + this.day;
				break;
			case 7:
				daysSinceFirstOfTheYear=181 + this.day;
				break;
			case 8:
				daysSinceFirstOfTheYear=212 + this.day;
				break;
			case 9:
				daysSinceFirstOfTheYear=243 + this.day;
				break;
			case 10:
				daysSinceFirstOfTheYear=273 + this.day;
				break;
			case 11:
				daysSinceFirstOfTheYear=304 + this.day;
				break;
			case 12:
				daysSinceFirstOfTheYear=334 + this.day;
				break;
		}
		return daysSinceFirstOfTheYear;
	}
	
	public int attemptsToGuessDateWhile(){
		int attemptsToGuessDateWhile=0;
		int generatedMonth=0;
		int generatedDay=0;
		
		while((generatedDay!=this.day)||(generatedMonth!=this.month)){
			generatedMonth=(int) Math.floor(Math.random()*(12-1+1)+1);
			switch(generatedMonth){
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					generatedDay=(int) Math.floor(Math.random()*(31-1+1)+1);
					break;
				case 4: case 6: case 9: case 11:
					generatedDay=(int) Math.floor(Math.random()*(30-1+1)+1);
					break;
				case 2:
					generatedDay=(int) Math.floor(Math.random()*(28-1+1)+1);
					break;
			}
			attemptsToGuessDateWhile++;
		}
		return attemptsToGuessDateWhile;
	}
	
	public int attemptsToGuessDateDoWhile(){
		int attemptsToGuessDateDoWhile=0;
		int generatedMonth=0;
		int generatedDay=0;
		
		do{
			generatedMonth=(int) Math.floor(Math.random()*(12-1+1)+1);
			switch(generatedMonth){
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					generatedDay=(int) Math.floor(Math.random()*(31-1+1)+1);
					break;
				case 4: case 6: case 9: case 11:
					generatedDay=(int) Math.floor(Math.random()*(30-1+1)+1);
					break;
				case 2:
					generatedDay=(int) Math.floor(Math.random()*(28-1+1)+1);
					break;
			}
			attemptsToGuessDateDoWhile++;
		}while((generatedDay!=this.day)||(generatedMonth!=this.month));
		return attemptsToGuessDateDoWhile;
	}
	
	public String dayOfTheWeek(String firsWeekdayOfTheYear){
		String dayOfTheWeek=new String();
		int totalDays=daysSinceFirstOfTheYear();
		int weekday=0;
		switch(firsWeekdayOfTheYear){
			case "Monday":
				weekday=1;
				break;
			case "Tuesday":
				weekday=2;
				break;
			case "Wednesday":
				weekday=3;
				break;
			case "Thursday":
				weekday=4;
				break;
			case "Friday":
				weekday=5;
				break;
			case "Saturday":
				weekday=6;
				break;
			case "Sunday":
				weekday=7;
				break;
		}
		weekday+=totalDays;
		weekday=weekday%7;
		switch(weekday){
			case 1:
				dayOfTheWeek="Monday";
				break;
			case 2:
				dayOfTheWeek="Tuesday";
				break;
			case 3:
				dayOfTheWeek="Wednesday";
				break;
			case 4:
				dayOfTheWeek="Thursday";
				break;
			case 5:
				dayOfTheWeek="Friday";
				break;
			case 6:
				dayOfTheWeek="Saturday";
				break;
			case 0:
				dayOfTheWeek="Sunday";
				break;
		}
		return dayOfTheWeek;
	}
	
}

