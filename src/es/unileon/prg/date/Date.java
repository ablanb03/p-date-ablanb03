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
			case 1:
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
			case 3:
				if((day<1)||(day>31)){
					throw new DateException("Day " + day + " no valido" + " Valores posibles entre 1 y 31.");
				}else{
					this.day = day;
				}
				break;
			case 4:
				if((day<1)||(day>30)){
					throw new DateException("Day " + day + " no valido" + " Valores posibles entre 1 y 30.");
				}else{
					this.day = day;
				}
				break;
			case 5:
				if((day<1)||(day>31)){
					throw new DateException("Day " + day + " no valido" + " Valores posibles entre 1 y 31.");
				}else{
					this.day = day;
				}
				break;
			case 6:
				if((day<1)||(day>30)){
					throw new DateException("Day " + day + " no valido" + " Valores posibles entre 1 y 30.");
				}else{
					this.day = day;
				}
				break;
			case 7:
				if((day<1)||(day>31)){
					throw new DateException("Day " + day + " no valido" + " Valores posibles entre 1 y 31.");
				}else{
					this.day = day;
				}
				break;
			case 8:
				if((day<1)||(day>31)){
					throw new DateException("Day " + day + " no valido" + " Valores posibles entre 1 y 31.");
				}else{
					this.day = day;
				}
				break;
			case 9:
				if((day<1)||(day>30)){
					throw new DateException("Day " + day + " no valido" + " Valores posibles entre 1 y 30.");
				}else{
					this.day = day;
				}
				break;
			case 10:
				if((day<1)||(day>31)){
					throw new DateException("Day " + day + " no valido" + " Valores posibles entre 1 y 31.");
				}else{
					this.day = day;
				}
				break;
			case 11:
				if((day<1)||(day>30)){
					throw new DateException("Day " + day + " no valido" + " Valores posibles entre 1 y 30.");
				}else{
					this.day = day;
				}
				break;
			case 12:
				if((day<1)||(day>31)){
					throw new DateException("Day " + day + " no valido" + " Valores posibles entre 1 y 31.");
				}else{
					this.day = day;
				}
				break;
		}
	}
	
	

	@Override
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}

}

