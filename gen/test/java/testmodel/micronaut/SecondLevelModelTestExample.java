package testmodel.micronaut;

import testmodel.micronaut.SecondLevelModel.*;

public class SecondLevelModelTestExample {

        public static SecondLevelModel build() {
            // use the first found implementation as example
            return SecondLevelOneModelTestExample.build();
        }
}
