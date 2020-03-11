## Features

 * generate api interfaces (see [declarative client](https://docs.micronaut.io/1.2.8/guide/index.html#clientAnnotation))
 * generate model objects with fluent and property accessors
 * generate interfaces for api tests based on method name and return code
 * genarate client interfaces with mironaut **clientId**
 * add validation annotations

### Config options

 * clientId: id for generated clients (if no client id is provided no interface will be generated)
 * validation: generate validation annotations

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
mvn release:prepare release:perform release:clean
```

## Open Topics

 * add github action and use github release trigger for automated releasing
 * tests for Ditto and Hono apis
