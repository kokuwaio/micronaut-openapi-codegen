## Features

 * generate api interfaces (see [declarative client](https://docs.micronaut.io/2.1.3/guide/index.html#clientAnnotation))
 * generate model objects with fluent and property accessors
 * generate interfaces for api tests based on method name and return code
 * generate client interfaces with micronaut **clientId**
 * add validation annotations

### Config options

 * clientId: id for generated clients (if no client id is provided no interface will be generated)
 * introspected: add `@io.micronaut.core.annotation.Introspected` to models (default `true`)
 * dateTimeRelaxed: add type registrar for relaxed time converter (default `true`)
 * useBeanValidation: generate validation annotations (default `true`)
 * useGenericResponse: return generic container or specific model, e.g. `Model` vs. `HttpResponse<Model>` (default `true`)
 * useOptional: optional parameters are generated as `java.util.Optional` (default `true`)
 * useJavaxGenerated: add `@javax.annotation.processing.Generated` to all classes (default `true`)
 * useLombokGenerated: add `@lombok.Generated` to all classes (default `false`), usefull for [jacoco](https://github.com/jacoco/jacoco/pull/731)
 * jacksonDatabindNullable: add container `JsonNullable` to model objects that are nullable (default `true`)
 * supportAsync: use reactivex return types, see [Reactive HTTP Request Processing](https://docs.micronaut.io/2.1.3/guide/index.html#reactiveServer)
 * useReferencedSchemaAsDefault: use the referenced schema's type for instantiation of default values 

### Null handling and default values

Jackson Inclusions:
 * `required=true` & `nullable=false`: `JsonInclude.ALWAYS`
 * `required=true` & `nullable=true`: `JsonInclude.ALWAYS`
 * `required=false` & `nullable=false`: `JsonInclude.NON_ABSENT`
 * `required=false` & `nullable=true`: `JsonInclude.NON_NULL`

Container (array/map):
 * `required=true` & `nullable=false`: empty containers are set as default value
 * `required=true` & `nullable=true`:  containers have no default value
 * `required=false` & `nullable=false`: containers have no default value
 * `required=false` & `nullable=true`: containers have no default value
 
If `jacksonDatabindNullable=true` is configured always `JsonNullable.undefined()` is set.

Do not forget to add the dependency to `pom.xml`:
```xml
<dependency>
	<groupId>org.openapitools</groupId>
	<artifactId>jackson-databind-nullable</artifactId>
	<version>0.2.1</version>
</dependency>
```

And register [Jackson Module](https://github.com/OpenAPITools/jackson-databind-nullable):
```java
@Factory
public class ApplicationFactory {

	@Singleton
	JsonNullableModule jsonNullableModule() {
		return new JsonNullableModule();
	}
}
```

### Not supported

 * no project (e.g. `pom.xml`) is generated, only interfaces to implement
 * no support for java <11

## Build & Release

### Test

Run single test:
```
mvn verify -Dinvoker.parallelThreads=1 -Dinvoker.streamLogs=true -Dinvoker.test=basic
```

### Dependency updates

Display dependency updates:
```
mvn versions:display-property-updates -U
```

Update dependencies:
```
mvn versions:update-properties
```

### Release locally

Run:
```
mvn release:prepare release:perform release:clean -B
```
