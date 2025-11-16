# Stream API Example

## Description
This project demonstrates the fundamental usage of the Java 8 Stream API.  
It includes clean and simple examples of filtering, transforming, mapping, collecting, sorting, matching, counting, numeric operations, and flattening nested structures with `flatMap`.  
The goal is to show how Stream pipelines work in real-world scenarios and how functional-style programming simplifies collection processing in Java.

---

## Concepts Learned

- Stream creation from lists
- Core Stream operations:
    - `filter()` – selecting elements that meet a condition
    - `map()` – transforming elements into new values
    - `collect()` – converting a stream back into a collection
    - `sorted()` – ordering elements
    - `distinct()` – removing duplicates
    - `limit()` / `skip()` – taking or skipping specific portions of a stream
    - `anyMatch()` – checking if at least one element matches a condition
    - `allMatch()` / `noneMatch()` – validating global conditions across the stream
    - `findFirst()` – retrieving the first matching element
    - `count()` – counting elements that satisfy a condition
    - `mapToInt()` → `sum()` / `average()` – performing numerical calculations
    - `flatMap()` – flattening nested lists such as `List<List<T>>` into a single list

- Using method references:
    - `String::toUpperCase`
    - `System.out::println`

- Functional programming concepts introduced by Java 8:
    - Lambdas
    - Functional interfaces (`Predicate`, `Function`, `Consumer`)
    - Declarative processing instead of imperative looping

---

## Design Decisions

### Why use the Stream API?
The Stream API provides a modern, functional alternative to traditional loops.  
It enables:

- Cleaner and more declarative code
- Chaining multiple operations into readable pipelines
- Safer and side-effect-free processing (original data is not modified)
- More expressive transformation logic
- Better abstraction for filtering, mapping, and collecting data

---

### Why use method references?
Method references simplify common operations like:

- `String::toUpperCase`
- `System.out::println`

They provide:

- Cleaner syntax
- Shorter and more readable pipelines
- The same functionality as lambdas, but with improved clarity

---

