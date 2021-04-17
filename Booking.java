package util;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.YearMonth;

public class Booking {
	public int phonecheck(long phnno) {                                        // method for find the givrn number is valid or not
		String phn = Long.toString(phnno);
		int len=phn.length();
		if((phnno/1000000000)==0 && len!=10) {
			System.out.println("Your phone number is invalid");
			return 0;
		}
		else {
			return 1;
		}
	}
	public int passcheck(int pass) {                                           // method for finding the password is corret or not
		String pw = Integer.toString(pass);
		int l=pw.length();
		if(l==8) {
			return 1;
		}
		else {
			System.out.println("Your password is Wrong");
			return 0;
		}
	}
	public int bookingtime(String mdate, String mtime) {                        // Method to find the given time is future or not
		LocalDate bdate=LocalDate.now();
		LocalTime btime=LocalTime.now();
		LocalDate mvdate=LocalDate.parse(mdate);
		LocalTime mvtime=LocalTime.parse(mtime);
		if(mvdate.isAfter(bdate) || mvtime.isAfter(btime)) {
			System.out.print("your booking date : "+bdate+"		");
			System.out.println("Your booking time : "+btime);
			System.out.print("Your Movie date is : "+mvdate+"		");
			System.out.println("Your Movie time is : "+mvtime);
			return 1;
		}
		else {
			System.out.println("You can't book tickets for past days");
			return 0;
		}
	}
	public double billwithgst(int number,int noti) {                              // Method to calculate the bill amount with GST
		double rupee = 0;
		switch(number){
		case 1:{
			double rs=noti*200;
			//calculating GST 
			double gst=rs*0.07;
		    rupee=rs+gst;
			System.out.println("GST is "+gst);
			System.out.println("Your bill amount is "+rupee);
			break;
		}
		case 2:{
			double rs=noti*150;
			//calculating GST
			double gst=rs*0.07;
		    rupee=rs+gst;
			System.out.println("GST is "+gst);
			System.out.println("Your bill amount is "+rupee);
			break;
		}
		case 3:
		{
			double rs=noti*250;
			//calculating GST 
			double gst=rs*0.07;
			rupee=rs+gst;
			System.out.println("GST is "+gst);
			System.out.println("Your bill amount is "+rupee);
			break;
		}
		default:{
			System.out.println("Please press 1/2/3");
		}
			
		}
		return rupee;
	}
	public double offer(double amt, int number) {                               //Method to calculate bill amount with 50% discount
		double rs=0;
		if(number==3){
			System.out.println("Your will get 50% discount");
			rs=amt+(amt*0.0125);
			System.out.println("Bill Amount :"+rs);
			return rs;
		}
		else {
		    return amt;
		}
	}
	public double childspecial(double rs, int child,int noti) {               // Method to claculate the discount for child
		double siamt=rs/noti;
		double sich=siamt+(siamt*0.15);
		int numad=noti-child;
		double total_adult=numad*siamt;
		double total_child=sich*child;
		double total_bill=total_adult+total_child;
		System.out.println("No of adults :"+numad);
		System.out.println("Amount for adults :"+total_adult);
		System.out.println("No of Child :"+child);
		System.out.println("Amount for child :"+total_child);
		System.out.println("YOUR TOTAL BILL AMOIUNT :"+total_bill);
		return 0;
	}
	public int creditcard(long cardno) {                                      //Method to find the credit card nunber is correct or not	
		String num = Long.toString(cardno);
		int len=num.length();
		if(len==12) {
			return 1;
		}
		else {
			System.out.println("Your card number is invalid");
			return 0;
		}
	}
	public int cardexpire(String edate) {                                     //Method to find the card expired is not  
		YearMonth monday=YearMonth.parse(edate);
		YearMonth thismod=YearMonth.now();
		if(monday.isAfter(thismod)) {
			return 1;
		}
		else {
			System.out.println("Your card is expired");
			return 0;
		}
	}
	public int cvvcheck(String cvv) {                                        //Method to find the cvv is correct or not
		int len=cvv.length();
		if(len==3) {
			return 1;
		}
		else {
			System.out.println("Your CVV is invalid");
			return 0;	
		}
	}
	
	

}
