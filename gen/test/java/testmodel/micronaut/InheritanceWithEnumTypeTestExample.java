package testmodel.micronaut;

import testmodel.micronaut.InheritanceWithEnumType.*;

public class InheritanceWithEnumTypeTestExample {

        public static InheritanceWithEnumType buildInheritanceWithEnumType() {
            // use the first found implementation as example
            return InheritanceWithEnumType1TestExample.buildInheritanceWithEnumType1();
        }
}
