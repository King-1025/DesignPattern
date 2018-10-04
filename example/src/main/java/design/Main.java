package design;

import java.util.*;
import factory.*;
import abstract_factory.*;
import singleton.*;
import builder.*;
import prototype.*;
import adapter.*;

public class Main
{
	public static void main(String[] args)
	{
		Main demo=new Main();
		
		//demo.factoryPatternDemo();
		
		//demo.abstractFactoryPatternDemo();
		
		//demo.singletonPatternDemo();
		
		//demo.builderPatternDemo();
		
		//demo.prototypePatternDemo();
		
		demo.adapterPatternDemo();
	}
	
	/**
	*工厂模式
	*/
	private void factoryPatternDemo(){
		factory.ShapeFactory shapeFactory=new factory.ShapeFactory();
		factory.Shape s1=shapeFactory.getShape(factory.ShapeFactory.RECTANGLE);
		factory.Shape s2=shapeFactory.getShape(factory.ShapeFactory.CIRCLE);
		factory.Shape s3=shapeFactory.getShape(factory.ShapeFactory.SQUARE);
		s1.draw();
		s2.draw();
		s3.draw();
	}
	
	/**
	*抽象工厂模式
	*/
	private void abstractFactoryPatternDemo(){
		AbstractFactory shapeFactory=FactoryProducer.getFactory("shape");
		abstract_factory.Shape s1=shapeFactory.getShape("rectangle");
		s1.draw();
		
		AbstractFactory colorFactory=FactoryProducer.getFactory("color");
		Color c1=colorFactory.getColor("red");
		Color c2=colorFactory.getColor("green");
		Color c3=colorFactory.getColor("blue");
		
		c1.fill();
		c2.fill();
		c3.fill();
	}
	
	/**
	*单例模式
	*/
	private void singletonPatternDemo(){
		SingleObject so=new SingleObject();
		SingleObject1 so1=SingleObject1.getInstance();
		SingleObject2 so2=SingleObject2.getInstance();
		SingleObject3 so3=SingleObject3.getInstance();
		SingleObject4 so4=SingleObject4.getInstance();
		SingleObject5 so5=SingleObject5.getInstance();
		SingleObject6 so6=SingleObject6.INSTANCE;
		
		so1.showMessage();
		so2.showMessage();
		so3.showMessage();
		so4.showMessage();
		so5.showMessage();
		so6.showMessage();
		
		Object obj=SingleObject1.getInstance();
		if(so1.equals( obj)){
			System.out.println("相同");
		}else{
			System.out.println("不相同");
		}
		
		if(so.equals(new SingleObject())){
			System.out.println("相同");
		}else{
			System.out.println("不相同");
		}
	}
	
	/**
	*建造者模式
	*/
	private void builderPatternDemo(){
		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " +vegMeal.getCost());

		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("\n\nNon-Veg Meal");
		nonVegMeal.showItems();
		System.out.println("Total Cost: " +nonVegMeal.getCost());

	}
	
	/**
	*原型模式
	*/
	private void prototypePatternDemo(){
		ShapeCache.loadCache();

		prototype.Shape clonedShape =  ShapeCache.getShape("1");
		System.out.println("Shape : " + clonedShape.getType());        

		prototype.Shape clonedShape2 =  ShapeCache.getShape("2");
		System.out.println("Shape : " + clonedShape2.getType());        

		prototype.Shape clonedShape3 = ShapeCache.getShape("3");
		System.out.println("Shape : " + clonedShape3.getType());  
	}
	
	/**
	*适配器模式
	*/
	private void adapterPatternDemo(){
		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3", "beyond the horizon.mp3");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("vlc", "far far away.vlc");
		audioPlayer.play("avi", "mind me.avi");
	}
}
