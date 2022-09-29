package testmodel.micronaut;

import testmodel.micronaut.EnumerationModel.*;

public class EnumerationModelTestExample {

        public static EnumerationModel build() {
            EnumerationModel exampleInstance = new EnumerationModel();
            //initialize fields
            exampleInstance.setString(null);
            exampleInstance.setStringDefault(null);
            exampleInstance.setEmbedded(Embedded.toEnum("first"));
            exampleInstance.setEmbeddedDefault(EmbeddedDefault.toEnum("four"));
            return exampleInstance;
        }
}
