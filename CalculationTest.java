package jb01.part04;



/*FileName : CalculationTest.java*/
public class CalculationTest{


//main method 
public static void main(String[]args){
 
int a ;//int data type variable a declaration
a=0;//int data type variable a 에 value값을 도입
int b=1;
int c = 2;

//변수의 값을 출력(문자+연산자 사용=>append)

System.out.println("a="+a":b="+b+":c="+c);
//숫자+ 연산자를 사용하여 계산

int sum = a+b+c;
System.out.println("sum="+sum);
System.out.println("a+b+c="+(a+b+c));//아래 실행문의 출력결과와 비교
System.out.println("a+b+c="+a+b+c)//위의 실행문의 출력결과와 비교

c=c+10;
System.out.println("c=(c+10)"+c);

//연산후 대입연산자를 사용(+=) (c=c+10 동일한 의미)
c+=10;
System.out.println("c+=10="+c);

//논리 반전 연산자 
boolean boo1 =true;
boolean boo2 =!boo1;

}//end of main

}//end of class 


	