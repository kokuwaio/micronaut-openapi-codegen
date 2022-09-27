package testapi.nooptional;

import testapi.nooptional.NumberModel.*;

public class NumberModelTestExample {

        public static NumberModel buildNumberModel() {
            NumberModel exampleInstance = new NumberModel();
            //initialize fields
            exampleInstance.setBar(12.34);
            return exampleInstance;
        }
}
