package testmodel.examples;

import testmodel.examples.Model.*;

public class ModelTestExample {

        public static Model INSTANCE = new Model();
        {
            //initialize fields
                INSTANCE.setId(12);
                INSTANCE.setIdWithExample(32);
                INSTANCE.setIdWithDefault(32);
                INSTANCE.setName("string");
                INSTANCE.setNameWithExample("MyExampleName");
                INSTANCE.setNameWithDefault("MyDefaultName");
                INSTANCE.setDate(null);
                INSTANCE.setDateWithExample(null);
                INSTANCE.setDateTime(null);
                INSTANCE.setDateTimeWithExample(null);
                INSTANCE.setNumber(12.34);
                INSTANCE.setBinary("byteArray".getBytes());
                INSTANCE.setBytes("byteArray".getBytes());
                INSTANCE.setAny(org.openapitools.jackson.nullable.JsonNullable.of(null));
                INSTANCE.setArray(java.util.List.of());
                INSTANCE.setArrayWithExample(java.util.List.of("a","b","b"));
                INSTANCE.setSet(java.util.Set.of());
                INSTANCE.setSetWithExamples(java.util.Set.of("a","b","c"));
                INSTANCE.setMap(java.util.Map.of());
                INSTANCE.setMapWithExample(java.util.Map.ofEntries(new java.util.AbstractMap.SimpleEntry("a", "b"),new java.util.AbstractMap.SimpleEntry("c", "d")));
                INSTANCE.setOptionalArray(java.util.List.of());
                INSTANCE.setOptionalSet(java.util.Set.of());
                INSTANCE.setOptionalMap(java.util.Map.of());
                INSTANCE.setNullableString(org.openapitools.jackson.nullable.JsonNullable.of("string"));
                INSTANCE.setNullableArray(org.openapitools.jackson.nullable.JsonNullable.of(java.util.List.of()));
                INSTANCE.setNullableSet(org.openapitools.jackson.nullable.JsonNullable.of(java.util.Set.of()));
                INSTANCE.setNullableMap(org.openapitools.jackson.nullable.JsonNullable.of(java.util.Map.of()));
                INSTANCE.setDefaultString("defaultStringValue");
                INSTANCE.setDefaultInteger(java.lang.Long.valueOf(1234));
                INSTANCE.setDefaultNullable(org.openapitools.jackson.nullable.JsonNullable.of("defaultNullableValue"));
                INSTANCE.setReferenedModel(EnumerationModelTestExample.INSTANCE);
        }
}
