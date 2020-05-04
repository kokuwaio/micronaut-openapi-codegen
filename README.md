## Features

 * generate api interfaces (see [declarative client](https://docs.micronaut.io/1.3.3/guide/index.html#clientAnnotation))
 * generate model objects with fluent and property accessors
 * generate interfaces for api tests based on method name and return code
 * genarate client interfaces with mironaut **clientId**
 * add validation annotations

### Config options

 * clientId: id for generated clients (if no client id is provided no interface will be generated)
 * introspected: generate validation annotations (default `true`)
 * dateTimeRelaxed: add type registrar for releaxed time converter (default `true`)
 * useBeanValidation: generate validation annotations (default `true`)
 * useGenericResponse: return generic container or specifc model, e.g. `Model` vs. `HttpResponse<Model>` (default `true`)
 * jacksonDatabindNullable: add container `JacksonNullable` to model objects that are nullable(default `false`)

### Not supported

 * no project (e.g. `pom.xml`) is generated, only interfaces to implement
 * no support for java <11

## Build & Release

### Dependency updates

Display dependency updates:
```
mvn versions:display-property-updates
```

Update dependencies:
```
mvn versions:update-properties -DgenerateBackupPoms=false
```

### Release locally

Run:
```
mvn release:prepare release:perform release:clean -B
```

## Open Topics

 * add github action and use github release trigger for automated releasing
 * tests for Ditto and Hono apis
