package singleton;

public class SingleObject3
{
	private static SingleObject3 instance=new SingleObject3();
	
	private SingleObject3(){
		
	}
	
	public static SingleObject3 getInstance(){
		return instance;
	}

	public void showMessage(){
		System.out.println("饿汉式");
	}
}
