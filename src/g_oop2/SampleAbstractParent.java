package g_oop2;

public abstract class SampleAbstractParent {
	
	void method(){
		
	}
	
	//추상 메서드 : 선언부만 있고 구현부는 없는 메서드
	abstract void abstractMethod();

}

class SampleAbstractChild extends SampleAbstractParent {
	
	@Override
	void abstractMethod(){
		
	}
	
}













