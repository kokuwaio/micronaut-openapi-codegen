package testapi.packages.model;

import testapi.packages.model.Multipart.*;

public class MultipartTestExample {

        public static Multipart build() {
            Multipart exampleInstance = new Multipart();
            //initialize fields
            exampleInstance.setOrderId(12);
            exampleInstance.setUserId(12);
            exampleInstance.setFileName("string");
            exampleInstance.setFile("byteArray".getBytes());
            return exampleInstance;
        }
}
