package testmodel.examples;

import testmodel.examples.SecondLevelModel.*;

public class SecondLevelModelTestExample {

        public static SecondLevelModel build() {
            // use the first found implementation as example
            return SecondLevelOneModelTestExample.build();
        }
}
