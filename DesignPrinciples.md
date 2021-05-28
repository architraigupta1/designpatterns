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

### 3. Factory Pattern

#### Definition
The Factory pattern allows you to create objects without specifying the exact class of the object
to create.

#### Guidelines & Notes for pattern usage
- When the objects to create are of classes that share a common parent class.
- When you have to create object dynamically at runtime based on the flow invoked.
- Helps to hide the logic of object creation. Each class is responsible for creating its own object
- Helps to centralize the logic of object creation. All the if-else/switch lives together

### 4. Singleton Pattern

#### Definition
If you want that only one object of a class can ever be created, use this.

#### Guidelines & Notes for pattern usage
- Whenever you want to create a shared list/object that is accessible to all the other
classes.
- Make sure to make the singleton thread safe.

### 5. Builder Pattern

#### Definition
Pattern used to create objects made from a bunch of other objects. Also, helps to hide the
building logic (which can be complex) of parts of the object. 

#### Guidelines & Notes for pattern usage
- When you want to build an object made up of another object
- When the creation logic of parts of the object is complex. You can hide all those details
in the builders.

### 6. Prototype Pattern

#### Definition
Pattern is used to create new instances (clones) by cloning (copying) existing instances.

#### Guidelines & Notes for pattern usage
- 