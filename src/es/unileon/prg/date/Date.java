package es.unileon.prg.date;

/**
 * Clase que representa una fecha (day/month/year)
 * 
 * @author ablanb03
 */

public class Date {
	
	/**
	 * Dia
	 */
	private int day;
	
	/**
	 * Mes
	 */
	private int month;
	
	/**
	 * Anio
	 */
	private int year;
	
	/**
	 * Constructor de la clase. Crea una fecha (Dia/Mes/Anio)
	 * 
	 * @param day
	 * 		Dia
	 * @param month
	 * 		Mes
	 * @param year
	 * 		Anio
	 */
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
	
	/**
	 * Obtiene el anio de la fecha
	 * 
	 * @return Retorna el parametro year
	 */
	public int getYear(){
		return this.year;
	}
	
	/**
	 * Obtiene el mes de la fecha
	 * 
	 * @return Retorna el parametro month
	 */
	public int getMonth(){
		return this.month;
	}
	
	/**
	 * Obtiene el dia de la fecha
	 * 
	 * @return Retorna el parametro day
	 */
	public int getDay(){
		return this.day;
	}
	
	
	/**
	 * Comprueba si el anio de la fecha es el mismo que el de otra que se pasa como parametro. Se utiliza un if
	 *
	 * @param date
	 * 		fecha a comparar
	 * 
	 * @return Retorna true si son iguales y false si son distintos
	 */
	public boolean isSameYear(Date date){
		boolean isSameYear=false;
		if(this.year==date.getYear()){
			isSameYear=true;
		}else{
			isSameYear=false;
		}
		return isSameYear;
	}
	
	/**
	 * Comprueba si el mes de la fecha es el mismo que el de otra que se pasa como parametro. Se utiliza un if
	 *
	 * @param date
	 * 		fecha a comparar
	 * 
	 * @return Retorna true si son iguales y false si son distintos
	 */
	public boolean isSameMonth(Date date){
		boolean isSameMonth=false;
		if(this.month==date.getMonth()){
			isSameMonth=true;
		}else{
			isSameMonth=false;
		}
		return isSameMonth;
	}
	
	/**
	 * Comprueba si el dia de la fecha es el mismo que el de otra que se pasa como parametro. Se utiliza un if
	 *
	 * @param date
	 * 		fecha a comparar
	 * 
	 * @return Retorna true si son iguales y false si son distintos
	 */
	public boolean isSameDay(Date date){
		boolean isSameDay=false;
		if(this.day==date.getDay()){
			isSameDay=true;
		}else{
			isSameDay=false;
		}
		return isSameDay;
	}
	
	/**
	 * Comprueba si la fecha es la misma que la de otra que se pasa como parametro. Se utiliza un if
	 *
	 * @param date
	 * 		fecha a comparar
	 * 
	 * @return Retorna true si son iguales y false si son distintas
	 */
	public boolean isSame(Date date){
		boolean isSame=false;
		if((isSameYear(date)==true)&&(isSameMonth(date)==true)&&(isSameDay(date)==true)){
			isSame=true;
		}else{
			isSame=false;
		}
		return isSame;
	}
	
	/**
	 * Comprueba si el anio de la fecha es el mismo que el de otra que se pasa como parametro sin utilizar if
	 *
	 * @param date
	 * 		fecha a comparar
	 * 
	 * @return Retorna true si son iguales y false si son distintos
	 */
	public boolean isSameYearNoIf(Date date){
		boolean isSameYearNoIf=false;
		int otherYear=date.getYear();
		while(this.year==date.getYear()){
			isSameYearNoIf=true;
			return isSameYearNoIf;
		}
		return isSameYearNoIf;
	}
	
	/**
	 * Comprueba si el mes de la fecha es el mismo que el de otra que se pasa como parametro sin utilizar if
	 *
	 * @param date
	 * 		fecha a comparar
	 * 
	 * @return Retorna true si son iguales y false si son distintos
	 */
	public boolean isSameMonthNoIf(Date date){
		boolean isSameMonthNoIf=false;
		isSameMonthNoIf=this.month==date.getMonth();
		return isSameMonthNoIf;
	}
	
	/**
	 * Comprueba si el dia de la fecha es el mismo que el de otra que se pasa como parametro sin utilizar if
	 *
	 * @param date
	 * 		fecha a comparar
	 * 
	 * @return Retorna true si son iguales y false si son distintos
	 */
	public boolean isSameDayNoIf(Date date){
		boolean isSameDayNoIf=false;
		isSameDayNoIf=!(this.month!=date.getMonth());
		return isSameDayNoIf;
	}
	
	/**
	 * Comprueba si la fecha es la misma que la de otra que se pasa como parametro sin utilizar if
	 *
	 * @param date
	 * 		fecha a comparar
	 * 
	 * @return Retorna true si son iguales y false si son distintas
	 */
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
	
	/**
	 * Obtiene un String con el nombre del mes
	 * 
	 * @return Retorna el nombre del mes
	 */
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
	
	/**
	 * Comprueba si el dia del mes es valido
	 * 
	 * @return Retorna true si el dia existe en el mes y false si no existe en el mes
	 */
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
	
	/**
	 * Obtiene un String con la estacion del anio en la que se encuentra el mes
	 * 
	 * @return Retorna el nombre de la estacion
	 */
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
	
	/**
	 * Obtiene el numero de meses restantes para el final del anio
	 * 
	 * @return Retorna el numero de meses hasta el final del anio
	 */
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
	
	/**
	 * Obtiene un String con la fecha
	 * 
	 * @return Retorna el String con la fecha (Dia/Mes/Anio)
	 */
	public String toString(){
		String dateString;
		dateString=new String(this.day + "/" + this.month + "/" + this.year);
		return dateString;
	}
	
	/**
	 * Obtiene un String con las fechas restantes hasta el final del mes
	 * 
	 * @return Retorna las fechas hasta el final del mes
	 */
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
	
	/**
	 * Obtiene un String con el nombre de los meses con el mismo numero de dias
	 * 
	 * @return Retorna los meses con el mismo numero de dias
	 */
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
	
	/**
	 * Obtiene los dias del anio que han pasado hasta la fecha
	 * 
	 * @return Retorna el numero de dias que han pasado
	 */
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
	
	/**
	 * Obtiene un el numero de intentos que han sido necesarios para que generando una fecha aleatoria se haya acertado la dada. Usa un while
	 * 
	 * @return Retorna el numero de intentos
	 */
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
	
	/**
	 * Obtiene un el numero de intentos que han sido necesarios para que generando una fecha aleatoria se haya acertado la dada. Usa un do-while
	 * 
	 * @return Retorna el numero de intentos
	 */
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
	
	/**
	 * Obtiene el dia de la semana de la fecha a partir del dia de la semana del primer dia del anio que se le ha pasado como parametro
	 *
	 * @param firsWeekdayOfTheYear
	 * 		Dia de la semana del 1 de enero
	 * 
	 * @return Retorna el numero de intentos
	 */
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

