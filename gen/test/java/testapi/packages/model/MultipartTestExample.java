package testapi.packages.model;

public class MultipartTestExample {

	public static Multipart build() {
		Multipart exampleInstance = new Multipart();
		exampleInstance.setOrderId(12);
		exampleInstance.setUserId(12);
		exampleInstance.setFileName("string");
		exampleInstance.setFile("byteArray".getBytes());
		return exampleInstance;
	}
}
