package testmodel.examples;

import testmodel.examples.OneOfInterface.*;

public class OneOfInterfaceTestExample {

        public static OneOfInterface build() {
            // use the first found implementation as example
            return OneOfImplementor1TestExample.build();
        }
}
