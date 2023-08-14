package testmodel.nomicronaut;

public class PropertyTypeTwoTestExample {

	public static PropertyTypeTwo build() {
		PropertyTypeTwo exampleInstance = new PropertyTypeTwo();
		exampleInstance.setType(PropertyTypeTwo.Type.toEnum("two"));
		return exampleInstance;
	}
}
