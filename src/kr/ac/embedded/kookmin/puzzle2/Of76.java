package kr.ac.embedded.kookmin.puzzle2;

interface Nose {//이미 상속받은 class에 또 상속을 하고 싶을때 사용.
	public int iMethod();//method 구현을 하면 안된다.
}

abstract class Picasso implements Nose {
	public int iMethod(){
		return 7;
	}
}

class Clowns extends Picasso {
}

class Acts extends Picasso {
	public int iMethod(){
		return 5;
	}
}

public class Of76 extends Clowns {
	public static void main(String[] args) {
		Nose[] i = new Nose[3];
		i[0] = new Acts();
		i[1] = new Clowns();
		i[2] = new Of76();
		
		for (int x = 0; x < 3; x++) {
			System.out.println(i[x].iMethod() + " " + i[x].getClass());
		}
	}
}