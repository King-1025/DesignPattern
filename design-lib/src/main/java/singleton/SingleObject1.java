package singleton;

public class SingleObject1
{
	private static SingleObject1 instance;
	
	private SingleObject1(){
		
	}
	
    public static SingleObject1 getInstance() {  
		if (instance == null) {  
			instance = new SingleObject1();  
		}  
		return instance;  
    }  
	
	public void showMessage(){
		System.out.println("懒汉式线程不安全");
	}
}
