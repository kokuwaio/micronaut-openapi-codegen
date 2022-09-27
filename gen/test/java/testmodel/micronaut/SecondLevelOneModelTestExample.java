package testmodel.micronaut;

import testmodel.micronaut.SecondLevelOneModel.*;

public class SecondLevelOneModelTestExample {

        public static SecondLevelOneModel buildSecondLevelOneModel() {
            SecondLevelOneModel exampleInstance = new SecondLevelOneModel();
            //initialize fields
            exampleInstance.setType("string");
            exampleInstance.setOne("string");
            return exampleInstance;
        }
}
