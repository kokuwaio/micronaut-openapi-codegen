package testmodel.nomicronaut;

import testmodel.nomicronaut.InheritanceWithEnumType.*;

public class InheritanceWithEnumTypeTestExample {

	public static InheritanceWithEnumType build() {
		// use the first found implementation as example
		return InheritanceWithEnumType1TestExample.build();
	}
}
