package testmodel.nomicronaut;

public class FirstModelTestExample {

	public static FirstModel build() {
		FirstModel exampleInstance = new FirstModel();
		exampleInstance.setType("string");
		exampleInstance.setFirst("string");
		exampleInstance.setSecondLevel(null);
		exampleInstance.setSecondLevel(SecondLevelModelTestExample.build());
		return exampleInstance;
	}
}
