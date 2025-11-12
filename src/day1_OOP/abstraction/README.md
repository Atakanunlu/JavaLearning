# Abstraction Example - Payment System

## Description
Demonstrates abstraction in Java using abstract classes and interfaces through a payment system with CreditCard and PayPal implementations.

## Concepts Learned
- Abstract class with `abstract` keyword
- Interface implementation with `implements`
- Multiple inheritance through interfaces
- Method overriding in abstract methods
- Polymorphism with abstract types
- Combining abstract class and interface

## Design Decisions

### Why Payment as abstract class?
Payment is abstract because it contains both common functionality (showBalance) and enforces payment behavior (pay method). All payment methods share username and balance, but each processes payments differently. Abstract class allows code reuse while forcing child classes to implement pay().

### Why Payable interface?
Payable defines a contract that every payment method must follow. Using an interface makes it clear: "if you want to be a payment method, you MUST implement pay()". This provides flexibility - any class can become payable by implementing this interface.

### Why Refundable as separate interface?
Not all payment methods support refunds. Making Refundable a separate interface allows optional capability. CreditCard doesn't implement it (no refunds), but PayPal does. This design is flexible - new payment methods can choose whether to support refunds.

### Why PayPal implements both Payment and Refundable?
PayPal extends Payment for core payment functionality and implements Refundable for additional refund capability. This demonstrates multiple inheritance through interfaces - a class can be both a Payment type and have Refundable behavior.

## How to Run
```bash
javac MainOOP.java
java MainOOP
```

