package testmodel.examples;

import testmodel.examples.InheritanceWithoutType.*;

public class InheritanceWithoutTypeTestExample {

        public static InheritanceWithoutType buildInheritanceWithoutType() {
            // use the first found implementation as example
            return InheritanceWithoutType1TestExample.buildInheritanceWithoutType1();
        }
}
