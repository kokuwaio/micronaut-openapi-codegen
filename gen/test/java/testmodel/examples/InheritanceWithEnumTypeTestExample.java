package testmodel.examples;

import testmodel.examples.InheritanceWithEnumType.*;

public class InheritanceWithEnumTypeTestExample {

        public static InheritanceWithEnumType build() {
            // use the first found implementation as example
            return InheritanceWithEnumType1TestExample.build();
        }
}
