# Principles

1. Never add any functionality in the parent class if it is not common for all the children. Adding a base method 
in parent and then overriding in child classes is incorrect

2. Never use interface just to force creation of a method.

3. Always eliminate techniques that cause change in one class to affect other classes. Change in parent class must not
break the child classes.

# Design Patterns

### 1. Strategy Pattern

#### Definition
Define a family of algorithms, encapsulate each one, and make them interchangeable. The strategy pattern lets
the algorithm vary independently from the clients that use it.

#### Guidelines & Notes for pattern usage

- When you want to give additional capability to some objects (x1, x2, x3) of X type and this functionality 
varies from object to object (x1 has different, x2 has different etc).
- When there is a possibility of x1, x2, x3 to change their behaviour dynamically then those set of behaviours
can be imparted using the strategy pattern.
- When the list of behaviours x1, x2, x3 can evolve dynamically.

### 2. Observer Pattern

#### Definition
The observer pattern is a design pattern in which an object(subject) maintains a list of its
dependents(observers) and notifies them automatically of any state changes, usually by calling one of 
their methods.

#### Guidelines & Notes for pattern usage
- When you need a lot of other objects of one or many classes to receive updates about the state
change of some other object.
- The publisher(subject) does not need to know anything about the subscriber(observer)
- The subscribers may receive update about the state that they might not be interested in.