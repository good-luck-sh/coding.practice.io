/*숫자를 입력받아 (1~100) 90점이상 수 , 80점이상 우, 70점이상 미, 60점이상 양
그 이하는 가를 출력하기 
(입력한 값이 0~100의 값이어야한다. 그이상 그이하일 경우 어떻게 처리할 것인가)
FileName : Example1.java
실행 ex) java Example1 95
==>실행 결과(출력결과..)
입력하신 값 95점은 수입니다. 
*/ 
import java.util.Scanner;
public class Example1{
public static void main(String[]args){
Scanner scanner =new Scanner(System.in);
System.out.println("점수를 입력해주세요(1~100이하의 숫자를 입력해주세요")
System.out.printt(">");
int testNumber = scanner.nextInt();
if(testNumber>=90){
System.out.printf("입력하신 값 %d점은 수입니다.",testNumber);}
else if(testNumber>=80){
System.out.printf("입력하신 값 %d점은 우입니다.",testNumber);}
else if(testNumber>=70){
System.out.printf("입력하신 값 %d점은 미입니다.",testNumber);}
else if(testNumber>=60){
System.out.printf("입력하신 값 %d점은 양입니다.",testNumber);}
else{
System.out.println("입력하신 값은 %d점으로 1이하 100이상의 숫자를 입력하셨습니다. ",testNumber);
System.out.println(잘못된 숫자를 입력하셨습니다. 다시입력해주세요);
System.out.println("점수를 입력해주세요(1~100이하의 숫자를 입력해주세요")
System.out.printt(">");
int testNumber = scanner.nextInt();



scanner.close();}}
