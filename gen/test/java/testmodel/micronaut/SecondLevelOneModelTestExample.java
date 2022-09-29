package testmodel.micronaut;

import testmodel.micronaut.SecondLevelOneModel.*;

public class SecondLevelOneModelTestExample {

        public static SecondLevelOneModel build() {
            SecondLevelOneModel exampleInstance = new SecondLevelOneModel();
            //initialize fields
            exampleInstance.setType("string");
            exampleInstance.setOne("string");
            return exampleInstance;
        }
}
