package testmodel.nomicronaut;

import testmodel.nomicronaut.InheritanceWithStringType.*;

public class InheritanceWithStringTypeTestExample {

	public static InheritanceWithStringType build() {
		// use the first found implementation as example
		return InheritanceWithStringType1TestExample.build();
	}
}
