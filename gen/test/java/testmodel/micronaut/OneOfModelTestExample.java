package testmodel.micronaut;

import testmodel.micronaut.OneOfModel.*;

public class OneOfModelTestExample {

        public static OneOfModel build() {
            // use the first found implementation as example
            return FirstModelTestExample.build();
        }
}
