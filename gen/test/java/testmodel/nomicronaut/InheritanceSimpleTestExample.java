package testmodel.nomicronaut;

import testmodel.nomicronaut.InheritanceSimple.*;

public class InheritanceSimpleTestExample {

        public static InheritanceSimple build() {
            InheritanceSimple exampleInstance = new InheritanceSimple();
            //initialize fields
            exampleInstance.setFoo("string");
            return exampleInstance;
        }
}
