package testmodel.micronaut;

import testmodel.micronaut.InheritanceWithoutType.*;

public class InheritanceWithoutTypeTestExample {

        public static InheritanceWithoutType build() {
            // use the first found implementation as example
            return InheritanceWithoutType1TestExample.build();
        }
}
