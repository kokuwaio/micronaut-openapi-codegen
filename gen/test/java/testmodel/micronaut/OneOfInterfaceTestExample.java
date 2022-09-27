package testmodel.micronaut;

import testmodel.micronaut.OneOfInterface.*;

public class OneOfInterfaceTestExample {

        public static OneOfInterface buildOneOfInterface() {
            // use the first found implementation as example
            return OneOfImplementor1TestExample.buildOneOfImplementor1();
            // use the first found implementation as example
            return OneOfImplementor1TestExample.buildOneOfImplementor1();
        }
}
