package testapi.modelsuffix;

import testapi.modelsuffix.MultipartVO.*;

public class MultipartVOTestExample {

        public static MultipartVO build() {
            MultipartVO exampleInstance = new MultipartVO();
            //initialize fields
            exampleInstance.setOrderId(12);
            exampleInstance.setUserId(12);
            exampleInstance.setFileName("string");
            exampleInstance.setFile("byteArray".getBytes());
            return exampleInstance;
        }
}
