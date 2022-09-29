package testmodel.nomicronaut;

import testmodel.nomicronaut.OneOfImplementor1.*;

public class OneOfImplementor1TestExample {

	public static OneOfImplementor1 build() {
		OneOfImplementor1 exampleInstance = new OneOfImplementor1();
		//initialize fields
		exampleInstance.setProperty("string");
		return exampleInstance;
	}
}
