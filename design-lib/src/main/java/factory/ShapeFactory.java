package factory;

public class ShapeFactory
{
	public static final int RECTANGLE=0x00;
	public static final int CIRCLE=0x01;
	public static final int SQUARE=0x02;
	public Shape getShape(int shapeType){
		Shape shape=null;
		switch(shapeType){
			case RECTANGLE:
				shape=new Rectangle();
				break;
			case CIRCLE:
				shape=new Circle();
				break;
			case SQUARE:
				shape=new Square();
				break;
		}
		return shape;
	}
}
