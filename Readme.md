# Publish multi-flavor android libraries with [jitpack.io](https://jitpack.io/)

This project demonstrates how to publish multi-flavor android libraries to jitpack.

[![Release](https://jitpack.io/v/mirceanis/multi-flavor-lib-demo.svg)](https://jitpack.io/#mirceanis/multi-flavor-lib-demo)

The gist of it is using [dcendents gradle plugin](https://github.com/dcendents/android-maven-gradle-plugin)
and understanding that jitpack calls "./gradlew install" if left to auto-config

### What's here:

* on the [multi-lib branch](https://github.com/mirceanis/multi-flavor-lib-demo/tree/multi-lib)
  * a project that publishes 2 libraries (matterlib and energylib) each with their own flavors
  * a demoapp that gets to use the libs
* on the [single-lib branch](https://github.com/mirceanis/multi-flavor-lib-demo/tree/single-lib)
  * just one library with flavors
  * the demoapp that uses it

There's a difference in the way jitpack names the artifacts for single vs multiple library repositories.

### Flavor coordinates on jitpack

#### Single library project

If the project includes a single library, the repository name gets to be the artifactId, even if you specify otherwise.

To include a flavor as a dependency:

```groovy
implementation "com.github.<USER>:<REPO>:<git-tag>:<flavor-name>@aar"
```

If the library has a `defaultPublishConfig`, there should be an artifact with the normal jitpack coordinates:

```groovy
implementation "com.github.<USER>:<REPO>:<git-tag>"
```
An example for this setup is in the [single-lib](https://github.com/mirceanis/multi-flavor-lib-demo/tree/single-lib)
branch of this project.

#### multi-lib project

If the project produces multiple libraries, the coordinates change a little.

When working with a flavor of the library, include it like this:
```groovy
implementation "com.github.<USER>.<REPO>:<library-module>:<git-tag>:<flavor-name>@aar"
``` 

And if the library has a `defaultPublishConfig`, there should be an artifact with the following coordinates:

```groovy
implementation "com.github.<USER>.<REPO>:<library-module>:<git-tag>"
```

An example for this setup is in the [multi-lib](https://github.com/mirceanis/multi-flavor-lib-demo/tree/multi-lib)
branch of this project.



**jitpack.io is great for OSS.**


### Note

You can see the build logs for this sample library here: https://jitpack.io/#mirceanis/multi-flavor-lib-demo
