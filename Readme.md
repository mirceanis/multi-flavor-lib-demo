# Publish multi-flavor android libraries with [jitpack.io](https://jitpack.io/)

This project demonstrates how to publish multi-flavor android libraries to jitpack.

The gist of it is using [dcendents gradle plugin](https://github.com/dcendents/android-maven-gradle-plugin) and understanding that jitpack calls "./gradlew install" if left to auto-config

### What's here:

* an android library module (matterlib) that gets published
* a demoapp that gets to use the lib

### Flavor coordinates on jitpack

#### Single library project

If the project includes a single library, the repository name gets to be the artifactId, even if you specify otherwise.

To include a flavor as a dependency:

```groovy
implementation "com.github.<USER>:<REPO>:<version>:<flavor-name>@aar"
```

If the library has a `defaultPublishConfig`, there should be an artifact with the normal jitpack coordinates:

```groovy
implementation "com.github.<USER>:<REPO>:<version>"
```

#### multi-lib project

If the project produces multiple libraries, the coordinates change a little.

When working with a flavor of the library, include it like this:
```groovy
implementation "com.github.<USER>.<REPO>:<library-module>:<version>:<flavor-name>@aar"
```

And if the library has a `defaultPublishConfig`, there should be an artifact with the following coordinates:

```groovy
implementation "com.github.<USER>.<REPO>:<library-module>:<version>"
```


jitpack is great for OSS.