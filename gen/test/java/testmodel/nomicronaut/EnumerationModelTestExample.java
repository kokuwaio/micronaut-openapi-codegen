package testmodel.nomicronaut;

public class EnumerationModelTestExample {

	public static EnumerationModel build() {
		EnumerationModel exampleInstance = new EnumerationModel();
		exampleInstance.setString(null);
		exampleInstance.setStringDefault(null);
		exampleInstance.setEmbedded(EnumerationModel.Embedded.toEnum("first"));
		exampleInstance.setEmbeddedDefault(EnumerationModel.EmbeddedDefault.toEnum("four"));
		return exampleInstance;
	}
}
