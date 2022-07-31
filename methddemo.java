package javadatabase;

public class methddemo {

	public static void main(String[] args) {
		display();
		int i =add(5,8,7);
		System.out.println(i);
		methddemo m1=new methddemo();
        m1.display1();
	}
	public static void display() {
		System.out.println("Varsha");
	}
public void display1() { 
	System.out.println("DeepLoveVarsha");
}
public static int add(int a,int b, int c) {
	int d=a+b+c;
	return d;
}
public  int add1(int a,int b, int c) {
	int d=a+b+c;
	return d;
}
}