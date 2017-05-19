package IntToEng;

import java.util.Scanner;

public class IntToEng {

	public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        while(true){
	        int input = sc.nextInt();

	        System.out.println(translateEng(input));
	        }

	}
	static String translateEng(int n) {
		int[]num=new int[6];
		int j=n/100000;
		int m=(n-j*100000)/10000;
		int s=(n-100000*j-m*10000)/1000;
		int h=(n-100000*j-m*10000-s*1000)/100;
		int z=(n-100000*j-m*10000-s*1000-h*100)/10;
		int i=(n-100000*j-m*10000-s*1000-h*100-z*10);
		//System.out.println(m+","+s);
		//6桁の場合
		if(j!=0){
			if(z!=1&&m==1)return (judge1(j)+" hundred "+judgeteen(s)+" thousand "+judge1(h)+" hundred "+judge10(z)+" "+judge1(i));
		}
		if(n==0){
			if(z==1)return "zero";
		}
		if(h==0){
			if(z==1)
				return (judgeteen(i));
			else
				return (judge10(z)+" "+judge1(i));
		}
		if(z==1){
		return (judge1(h)+" hundred "+judgeteen(i));
		} else {
		return (judge1(h)+" hundred "+judge10(z)+" "+judge1(i));
		}
		
    }
	//static int ketasuu(int )
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
		if(i==2)return "twenty";
		else if(i==3)return "thirty";
		else if(i==4)return "fourty";
		else if(i==5)return "fifty";
		else if(i==6)return "sixty";
		else if(i==7)return "seventy";
		else if(i==8)return "eightty";
		else if(i==9)return "ninety";
		return "";
	}
	static String judgeteen(int i){
		if(i==1)return "eleven";
	else if(i==2)return "twelve";
	else if(i==3)return "thirteen";
	else if(i==4)return "fourteen";
	else if(i==5)return "fifteen";
	else if(i==6)return "sixteen";
	else if(i==7)return "seventeen";
	else if(i==8)return "eighteen";
	else if(i==9)return "nineteen";
	else return "ten";
	
	}
}
