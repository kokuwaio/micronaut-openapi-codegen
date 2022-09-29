package testmodel.nomicronaut;

import testmodel.nomicronaut.OneOfModel.*;

public class OneOfModelTestExample {

	public static OneOfModel build() {
		// use the first found implementation as example
		return FirstModelTestExample.build();
	}
}
