# Micronaut Codegen

OpenAPI code generator for Micronaut.

[![maven](https://img.shields.io/maven-central/v/io.kokuwa.micronaut/micronaut-openapi-codegen.svg?label=maven)](https://central.sonatype.com/artifact/io.kokuwa.micronaut/micronaut-openapi-codegen)
[![license](https://img.shields.io/badge/license-EUPL%201.2-blue)](https://git.kokuwa.io/kokuwaio/micronaut-openapi-codegen/src/branch/main/LICENSE)
[![issues](https://img.shields.io/gitea/issues/open/kokuwaio/micronaut-openapi-codegen?gitea_url=https%3A%2F%2Fgit.kokuwa.io)](https://git.kokuwa.io/kokuwaio/micronaut-openapi-codegen/issues)
[![prs](https://img.shields.io/gitea/pull-requests/open/kokuwaio/micronaut-openapi-codegen?gitea_url=https%3A%2F%2Fgit.kokuwa.io)](https://git.kokuwa.io/kokuwaio/micronaut-openapi-codegen/pulls)
[![build](https://ci.kokuwa.io/api/badges/kokuwaio/micronaut-openapi-codegen/status.svg)](https://ci.kokuwa.io/repos/kokuwaio/micronaut-openapi-codegen/)

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
* support for One-Of interfaces
* support for additional properties with composed schemas
* generate example instances of the model-objects
* set a base class for all generated pojos, to allow extension with common functionality

### Config options

* clientId: id for generated clients (if no client id is provided no interface will be generated)
* serdeable: add `@io.micronaut.serde.annotation.Serdeable` to models (default `true`)
* dateTimeRelaxed: add type registrar for relaxed time converter (default `true`)
* useBeanValidation: generate validation annotations (default `true`)
* useGenericResponse: return generic container or specific model, e.g. `Model` vs. `HttpResponse<Model>` (default `true`)
* useOptional: optional parameters are generated as `java.util.Optional` (default `true`)
* openApiNullable: add container `JsonNullable` to model objects that are nullable (default `true`)
* supportAsync: use reactivex return types, see [Reactive HTTP Request Processing](https://docs.micronaut.io/latest/guide/index.html#reactiveServer)
* pagable: generate provider for pagable (default `false`)
* generateExamples: generate example objects for the model, based on example and default values (default `false`)
* generateConstants: generate constants for model names and api paths (default `false`)
* generateAuthentication: generate Àuthentication into controller interfaces if response code 401 is present (default `false`)
* sealed: generate sealed interfaces (default `true`)
* record: generate records instead of pojos (default `false`)
* modelBaseClass: set a base class that all generated pojos extend (default is unset)

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
 <version>0.2.6</version>
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
* no support for java <17
