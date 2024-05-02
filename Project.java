public class Project 
{
    private String name;
    private Task[] tasks = {new Task("Placeholder")};
    
    /**
     * Name only constructor
     * @param n Name of project
     */
    public Project(String n)
    {
        name = n;
    }

    /**
     * Returns the name of the project
     * @return Name of project
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets the name of the project
     * @param n Name of project
     */
    public void setName(String n)
    {
        name = n;
    }

    /**
     * Accepts a Task object as a parameter and adds it to the project
     * @param t Task to add
     */
    public void addTask(Task t)
    {
        if (tasks[0].getName() == "Placeholder")
        {
            tasks[0] = t;
        }

        else
        {
            Task[] tempTasks = new Task[tasks.length + 1];

            for (int i = 0; i < tasks.length; i++)
            {
                tempTasks[i] = tasks[i];
            }

            tempTasks[tasks.length] = t;

            tasks = tempTasks;
        }
    }

    /**
     * Accepts a name and adds a task to the project with it
     * @param n Name of task
     */
    public void addTask(String n)
    {
        Task newTask = new Task(n);
        
        if (tasks[0].getName() == "Placeholder")
        {
            tasks[0] = newTask;
        }

        else
        {
            Task[] tempTasks = new Task[tasks.length + 1];

            for (int i = 0; i < tasks.length; i++)
            {
                tempTasks[i] = tasks[i];
            }

            tempTasks[tasks.length] = newTask;

            tasks = tempTasks;
        }
    }

    /**
     * Accepts a name and description and adds a task with those to the project
     * @param n Name of task
     * @param d Description of task
     */
    public void addTask(String n, String d)
    {
        Task newTask = new Task(n,d);
        
        if (tasks[0].getName() == "Placeholder")
        {
            tasks[0] = newTask;
        }

        else
        {
            Task[] tempTasks = new Task[tasks.length + 1];

            for (int i = 0; i < tasks.length; i++)
            {
                tempTasks[i] = tasks[i];
            }

            tempTasks[tasks.length] = newTask;

            tasks = tempTasks;
        }
    }

    /**
     * Accepts a name, description, and due date and adds a task with those to the project
     * @param n Name of task
     * @param d Description of task
     * @param date Due date of task
     */
    public void addTask(String n, String d, SimpleDate date)
    {
        Task newTask = new Task(n,d, date);
        
        if (tasks[0].getName() == "Placeholder")
        {
            tasks[0] = newTask;
        }

        else
        {
            Task[] tempTasks = new Task[tasks.length + 1];

            for (int i = 0; i < tasks.length; i++)
            {
                tempTasks[i] = tasks[i];
            }

            tempTasks[tasks.length] = newTask;

            tasks = tempTasks;
        }
    }

    /**
     * Accepts a name and due date and adds a task with those to the project
     * @param n Name of task
     * @param date Due date of tasks
     */
    public void addTask(String n, SimpleDate date)
    {
        Task newTask = new Task(n,"",date);
        
        if (tasks[0].getName() == "Placeholder")
        {
            tasks[0] = newTask;
        }

        else
        {
            Task[] tempTasks = new Task[tasks.length + 1];

            for (int i = 0; i < tasks.length; i++)
            {
                tempTasks[i] = tasks[i];
            }

            tempTasks[tasks.length] = newTask;

            tasks = tempTasks;
        }
    }

    /**
     * Accepts the index of a task and removes it from the project
     * @param index Index of task to remove
     */
    public void removeTask(int index)
    {
        Task[] tempTasks = new Task[tasks.length - 1];

        for (int i = 0; i < index; i++)
        {
            tempTasks[i] = tasks[i];
        }

        for (int i = index + 1; i < tasks.length; i++)
        {
            tempTasks[i - 1] = tasks[i];
        }

        tasks = tempTasks;
    }

    /**
     * Accepts index of a task and returns that task
     * @param index Index of task
     * @return Task
     */
    public Task getTask(int index)
    {
        return tasks[index];
    }

    public int getProjectLength()
    {
        return tasks.length;
    }


}
