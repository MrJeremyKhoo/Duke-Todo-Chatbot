public abstract class Task {
	protected String description;
	protected boolean isDone;
	public Task(String description) {
		this.description = description;
		this.isDone = false;
	}
	abstract String getDate();
	abstract String getTag();
	public String getStatusIcon() {
		return (isDone ? "X" : " "); // mark done task with X
	}
	
	public String getDescription() {
		return description; 
	}
	
	
	public void markTask(boolean b) {
		isDone = b;
	}
	
	
	@Override
	public String toString() {
		return "[" + getStatusIcon() + "] " + description; // mark done task with X
	}

}