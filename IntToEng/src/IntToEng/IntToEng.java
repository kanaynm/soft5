package IntToEng;

import java.util.Scanner;

public class IntToEng {

	public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        int input = sc.nextInt();

	        System.out.println(translateEng(input));

	}
	static String translateEng(int n) {
		int h=n/100;
		int z=(n-h*100)/10;
		int i=n-(h*100+z*10);
		System.out.println("i="+judge1(i));
        return "";
    }
	static String judge1(int i){
		if(i==1)return "one";
		else if(i==2)return "two";
		else if(i==3)return "three";
		else if(i==4)return "four";
		else if(i==5)return "five";
		else if(i==6)return "six";
		else if(i==7)return "seven";
		else if(i==8)return "eight";
		else if(i==9)return "nine";
		return "";
	}
	static String judge10(int i){
		if(i==1)return "ten";
		else if(i==2)return "twenty";
		else if(i==3)return "t";
		else if(i==4)return "four";
		else if(i==5)return "five";
		else if(i==6)return "six";
		else if(i==7)return "seven";
		else if(i==8)return "eight";
		else if(i==9)return "nine";
		return "";
	}
	static String judge100(int i){
		if(i==1)return "ten";
		else if(i==2)return "twenty";
		else if(i==3)return "t";
		else if(i==4)return "four";
		else if(i==5)return "five";
		else if(i==6)return "six";
		else if(i==7)return "seven";
		else if(i==8)return "eight";
		else if(i==9)return "nine";
		return "";
	}
}
