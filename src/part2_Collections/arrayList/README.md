# Collections & Stream API Example

## Description
This project demonstrates the fundamental usage of Java `ArrayList` and the Java 8 Stream API.  
It includes simple examples for adding, updating, iterating, and filtering data, as well as stream-based operations such as mapping, collecting, and matching.  
A lightweight `User` model is also used to show how streams work with custom objects.

---

## Concepts Learned
- Creating and managing lists with `ArrayList`
- Essential list operations:  
  `add()`, `get()`, `set()`, `contains()`, `isEmpty()`, `size()`
- Iteration techniques:
    - Classic `for` loop
    - Enhanced `for-each` loop
    - Stream-based iteration with `forEach()`
- Stream API fundamentals:
    - `filter()` – selecting matching elements
    - `map()` – transforming elements
    - `collect()` – converting a stream back to a list
    - `anyMatch()` – checking conditions
- Using method references (`String::toUpperCase`, `User::getName`)
- Performing numerical calculations using `mapToInt()`, `sum()`, `average()`

---

## Design Decisions

### Why use `List` instead of `ArrayList`?
Using the interface (`List`) on the left side improves flexibility.  
If the implementation changes from `ArrayList` to another type (e.g., `LinkedList`), the rest of the code remains the same.  
This follows the **“program to an interface”** principle, which is a recommended object-oriented design practice.

---

### Why use the Stream API alongside loops?
Classic loops demonstrate how collections traditionally work, but Streams provide several advantages:

- Cleaner and more declarative style
- Chainable operations (`filter → map → collect`)
- Easier and more readable data transformations
- Streams do **not modify** the original list, which makes the code more functional and safer to work with

---

### Why create a simple `User` model?
The `User` class demonstrates realistic filtering and transformation use cases, such as:

- Finding adult users
- Filtering users by city
- Checking if any user exceeds a certain age

It also shows how the Stream API handles **custom objects**, not just primitives or Strings.

---

### Why use method references?
Method references such as `String::toUpperCase` or `User::getName` make stream pipelines shorter and easier to read.  
They are functionally identical to lambdas but provide a cleaner and more concise syntax, improving readability in stream operations.
