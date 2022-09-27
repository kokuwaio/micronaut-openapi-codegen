package testapi.async.reactor;

import testapi.async.reactor.NumberModel.*;

public class NumberModelTestExample {

        public static NumberModel buildNumberModel() {
            NumberModel exampleInstance = new NumberModel();
            //initialize fields
            exampleInstance.setBar(12.34);
            return exampleInstance;
        }
}
