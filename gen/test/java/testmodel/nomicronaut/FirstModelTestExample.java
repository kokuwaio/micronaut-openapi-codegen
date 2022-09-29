package testmodel.nomicronaut;

import testmodel.nomicronaut.FirstModel.*;

public class FirstModelTestExample {

        public static FirstModel build() {
            FirstModel exampleInstance = new FirstModel();
            //initialize fields
            exampleInstance.setType("string");
            exampleInstance.setFirst("string");
            exampleInstance.setSecondLevel(null);
            exampleInstance.setSecondLevel(SecondLevelModelTestExample.build());
            return exampleInstance;
        }
}
