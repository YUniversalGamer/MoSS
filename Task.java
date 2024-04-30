public class Task 
{
    private String name;
    private String description;
    private SimpleDate dueDate;
    private boolean isComplete = false;
    
    /**
     * Name only constructor
     * @param n Name of the task
     */
    public Task(String n)
    {
        name = n;
    }

    /**
     * Name and description constructor
     * @param n Name of the task
     * @param d Description of the task
     */
    public Task(String n, String d)
    {
        name = n;
        description = d;
    }

    /**
     * Name, description, and due date constructor
     * @param n Name of the task
     * @param d Description of the task
     * @param date Due date of the task
     */
    public Task(String n, String d, SimpleDate date)
    {
        name = n;
        description = d;
        dueDate = date;
    }

    /**
     * Name and due date constructor
     * @param n Name of the task
     * @param date Due date of the task
     */
    public Task(String n, SimpleDate date)
    {
        name = n;
        dueDate = date;
    }

    /**
     * Returns the name of the task
     * @return Name of task
     */
    public String getName()
    {
        return name;
    }

    /**
     * Returns the description of the task
     * @return Description of task
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Returns the due date of the task as a SimpleDate
     * @return Due date of the task
     */
    public SimpleDate getDueDate()
    {
        return dueDate;
    }

    /**
     * Returns the completion status of the task
     * @return Completion status of the task
     */
    public boolean getCompleteStatus()
    {
        return isComplete;
    }

    /**
     * Sets the name of the task
     * @param n The name to assign to the task
     */
    public void setName(String n)
    {
        name = n;
    }

    /**
     * Sets the description of the task
     * @param d The description to assign to the task
     */
    public void setDescription(String d)
    {
        description = d;
    }

    /**
     * Sets the due date to the given month, day, and year
     * @param m The month to assign
     * @param d The day to assign
     * @param y The year to assign
     */
    public void setDueDate(int m, int d, int y)
    {
        dueDate.setDate(m, d, y);
    }

    /**
     * Sets the due date to the given SimpleDate object
     * @param date The SimpleDate object to assign to the tasks due date
     */
    public void setDueDateRaw(SimpleDate date)
    {
        dueDate = date;
    }

    /**
     * Marks the task as complete
     */
    public void complete()
    {
        isComplete = true;
    }

    /**
     * Marks the task as incomplete
     */
    public void unComplete()
    {
        isComplete = false;
    }
}
