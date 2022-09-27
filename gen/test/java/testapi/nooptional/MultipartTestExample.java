package testapi.nooptional;

import testapi.nooptional.Multipart.*;

public class MultipartTestExample {

        public static Multipart buildMultipart() {
            Multipart exampleInstance = new Multipart();
            //initialize fields
            exampleInstance.setOrderId(12);
            exampleInstance.setUserId(12);
            exampleInstance.setFileName("string");
            exampleInstance.setFile("byteArray".getBytes());
            return exampleInstance;
        }
}
