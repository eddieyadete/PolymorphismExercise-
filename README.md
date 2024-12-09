1. Type Casting
Type casting is converting one data type or object type to another, either implicitly or explicitly. Upcasting involves treating a
subclass object as a parent class type, which is safe and happens automatically. Downcasting is the opposite, where a parent class
reference is cast to a subclass type, often requiring explicit casting and the instanceof operator to ensure safety. Downcasting
enables access to subclass-specific methods, but it must be used cautiously to avoid runtime errors.

3. Polymorphism
Polymorphism allows objects of different subclasses to be treated as objects of a common parent class, enabling dynamic behavior
at runtime. It relies on method overriding, where a subclass provides its own implementation of a method defined in the parent class.
This concept supports flexibility and extensibility in code by letting a single interface handle multiple object types. It’s key
in scenarios like designing reusable frameworks and libraries.

5. Using instanceof Operator
The instanceof operator checks whether an object is an instance of a particular class or subclass. It is commonly used to ensure
safe downcasting, preventing ClassCastException errors at runtime. For example, before casting a parent reference to a subclass,
you can verify the actual type of the object using instanceof. It is particularly useful in polymorphic behavior when processing
objects of mixed types.

7. Abstraction
Abstraction hides implementation details while exposing only the essential features of an object or system. It is achieved in Java
using abstract classes and interfaces, where abstract methods are declared but implemented in subclasses. This concept focuses on
defining "what" an object does rather than "how" it does it. Abstraction simplifies complex systems, enhances maintainability, and
promotes focus on high-level design.

9. Interfaces
Interfaces in Java define a contract that classes must follow by implementing abstract methods declared within them. Unlike classes,
interfaces allow multiple inheritance, enabling a class to implement multiple interfaces. 

