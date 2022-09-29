package testmodel.micronaut;

import testmodel.micronaut.OneOfInterface.*;

public class OneOfInterfaceTestExample {

        public static OneOfInterface build() {
            // use the first found implementation as example
            return OneOfImplementor1TestExample.build();
        }
}
