package testmodel.micronaut;

import testmodel.micronaut.InheritanceWithEnumType.*;

public class InheritanceWithEnumTypeTestExample {

        public static InheritanceWithEnumType build() {
            // use the first found implementation as example
            return InheritanceWithEnumType1TestExample.build();
        }
}
