package testmodel.examples;

import testmodel.examples.FirstModel.*;

public class FirstModelTestExample {

        public static FirstModel buildFirstModel() {
            FirstModel exampleInstance = new FirstModel();
            //initialize fields
            exampleInstance.setType("string");
            exampleInstance.setFirst("string");
            exampleInstance.setSecondLevel(null);
            exampleInstance.setSecondLevel(SecondLevelModelTestExample.buildSecondLevelModel());
            return exampleInstance;
        }
}
