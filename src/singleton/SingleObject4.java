package singleton;

public class SingleObject4
{
	private static volatile SingleObject4 instance;
	
	private SingleObject4(){
		
	}
	
	public static SingleObject4 getInstance(){
		if(instance==null){
			synchronized(SingleObject4.class){
				if(instance==null){
					instance=new SingleObject4();
				}
			}
		}
		return instance;
	}
	
	public void showMessage(){
		System.out.println("双检锁/双重校验锁DCL");
	}
}
