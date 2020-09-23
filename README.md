## Features

 * generate api interfaces (see [declarative client](https://docs.micronaut.io/2.0.3/guide/index.html#clientAnnotation))
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
 * jacksonDatabindNullable: add container `JsonNullable` to model objects that are nullable (default `false`)
 * useOptionals: optional parameters are generated as `java.util.Optional` (default `true`)
 * supportAsync: use reactivex return types, see [Reactive HTTP Request Processing](https://docs.micronaut.io/2.0.3/guide/index.html#reactiveServer)

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

## Open Topics

 * add github action and use github release trigger for automated releasing
 * tests for Ditto and Hono apis
