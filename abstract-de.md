# Dependency Management mit Gradle

Dependency Management ist gleichzeitig Fluch und Segen:
Auf der einen Seite ermöglicht es uns schnell neue Feature durch die Verwendung von Bibliotheken zu entwicklen.
Auf der anderen Seite kann die Verwaltung der Abhängigkeiten und das Auflösen von Konflikten mit der Zeit zum Albtraum werden.

Als Entwickler benötigen wir deshalb Kontrolle darüber welche Dependencies mit welcher Version in unsere Projekt eingebunden werden.
Bei den interne Bibliotheken wollen wir immer up-to-date sein, wohin gegen wir bei externen Abhängigkeiten sicherstellen wollen, dass diese gute untereinander zusammenspielen.

Dieser Talk zeigt wie die fortgeschrittenen Dependency Management Features von Gradle dabei helfen diese Herausforderungen zu meistern:
Mit dem dependencyInsights Report und Build Scans können Dependency Konlikte analysiert werden.
Automatische Upgrades von internen Bibliotheken können mittels Version Locking und Resolved Version Publication erreicht werden.
Virtual Platforms und Version Alignment helfen dabei zusammengehörige Gruppen von Bibliotheken zu verwalten.
