# LinkedList Example - Task Manager

## Description
Demonstrates LinkedList usage in Java through a task management system with priority-based ordering and Stream API operations.

## Concepts Learned
- LinkedList data structure
- Adding elements at head (addFirst) and tail (add)
- Polling elements (pollFirst)
- Stream API filtering and sorting
- Method references
- Optional handling

## Design Decisions

### Why LinkedList instead of ArrayList?
LinkedList is efficient for frequent insertions at the beginning (addFirst) which is needed for high-priority tasks. ArrayList would require shifting elements when inserting at index 0, making it O(n). LinkedList handles this in O(1).

### Why addFirst for high priority tasks?
High priority tasks need immediate attention, so they go to the front of the queue. Using addFirst() places urgent tasks at the head, ensuring they're processed first when getNextTask() is called.

### Why pollFirst instead of getFirst?
pollFirst() retrieves AND removes the task from the list, simulating task completion. getFirst() would only peek without removing. This ensures processed tasks don't remain in the queue.

### Why Stream API for filtering?
Streams provide clean, declarative syntax for filtering and sorting tasks. The getTasksWithMinPriority() method chains filter() and sorted() operations, making the code readable and maintainable without manual loops.

## Key Features

1. **Priority Queue Simulation** - Tasks processed in priority order
2. **High Priority Insertion** - Urgent tasks jump to front
3. **Filtering** - Get tasks above certain priority
4. **Aggregation** - Calculate average priority
5. **Existence Check** - Check for critical (priority >= 5) tasks

## Methods Explained

### addTask(title, priority)
Adds task to end of queue (normal priority)

### addHighPriorityTask(title, priority)
Adds task to front of queue (urgent)

### getNextTask()
Retrieves and removes first task

### getTasksWithMinPriority(minPriority)
Returns sorted list of tasks with priority >= threshold

### hasVeryHighPriorityTask()
Checks if any task has priority >= 5

### getAveragePriority()
Calculates mean priority of all tasks

## How to Run
```bash
javac MainOOP.java
java MainOOP
```

