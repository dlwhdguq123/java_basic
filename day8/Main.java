package day8;
import java.util.Scanner;
import day8.*;
public class Main {
	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 while(true) {
			 System.out.println("[메뉴]\n"
			 		+ "1.계산기\n"
			 		+ "2.Bmi\n"
			 		+ "3.ForDemo\n"
			 		+ "4.구구단\n"
			 		+ "5.로또/N"
			 		+ "6.이름,배열\n"
			 		+ "7.이름,배열\n"
			 		+ "8.이름과 성적배열\n"
			 		+ "9.홀수,합\n"
			 		+ "10.등수");
			 String select = scanner.next();
			 switch(select) {
			 case"0": System.out.println("종료...."); return;
			 case"1": 
				 Calc calc = new Calc();
				  	  calc.Calc1();
				 break;
			 case"2": 
				 Bmi bmi = new Bmi();
				 	 bmi.Bmi1();
				 break;
			 case"3": 
				 MyCalendar calendar=new MyCalendar();
				 	calendar.Calendar1();
				 break;
			 case"4": 
				 GenderCheker cheker = new GenderCheker();
				 			cheker.cheker();
				 break;
			 case"5": 
				 Grade grade = new Grade();
				 break;
			 default : break;
			 }
		 }
	}
}
