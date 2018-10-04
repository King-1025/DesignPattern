package singleton;

public class SingleObject2
{
	private static SingleObject2 instance;
	
	private SingleObject2(){
		
	}
	
	public static synchronized SingleObject2 getInstance(){
		if(instance==null){
			instance=new SingleObject2();
		}
		return instance;
	}
	
	public void showMessage(){
		System.out.println("懒汉式线程安全");
	}
}
