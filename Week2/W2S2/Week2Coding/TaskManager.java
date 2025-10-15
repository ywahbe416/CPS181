
/**
 * You're about to build a command line based task manager that allows users to manage a personal todo list.
 * The task manager should support the following functionalities:
 * add a new task with a name, description, and due date.
 * view all tasks
 * mark tasks as completed
 * save and load tasks from a file
 * exit the program.
 * the user will interact with the task manager through a simple text-based menu.
 * data will be stored using arraylist and optionally written/read from a file.
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class TaskManager {
	// Inner class to represent a Task
	public static class Task {
		String name;
		String description;
		String dueDate;
		boolean completed;

		public Task(String name, String description, String dueDate) {
			this.name = name;
			this.description = description;
			this.dueDate = dueDate;
			this.completed = false;
		}

		public String toString() {
			return (completed ? "[X] " : "[ ] ") + name + " - " + description + " (Due: " + dueDate + ")";
		}
	}

	private ArrayList<Task> tasks = new ArrayList<>();

	public void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("\nTask Manager Menu:");
			System.out.println("1. Add Task");
			System.out.println("2. View Tasks");
			System.out.println("3. Mark Task as Completed");
			System.out.println("4. Save Tasks to File");
			System.out.println("5. Load Tasks from File");
			System.out.println("6. Exit");
			System.out.print("Choose an option: ");
			int choice = scanner.nextInt();
			scanner.nextLine(); // consume newline

			switch (choice) {
				case 1:
					addTask(scanner);
					break;
				case 2:
					viewTasks();
					break;
				case 3:
					markTaskCompleted(scanner);
					break;
				case 4:
					saveTasks();
					break;
				case 5:
					loadTasks();
					break;
				case 6:
					System.out.println("Exiting Task Manager. Goodbye!");
					return;
				default:
					System.out.println("Invalid option. Try again.");
			}
		}
	}

	// Placeholder methods
	private void addTask(Scanner scanner) {
		// Implementation will go here
	}

	private void viewTasks() {
		// Implementation will go here
	}

	private void markTaskCompleted(Scanner scanner) {
		// Implementation will go here
	}

	private void saveTasks() {
		// Implementation will go here
	}

	private void loadTasks() {
		// Implementation will go here
	}

	public static void main(String[] args) {
		new TaskManager().run();
	}
}
