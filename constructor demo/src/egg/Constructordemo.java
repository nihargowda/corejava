package egg;

public class Constructordemo {
int x;
int y;
String s1;
public Constructordemo(int x, int y) {
	
	this.x = x;
	this.y = y;
}

public int add() {

	return x+y;

}

public Constructordemo(String s1) {
	
	
	System.out.println("hello"+s1);
}
}