package testapi.packages.model;

public class ParameterModelTestExample {

	public static ParameterModel build() {
		ParameterModel exampleInstance = new ParameterModel();
		exampleInstance.setBool("string");
		exampleInstance.setString("string");
		exampleInstance.setNumber(12.34);
		exampleInstance.setInteger(12);
		exampleInstance.setUuid(java.util.UUID.randomUUID());
		exampleInstance.setDate(null);
		exampleInstance.setDateTime(null);
		exampleInstance.setA(java.util.List.of());
		exampleInstance.setB(java.util.List.of());
		exampleInstance.setC(java.util.List.of());
		return exampleInstance;
	}
}
