package testmodel.nomicronaut;

import testmodel.nomicronaut.OneOfModel.*;

public class OneOfModelTestExample {

        public static OneOfModel buildOneOfModel() {
            // use the first found implementation as example
            return FirstModelTestExample.buildFirstModel();
        }
}
