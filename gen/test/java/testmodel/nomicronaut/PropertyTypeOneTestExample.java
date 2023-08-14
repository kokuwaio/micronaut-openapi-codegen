package testmodel.nomicronaut;

public class PropertyTypeOneTestExample {

	public static PropertyTypeOne build() {
		PropertyTypeOne exampleInstance = new PropertyTypeOne();
		exampleInstance.setType(PropertyTypeOne.Type.toEnum("one"));
		return exampleInstance;
	}
}
