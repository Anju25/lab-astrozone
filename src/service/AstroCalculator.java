package service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.User;
public class AstroCalculator
{
	String d; String sign;
	int month;
	int date;
	public String findSign(User obj2)
    {
    d=obj2.getDob();
    DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy");
	LocalDate input=LocalDate.parse(d,dtf);
    date=input.getDayOfMonth();
	month=input.getMonthValue();
	if(month==1)
	{
		if(date<20)
			sign="Capricorn";
		else 
			sign="Aquarius";
	}
	else if(month == 2)
	{
		if(date<19)
			sign="Aquarius";
		else
			sign="Pisces";
	}
	else if(month==3)
	{
		if(date<21)
			sign="Pisces";
		else
			sign="Aries";
	}
	else if(month==4)
	{
		if(date<20)
			sign="Aries";
		else
			sign="Taurus";
	}
	else if(month==5)
	{
		if(date<21)
			sign="Taurus";
		else
			sign="Gemini";
	}
	else if(month==6)
	{
		if(date<21)
		
			sign="Gemini";
		 else
			sign="Cancer";
		
	}
	else if(month==7)
	{
		if(date<23)
			sign="Cancer";
		else
			sign="Leo";
	}
	else if(month==8)
	{
		if(date<23)
			sign="Leo";
		else
			sign="Virgo";
	}
	else if(month==9)
	{
		if (date < 23)
            sign = "Virgo";
         else
            sign = "Libra";	
	}
	else if(month==10)
	{
		 if (date < 23)
	            sign = "Libra";
	         else
	           sign = "Scorpio";
	}
	else if(month==11)
	{
		if (date < 22)
            sign = "scorpio";
         else
            sign = "Sagittarius";	
	}
	else if (month ==12) {
        if (date < 22)
           sign = "Sagittarius";
        else
           sign ="Capricorn";
     }
	else {
		sign=null;
	}
	
	return sign;
	
	}
}