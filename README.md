## Pekko HTTP quickstart

**This repository is a fork of [akka-http-quickstart-scala.g8](https://github.com/akka/akka-http-quickstart-scala.g8).**

Please see the [quickstart guide](https://developer.lightbend.com/guides/akka-http-quickstart-scala/) for a
walk through the code.

You can use [Giter8][g8] to create your own project from the quickstart. There are two ways you can achieve that:

Prerequisites:
- JDK 11
- sbt 1.4.x or higher
- [Giter8](http://www.foundweekends.org/giter8/setup.html) (the second way only)

(Without cloning the repo) open a console and run one of the two following commands:
 ```
sbt new theiterators/pekko-http-quickstart-scala.g8
 ```
or
```
g8 theiterators/pekko-http-quickstart-scala.g8
```

This template will prompt for the following parameters. Press `Enter` if the default values suit you:
- `name`: Becomes the name of the project.
- `scala_version`: Specifies the Scala version for this project.
- `pekko_version`: Specifies which version of Pekko should be used for this project.
- `pekko_http_version`: Specifies which version of Pekko HTTP should be used for this project.
- `organization`: Specifies the organization for this project.

The template comes with the following sources:

* `QuickstartApp.scala` -- contains the main method which bootstraps the application 
* `UserRoutes.scala` -- Pekko HTTP `routes` defining exposed endpoints
* `UserRegistry.scala` -- the actor which handles the registration requests
* `JsonFormats.scala` -- converts the JSON data from requests into Scala types and from Scala types into JSON responses

Once inside the project folder use the following command to run the code:
```
sbt run
```

Template license
----------------
Written in 2017 by Lightbend, Inc.
Migrated to pekko in 2023 by Iterators sp. z o.o.

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <http://creativecommons.org/publicdomain/zero/1.0/>.

[g8]: http://www.foundweekends.org/giter8/
