package cjcj;


public class hellp12{
	public static void main(String[]args) {//main class를 먼저 작성
		unit[] group = {new marine(),new tank(), new Dropship()};//unit의 그룹을 작성(간단해짐)
		for (int i = 0; i < group.length; i++) {//그룹의 길이를 지정. ~ 하는동안
			group[i].move(100,200);//그룹의 길이까지. 이동하는 값을 지정			
		}
	}
}

abstract class unit {//unit의 값은 추상화 
	int x, y ; //x, y의 값을 생성화
	abstract void move (int x,int y);//추상적이지만 매서드의값 x, y 값을 생성
	void stop(){/*현재위치에 정지 */}//stop의 값을 저장, 어떤기능 위하여 만든 것/*이사이에*/작성, 이부분만 주석임
}

class marine extends unit {//보병이 상속받음
	void move (int x, int y) {//상속받은 메서드의 값을 작성한다.abstract의 값이 2개일경우 한개만 상속받아도 abstract임
		System.out.println("marin[x="+x+",y="+y+"]");
	}
	void stimPack() {/*스팀팩을 사용한다 */}
}

class tank extends unit{
	void move(int x, int y) {
		System.out.println("tank[x="+x+",y="+y+"]");
	}
	void changemode() {/*공격모드를 변환한다.*/}
}

class Dropship extends unit{
	void move (int x, int y) {
		System.out.println("Dropship[x="+x+",y"+y+"]");
	}
	void load() {/*선택된대상을 태운다*/}
	void unload() {/*선택된 대상을 내린다*/}}