package testmodel.examples;

import testmodel.examples.EnumerationModel.*;

public class EnumerationModelTestExample {

        public static EnumerationModel INSTANCE = new EnumerationModel();
        {
            //initialize fields
                INSTANCE.setString(null);
                INSTANCE.setStringDefault(null);
                INSTANCE.setEmbedded(Embedded.toEnum("first"));
                INSTANCE.setEmbeddedDefault(EmbeddedDefault.toEnum("four"));
        }
}
