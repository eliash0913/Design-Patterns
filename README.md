# Design Pattern Study

## Design-Patterns
### Duck_Example:
A simple design pattern. Explains how to break program down to interfaces.

## The Observer pattern
### WeatherStation_Example:
The Observer pattern. One to Many relationship. when an objext changes state, all of its dependents are notified and updated automatically. In this example, when weatherData changes, all Displays notified and updated.
  
### WeatherStation_BuiltIn_Observable_Example:
This is the same as WeatherStation_Example, but it is implemented by using java.util.Observable class and java.util.Observer interface. I dont think this is practical.
Advantage: Shorter code.
Disadvantage: Limits the reuse potential because you have to subclass.
        
  
  
