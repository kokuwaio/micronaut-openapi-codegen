package testmodel.nomicronaut;

import testmodel.nomicronaut.PropertyTypeOne.*;

public class PropertyTypeOneTestExample {

	public static PropertyTypeOne build() {
		PropertyTypeOne exampleInstance = new PropertyTypeOne();
		//initialize fields
		exampleInstance.setType(Type.toEnum("one"));
		return exampleInstance;
	}
}
