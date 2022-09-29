package testmodel.micronaut;

import testmodel.micronaut.SecondLevelTwoModel.*;

public class SecondLevelTwoModelTestExample {

        public static SecondLevelTwoModel build() {
            SecondLevelTwoModel exampleInstance = new SecondLevelTwoModel();
            //initialize fields
            exampleInstance.setType("string");
            exampleInstance.setTwo("string");
            return exampleInstance;
        }
}
