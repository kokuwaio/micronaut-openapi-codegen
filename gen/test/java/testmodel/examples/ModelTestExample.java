package testmodel.examples;

import testmodel.examples.Model.*;

public class ModelTestExample {

        public static Model buildModel() {
            Model exampleInstance = new Model();
            //initialize fields
            exampleInstance.setId(12);
            exampleInstance.setIdWithExample(32);
            exampleInstance.setIdWithDefault(32);
            exampleInstance.setName("string");
            exampleInstance.setNameWithExample("MyExampleName");
            exampleInstance.setNameWithDefault("MyDefaultName");
            exampleInstance.setDate(null);
            exampleInstance.setDateWithExample(null);
            exampleInstance.setDateTime(null);
            exampleInstance.setDateTimeWithExample(null);
            exampleInstance.setNumber(12.34);
            exampleInstance.setBinary("byteArray".getBytes());
            exampleInstance.setBytes("byteArray".getBytes());
            exampleInstance.setAny(org.openapitools.jackson.nullable.JsonNullable.of(null));
            exampleInstance.setArray(java.util.List.of());
            exampleInstance.setArrayWithExample(java.util.List.of("a","b","b"));
            exampleInstance.setSet(java.util.Set.of());
            exampleInstance.setSetWithExamples(java.util.Set.of("a","b","c"));
            exampleInstance.setMap(java.util.Map.of());
            exampleInstance.setMapWithExample(java.util.Map.ofEntries(new java.util.AbstractMap.SimpleEntry("a", "b"),new java.util.AbstractMap.SimpleEntry("c", "d")));
            exampleInstance.setOptionalArray(java.util.List.of());
            exampleInstance.setOptionalSet(java.util.Set.of());
            exampleInstance.setOptionalMap(java.util.Map.of());
            exampleInstance.setNullableString(org.openapitools.jackson.nullable.JsonNullable.of("string"));
            exampleInstance.setNullableArray(org.openapitools.jackson.nullable.JsonNullable.of(java.util.List.of()));
            exampleInstance.setNullableSet(org.openapitools.jackson.nullable.JsonNullable.of(java.util.Set.of()));
            exampleInstance.setNullableMap(org.openapitools.jackson.nullable.JsonNullable.of(java.util.Map.of()));
            exampleInstance.setDefaultString("defaultStringValue");
            exampleInstance.setDefaultInteger(java.lang.Long.valueOf(1234));
            exampleInstance.setDefaultNullable(org.openapitools.jackson.nullable.JsonNullable.of("defaultNullableValue"));
            exampleInstance.setReferenedModel(null);
            exampleInstance.setReferenedModel(EnumerationModelTestExample.buildEnumerationModel());
            return exampleInstance;
        }
}
