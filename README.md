# Micronaut Codegen

OpenAPI code generator for Micronaut.

[![License](https://img.shields.io/github/license/kokuwaio/micronaut-openapi-codegen.svg?label=License)](https://github.com/kokuwaio/micronaut-openapi-codegen/blob/main/LICENSE)
[![Maven Central](https://img.shields.io/maven-central/v/io.kokuwa.micronaut/micronaut-openapi-codegen.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22io.kokuwa.micronaut%22%20AND%20a:%22micronaut-openapi-codegen%22)
[![Lint](https://img.shields.io/github/workflow/status/kokuwaio/micronaut-openapi-codegen/CI/main?label=CI)](https://github.com/kokuwaio/micronaut-openapi-codegen/actions/workflows/ci.yaml)

Include in your `pom.xml`:

```xml
<plugin>
 <groupId>org.openapitools</groupId>
 <artifactId>openapi-generator-maven-plugin</artifactId>
 <version>${version.org.openapitools.generator}</version>
 <executions>
  <execution>
   <goals>
    <goal>generate</goal>
   </goals>
  </execution>
 </executions>
 <configuration>
  <generatorName>micronaut</generatorName>
  <output>${project.build.directory}</output>
  <inputSpec>src/resources//openapi/spec.yaml</inputSpec>
  <packageName>changeMe</packageName>
 </configuration>
 <dependencies>
  <dependency>
   <groupId>io.kokuwa.micronaut</groupId>
   <artifactId>micronaut-openapi-codegen</artifactId>
   <version>${version.io.kokuwa.micronaut.codegen}</version>
  </dependency>
 </dependencies>
</plugin>
```

## Features

* generate api interfaces (see [declarative client](https://docs.micronaut.io/latest/guide/index.html#clientAnnotation))
* generate model objects with fluent and property accessors
* generate interfaces for api tests based on method name and return code
* generate client interfaces with micronaut **clientId**
* add validation annotations
* generate example instances of the model-objects

### Config options

* clientId: id for generated clients (if no client id is provided no interface will be generated)
* introspected: add `@io.micronaut.core.annotation.Introspected` to models (default `true`)
* dateTimeRelaxed: add type registrar for relaxed time converter (default `true`)
* useBeanValidation: generate validation annotations (default `true`)
* useGenericResponse: return generic container or specific model, e.g. `Model` vs. `HttpResponse<Model>` (default `true`)
* useOptional: optional parameters are generated as `java.util.Optional` (default `true`)
* openApiNullable: add container `JsonNullable` to model objects that are nullable (default `true`)
* supportAsync: use reactivex return types, see [Reactive HTTP Request Processing](https://docs.micronaut.io/latest/guide/index.html#reactiveServer)
* pagable: generate provider for pagable (default `false`)
* generateExamples: generate example objects for the model, based on example and default values (default `true`)

For examples see [integration tests](src/it).

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
 <version>0.2.2</version>
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

```sh
mvn verify -Dinvoker.parallelThreads=1 -Dinvoker.streamLogs=true -Dinvoker.test=basic
```

### Dependency updates

Display dependency updates:

```sh
mvn versions:display-property-updates -U
```

Update dependencies:

```sh
mvn versions:update-properties
```

### Release locally

Run:

```sh
mvn release:prepare release:perform release:clean -B
```
