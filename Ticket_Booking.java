package Day2tasks;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

import util.Booking;

public class Ticket_Booking {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Booking obj=new Booking();
		int x=0;
		do {
			System.out.println("Enter Your Phone Number");
			Long phnno=sc.nextLong();
		    x=obj.phonecheck(phnno);
		}while(x==0);                             //To check the mobile number is correct
		int y=0;
		do {
			System.out.println("Enter the password");
			int pass=sc.nextInt();
		    y=obj.passcheck(pass);
		}while(y==0);                            //To check the password is coreect
		int z=0;
		String mtime=null;
		do {
		System.out.println("Enter Movie Date in the formt of (YYYY-MM-DD)");
		String mdate=sc.next();
		System.out.println("Enter Movie Time in the form of (HH:MM) ");
		mtime=sc.next();
		z=obj.bookingtime(mdate,mtime);
		}while(z==0);                          //to check the booking date is future or not
		String tab[][]=new String[3][2];
		tab[0][0]="Karnan";
		tab[0][1]="1";
		tab[1][0]="Bigil";
		tab[1][1]="2";
		tab[2][0]="Surarai potru";
		tab[2][1]="3";
		System.out.println("Movies are listed here!");
		System.out.println("Enter the repective number of your favourite Movie");   
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(tab[i][j]+"   ");                      // To list the movie
			}
			System.out.print("\n");
		}
		int number=sc.nextInt();                                               // To get the favourite movie
		System.out.println("Enter the number of tickets");
		int noti=sc.nextInt();
		double amt=obj.billwithgst(number,noti);                               // To get the bill with gst
		double rs=obj.offer(amt,number);
		System.out.println("Here we are giving 15% discount for child those who are below in the age of 15");
		System.out.println("Enter no of child");
		int child=sc.nextInt();
		double total_bill=obj.childspecial(rs,child,noti);                     // To get the 15% discount on bill only for child
		System.out.println("If you want to book the online press 1 or press 2");
		int key=sc.nextInt();
		switch(key) {                                                         // To find the card is valid or not
		case 1:{
			int a=0;
			int b=0;
			int c=0;
			do {
			System.out.println("Enter your card number");
			long cardno=sc.nextLong();
			a=obj.creditcard(cardno);
			}while(a==0);
			do {
				System.out.println("Enter expire date");
				String edate=sc.next();
				b=obj.cardexpire(edate);
				}while(b==0);
			do {
				System.out.println("Enter CVV");
				String cvv=sc.next();
				c=obj.cvvcheck(cvv);
				}while(c==0);
			System.out.println("Payment Successful");
			System.out.println("Thank You");
			break;
		}
		case 2:
			System.out.println("Thank You");
			break;
		default:
			System.out.println("Press 1/2");
		}
	}

}
