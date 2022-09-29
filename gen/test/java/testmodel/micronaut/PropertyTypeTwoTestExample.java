package testmodel.micronaut;

import testmodel.micronaut.PropertyTypeTwo.*;

public class PropertyTypeTwoTestExample {

        public static PropertyTypeTwo build() {
            PropertyTypeTwo exampleInstance = new PropertyTypeTwo();
            //initialize fields
            exampleInstance.setType(Type.toEnum("two"));
            return exampleInstance;
        }
}
