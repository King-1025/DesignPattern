package singleton;

public class SingleObject5
{
	private static class SingletonHolder {  
		private static final SingleObject5 INSTANCE = new SingleObject5();  
    }  
	
    private SingleObject5 (){}  
	
    public static final SingleObject5 getInstance() {  
		return SingletonHolder.INSTANCE;  
    }  
	
	public void showMessage(){
		System.out.println("登记式/静态内部类");
	}
}
