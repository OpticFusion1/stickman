<img width="400" height="auto" align="right" src="http://getgitman.com/img/f_3.jpg">

# Stickman
Stickman is a text based platform game in java.

### Prerequisites

Java >= 1.8

### Installing

1. [Download](https://github.com/alfr3dosv/stickman/releases) the latest fat jar release
2. Run

### Build

Currently only [Gradle](https://gradle.org/) can be used

1. Clone the current repo
```
$ git clone https://github.com/alfr3dosv/stickman.git
```
2. Open a terminal and select ./stickman
```
$ cd ./stickman
```
3. Build using gradle(if installed)
```
$ gradle build
```
If gradle is not installed use instead ``./gradlew build`` for linux/mac and ``gradlew build`` for windows

The build binary is located in ./stickman/build/distributions 

### Running the tests
We use junit for tesitng, Gradle provides a good integration with junit.

To run the tests
```
gradle test
```
If gradle is not installed use instead ``./gradlew test`` for linux/mac and ``gradlew test`` for windows

You should see a output similar to this
```
$ gradle test

BUILD SUCCESSFUL in 1s
4 actionable tasks: 4 up-to-date
```

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/alfr3dosv/stickman/tags). 

## Authors

* **Alfredo Soto** - [alfr3dosv](https://github.com/alfr3dosv)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
