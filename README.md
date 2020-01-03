## Config options

 * clientId
 * validation

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
