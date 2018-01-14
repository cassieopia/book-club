Book Club
---------
Book Club is a web application designed to provide a platform for facilitating and participating in online book discussions.

## Getting Started

### General
Follow the instructions [here](https://gist.github.com/trey/2722934) to make using `git` a lot easier. Some of this stuff is MacOS specific, so use the stuff [here](https://gist.github.com/dmangiarelli/1a0ae107aaa5c478c51e) to supplement if you're using windows.

### Java
1. Clone this repository by running `git clone git@github.com:cassiewang03/book-club.git`
2. Prepare this project for intelliJ by running `./gradlew idea`
3. Open this project in intelliJ by selecting `File` -> `Open` -> `book-club` -> `Click open`. 
4. Run this application by navigating to the project on the command line and running `./gradlew run` or by finding the `BookClubApplication` java file in your IDE and selecting `Run`.

## Developing
All code will reside in one project for now. All *server* code resides in the server package, and all *api* code will reside in the api package.

When you're ready to push you're changes, run:

```
    git checkout -b feature/my-new-feature
    git add .
    git commit -m "My message here"
    git push origin feature/my-new-feature
```

Then, open a pull request in github:
1. Navigate to the Pull Request tab on the repository
2. Click on the `New Pull Request` button
3. 