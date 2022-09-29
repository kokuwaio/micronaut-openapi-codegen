package testmodel.micronaut;

import testmodel.micronaut.InheritanceExtended.*;

public class InheritanceExtendedTestExample {

        public static InheritanceExtended build() {
            InheritanceExtended exampleInstance = new InheritanceExtended();
            //initialize fields
            exampleInstance.setFoo("string");
            exampleInstance.setBar("string");
            return exampleInstance;
        }
}
