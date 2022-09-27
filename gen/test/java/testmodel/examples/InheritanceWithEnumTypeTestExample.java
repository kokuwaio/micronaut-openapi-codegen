package testmodel.examples;

import testmodel.examples.InheritanceWithEnumType.*;

public class InheritanceWithEnumTypeTestExample {

        public static InheritanceWithEnumType buildInheritanceWithEnumType() {
            // use the first found implementation as example
            return InheritanceWithEnumType1TestExample.buildInheritanceWithEnumType1();
        }
}
