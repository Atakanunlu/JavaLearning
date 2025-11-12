# Encapsulation Example - Bank Account

## What This Code Does
Demonstrates encapsulation in Java by implementing a bank account system with private fields and controlled access through public methods.

## Concepts Covered
- **Encapsulation** - Hiding internal state with private fields
- **Data validation** - Input validation in setter methods
- **Getters** - Controlled read access to private fields
- **Business logic** - Implementing real-world rules (withdrawal limits, account status)

## Key Learnings

**Why private fields?**
Balance, account number, and status are private to prevent direct manipulation. All changes go through validated methods (deposit, withdraw).

**Why validation in methods?**
- Prevents negative deposits/withdrawals
- Enforces business rules (daily limits, sufficient balance)
- Protects data integrity

**Why isActive flag?**
Controls account state - closed accounts cannot perform transactions. Demonstrates state management in encapsulation.

## Business Rules Implemented
-  Deposit must be positive
-  Withdrawal cannot exceed balance
-  Daily withdrawal limit: 10,000
-  Cannot close account with remaining balance
-  Closed accounts reject all transactions

## Files
- `BankAccount.java` - Encapsulated bank account class
- `MainOOP.java` - Demo with normal and error scenarios

## Run
```bash
javac MainOOP.java
java MainOOP