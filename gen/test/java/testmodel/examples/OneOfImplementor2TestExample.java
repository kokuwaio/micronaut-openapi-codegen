package testmodel.examples;

import testmodel.examples.OneOfImplementor2.*;

public class OneOfImplementor2TestExample {

        public static OneOfImplementor2 build() {
            OneOfImplementor2 exampleInstance = new OneOfImplementor2();
            //initialize fields
            exampleInstance.setProperty(12.34);
            return exampleInstance;
        }
}
