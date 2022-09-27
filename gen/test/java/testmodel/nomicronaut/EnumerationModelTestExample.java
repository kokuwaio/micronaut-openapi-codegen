package testmodel.nomicronaut;

import testmodel.nomicronaut.EnumerationModel.*;

public class EnumerationModelTestExample {

        public static EnumerationModel buildEnumerationModel() {
            EnumerationModel exampleInstance = new EnumerationModel();
            //initialize fields
            exampleInstance.setString(null);
            exampleInstance.setStringDefault(null);
            exampleInstance.setEmbedded(Embedded.toEnum("first"));
            exampleInstance.setEmbeddedDefault(EmbeddedDefault.toEnum("four"));
            return exampleInstance;
        }
}
