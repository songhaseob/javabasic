package g_oop2;

public class B extends A {

	int childVar;
	
	B(){
		this(20);
	}
	
	B(int childVar){
		super(10);
		this.childVar = childVar;
	}
	
	B(double a){
		super(10.0);
	}
	
	public static void main(String[] args) {
		B b = new B();
		
		System.out.println(b.var);
		System.out.println(b.childVar);
	}
}




