package abstract_factory;

public class ShapeFactory extends AbstractFactory
{

	@Override
	public Color getColor(String color)
	{
		// TODO: Implement this method
		return null;
	}

	@Override
	public Shape getShape(String shape)
	{
		// TODO: Implement this method
		if("RECTANGLE".equalsIgnoreCase(shape)){
			return new Rectangle();
		}
		return null;
	}
	
}
