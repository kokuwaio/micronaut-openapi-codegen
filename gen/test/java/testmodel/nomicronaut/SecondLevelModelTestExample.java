package testmodel.nomicronaut;

import testmodel.nomicronaut.SecondLevelModel.*;

public class SecondLevelModelTestExample {

        public static SecondLevelModel buildSecondLevelModel() {
            // use the first found implementation as example
            return SecondLevelOneModelTestExample.buildSecondLevelOneModel();
        }
}
