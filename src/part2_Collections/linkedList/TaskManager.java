package part2_Collections.linkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {

    private LinkedList<Task> tasks = new LinkedList<>();

    public void addTask(String title, int priority){
        tasks.add(new Task(title,priority));
    }

    public void addHighPriorityTask(String title, int priority){
        tasks.addFirst(new Task(title,priority));
    }

    public Task getNextTask(){
        return tasks.pollFirst();
    }

    public void printAllTasks(){
        System.out.println("ALL TASKS");
        tasks.stream()
                .forEach(System.out::println);
    }

    public List<Task> getTasksWithMinPriority(int minPriority) {
        return tasks.stream()
                .filter(task -> task.getPriority() >= minPriority)
                .sorted((t1,t2) -> Integer.compare(t2.getPriority(),t1.getPriority()))
                .collect(Collectors.toList());
    }

    public boolean hasVeryHighPriorityTask(){
        return tasks.stream()
                .anyMatch(task -> task.getPriority() >= 5);
    }

    public double getAveragePriority(){
        return tasks.stream()
                .mapToInt(Task::getPriority)
                .average()
                .orElse(0);
    }

}
