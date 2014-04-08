# Dependency Inversion Principle

**High-level modules should not depend on low-level modules. Both should depend on abstractions.**

**Abstractions should not depend on details. Details should depend on abstractions.**

The DIP is concerned with reusability. The high-level modules or interfaces of an application should only be describing the "general flow" of behavior. In some cases this may be considered "business logic". Meanwhile, the low-level modules are written in such a way to apply their concrete details to the abstraction. (The Adapter Pattern is a good example of DIP.)

In the bad example here, the WeatherTracker depends on the low-level details of the different notification systems (a phone, an emailer, etc.). These should instead be depending on some abstraction. The good example introduces this abstraction--a "Notifier" interface.

Strongly recommended reading: [Heuristics and Coffee](http://docs.google.com/file/d/0BwhCYaYDn8EgY2I3ZjUzNWMtMzE0ZS00ZDhlLTlmZGItMThkOTQzYzM0MTE3/edit?hl=en) by Uncle Bob
