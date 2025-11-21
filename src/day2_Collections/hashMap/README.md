# HashMap & Stream API Example

## Description
This project demonstrates the fundamental usage of Java `HashMap` and the Java 8 Stream API.  
It includes simple examples for adding, updating, removing, and iterating over key-value pairs, as well as stream-based operations such as filtering, sorting, and calculating aggregates.  
A lightweight `Customer` model is also used to show how streams work with custom objects stored in a map.

---

## Concepts Learned
- Creating and managing key-value pairs with `HashMap`
- Essential map operations:  
  `put()`, `get()`, `remove()`, `containsKey()`, `containsValue()`
- Iteration techniques:
    - `entrySet()` for accessing key-value pairs
    - `keySet()` for accessing keys only
    - `values()` for accessing values only
    - Stream-based iteration with `forEach()`
---

## Design Decisions

### Why use `HashMap` for customer storage?
`HashMap` provides **O(1) average time complexity** for basic operations like `put()`, `get()`, and `remove()`.  
This makes it ideal for scenarios where fast lookup by a unique identifier (such as customer ID) is required.  
Unlike a `List`, a `HashMap` enforces uniqueness of keys and allows direct access without iteration.

---

### Why use Integer keys instead of auto-generated IDs?
Using explicit integer keys keeps the example simple and demonstrates how `HashMap` works with primitive wrapper types.  
In real-world applications, IDs might be auto-generated using a counter, UUID, or database sequence.

---

### Why create a `CustomerManager` class?
The `CustomerManager` class encapsulates all map operations, following the **Single Responsibility Principle**.  
This design:
- Hides the internal `HashMap` implementation from external code
- Provides clear, reusable methods for CRUD operations
- Makes stream-based queries (like filtering adults or sorting by age) easily accessible
- Improves testability and maintainability

---

### Why use streams on `values()` instead of `entrySet()`?
When operations only involve the stored objects (not the keys), using `values().stream()` is cleaner and more readable.  
For operations that require both key and value, `entrySet().stream()` is the appropriate choice.

---

### Why use `sorted()` with a custom comparator?
The expression `sorted((u1, u2) -> u2.getAge() - u1.getAge())` sorts customers in **descending order** by age.  
This demonstrates how streams can use inline comparators for flexible ordering without modifying the original collection.

---

### Why use `orElse(0)` with `average()`?
The `average()` method returns an `OptionalDouble` because the stream might be empty.  
Using `orElse(0)` provides a safe default value, preventing `NoSuchElementException` and making the code more robust.