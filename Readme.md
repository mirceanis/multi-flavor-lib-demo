# Publish multi-flavor android libraries with [jitpack.io](https://jitpack.io/)

This project demonstrates how to publish multi-flavor android libraries to jitpack.

The gist of it is using [dcendents gradle plugin](https://github.com/dcendents/android-maven-gradle-plugin) and understanding that jitpack calls "./gradlew install" if left to auto-config

### What's here:

* an android library module (matterlib) that gets published
* a demoapp that gets to use the lib

### Flavor coordinates on jitpack

When working with a flavor of the library, include it like this:
```groovy
implementation "com.github.<USER>:<library-module>:<version>:<flavor-name>@aar"
```

If the library has a `defaultPublishConfig`, there should be an artifact with the following coordinates:

```groovy
implementation "com.github.<USER>:<library-module>:<version>"
```

jitpack is great for OSS.
