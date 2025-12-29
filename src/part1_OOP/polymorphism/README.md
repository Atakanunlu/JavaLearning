# Polymorphism Example - Employee System

## Description
Demonstrates polymorphism in Java through an employee management system where different employee types (Developer, Manager, Intern) share a common interface but behave differently.

## Concepts Learned
- Method overriding for polymorphic behavior
- Parent class reference holding child objects
- Runtime polymorphism (dynamic binding)
- Code reusability through inheritance
- Single interface, multiple implementations

## Design Decisions

### Why Employee as parent class?
Employee contains common attributes (name, salary) and behaviors (work, calculateBonus) that all employee types share. This eliminates code duplication and provides a unified structure. Each employee type can override methods to provide specific behavior.

### Why override work() method?
Each employee type works differently: Developers write code, Managers attend meetings, Interns learn. Overriding work() allows each class to define role-specific behavior while maintaining the same method signature. This is the core of polymorphism.

### Why override calculateBonus() method?
Different employee types receive different bonus percentages based on their role and contribution. Developers get 20%, Managers get 30%, Interns get 5%, regular Employees get 10%. This business logic is encapsulated in each class.

### Why use Employee reference type?
Using `Employee emp = new Developer()` demonstrates polymorphism - the reference type is parent but the object is child. This allows treating different employee types uniformly while each maintains unique behavior. You can store all employees in a single array or list.


## Key Benefits

1. **Single Interface** - All employees accessed through Employee type
2. **Flexible Behavior** - Each type has unique implementation
3. **Easy Extension** - Add new employee types without changing existing code
4. **Code Reuse** - displayInfo() inherited by all, no duplication

## How to Run
```bash
javac MainOOP.java
java MainOOP
```
