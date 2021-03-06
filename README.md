# Design Pattern Study

## Design-Patterns
### Duck_Example:
A simple design pattern. Explains how to break program down to interfaces.

## The Observer Pattern
### WeatherStation_Example:
The Observer pattern. One to Many relationship. when an object changes state, all of its dependents are notified and updated automatically. In this example, when weatherData changes, all Displays notified and updated.
  
### WeatherStation_BuiltIn_Observable_Example:
This is the same as WeatherStation_Example, but it is implemented by using java.util.Observable class and java.util.Observer interface. I dont think this is practical.
Advantage: Shorter code.
Disadvantage: Limits the reuse potential because you have to subclass.

## Decorator Pattern
### Starbuzz_Example:
Decorator pattern. There is a super class and sub classes are decorating. Classes should be open for extension but closed for modification.

### IO_Decorator_Example:
This example extends FilterInputStream, which means LowerCaseInputStream is a subclass of FilterInputStream and decorating on the top of FilterInputStream class.

## Factory Pattern
### Pizza_Example:
The Abstract Factory Pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.
1. No variable should hold a reference to a concrete class.
2. No class should derive from a concrete class.
3. No method should override an implemented method of any of its base classes.

## Singleton Pattern
### Singleton_Example:
This pattern ensures a class only has one instance and provide a global point of access to it.
1. used private constructor.
2. used static method to instantiate and return the instance.
3. used synchronized block for multi-threading.
4. used volatile keyword with synchronized block for the improvement. <--once instance is not null, it doesn't have to wait.

## Command Pattern
### Command_Example:
This pattern encapsulates a request as an object, thereby letting you parameterize other objects with different requests, queue or log, and support undoable operations.
1. Invokers executes multiple commands.
2. Each object is a command which contains actions.

