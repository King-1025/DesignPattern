package abstract_factory;

public class ColorFactory extends AbstractFactory
{
    
	@Override
	public Color getColor(String color)
	{
		// TODO: Implement this method
		if("RED".equalsIgnoreCase(color)){
			return new Red();
		}else if("GREEN".equalsIgnoreCase(color)){
			return new Green();
		}else if("BLUE".equalsIgnoreCase(color)){
			return new Blue();
		}
		return null;
	}

	@Override
	public Shape getShape(String shape)
	{
		// TODO: Implement this method
		return null;
	}
	
}
