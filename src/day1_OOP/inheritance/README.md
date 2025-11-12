# Animal Inheritance Example
## Description
Basic Java inheritance example demonstrating parent-child class relationships using Animal, Dog, and Cat classes.
## Concepts Learned
- Class inheritance with extends
- Constructor chaining with super()
- Method overriding with @Override
- Access modifiers protected vs private)
- Polymorphism basics
## Design Decisions
### Why protected for name and age?
I used protected because child classes (Dog, Cat) need direct access to these fields. If they were private, child classes couldn't access them directly and would need getters. protected allows inheritance while still hiding these fields from outside classes.
### Why override eat() method?
Each animal eats differently. Dog eats dog food, Cat eats cat food. Override allows child classes to provide their own specific implementation while keeping the same method name from parent.
### Why call super.displayInfo()?
To avoid code duplication. Parent's displayInfo() already shows name and age. We call super.displayInfo() first to get that info, then add child-specific info (breed for Dog, isIndoor for Cat).
## How to Run
bash
javac MainOOP.java
java MainOOP

