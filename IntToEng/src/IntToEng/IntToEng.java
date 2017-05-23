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
		if(n==0)return "zero";
		int sum=0;
		int b=100000;
		for(int i=0; i<num.length;i++){
			num[i]=(n-sum)/b;
			b/=10;
			
		}
		int k=ketasuu(num);
		int[]a=new int[3];
		String s="";
		if(3<k&&k<7){
		    for(int i=0;i<3;i++)a[i]=num[i];//0,1,2
		    s=sanketa(a)+" thousand ";
		    for(int i=0;i<3;i++)a[i]=num[3+i];//3,4,5
		    s+=sanketa(a);
		}
		if(0<k&&k<4){
		    for(int i=0;i<3;i++)a[i]=num[3+i];//3,4,5
		    s=sanketa(a);
		}
		return s;		
		
    }
	static String sanketa(int[]a){
		String s="";
		if(a[0]!=0)s=judge1(a[0])+" hundred ";
		return s+judge10(a[1],a[2]);
	}
	static int ketasuu(int[]a){//0以外
		for(int i=1;i<a.length;i++){
		    if(a[i-1]==0&&a[i]!=0)return a.length-i;
		}
		return a.length;
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
	static String judge10(int i,int j){
		String s="";
		if(i==1)return judgeteen(j);
		else if(i==2)return "twenty";
		else if(i==3)return "thirty";
		else if(i==4)return "fourty";
		else if(i==5)return "fifty";
		else if(i==6)return "sixty";
		else if(i==7)return "seventy";
		else if(i==8)return "eightty";
		else if(i==9)return "ninety";
		s+=" "+judge1(j);
		return s;
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
