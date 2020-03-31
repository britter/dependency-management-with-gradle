Dependency management with Gradle

Dependency management is both a blessing and a curse.
It has allowed developers to quickly assemble applications based on the rich eco-system of libraries.
However this can quickly turn into a nightmare when the number of dependencies grows.

As a developer you need to control which dependencies are added to the classpath of your application, make sure the versions of these play well together, potentially exclude specific versions that have proven buggy for your use case and follow up when new releases are made.

While Gradle has always provided options for handling these complex dependency management issues, the recent releases have added a set of features that help developer debug and fix complex dependency issues.

The goal of this presentation will be to showcase these features and offer recipes that can be applied to resolve problems:

- dependencyInsight gives you extensive information about a dependency and its selected version
- Automating the upgrade of the internal libraries you use with locking and resolved version publication
- With virtual platforms and alignment, you can make sure a set of libraries designed to work together share a common version
