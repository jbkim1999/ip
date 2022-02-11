package istjbot.ui;

/**
 * Encapsulates the concept of text-based Ui representation of the bot.
 * Responsible for printing out all user messages after the command is executed.
 */
public class Ui {

    /**
     * Prints out a welcome message.
     */
    public static String showWelcome() {
        String welcomeMessage = "Hello! I'm IstjBot. \n" + "What can I do for you?";
        return welcomeMessage;
    }

    /**
     * Prints out a confirmation message that the task has been successfully added.
     *
     * @param tasksSize Number of tasks used whether to pluralize "task."
     * @param addedTask String of the task added.
     */
    public String showTaskAdded(int tasksSize, String addedTask) {
        assert tasksSize > 0 : "there should now be at least one task";

        String initialMessage = "As an IstjBot, I will add this task right now. \n";
        // May refactor finalMessage?
        String finalMessage = "Now you have " + tasksSize + " ";
        String plural = tasksSize > 1 ? "tasks" : "task";
        finalMessage += plural + " in the list.";
        return initialMessage + addedTask + "\n" + finalMessage;
    }

    /**
     * Prints out a confirmation that the task has been successfully marked as done.
     *
     * @param task String of the task marked.
     */
    public String showTaskMarked(String task) {
        String message = "As an IstjBot, I've marked this task as done: \n" + task;
        return message;
    }

    /**
     * Prints out a confirmation that the task has been successfully unmarked as not done.
     *
     * @param task String of the task unmarked.
     */
    public String showTaskUnmarked(String task) {
        String message = "As an IstjBot, I've unmarked this task: \n" + task;
        return message;
    }

    /**
     * Prints out a confirmation message that the task has been successfully deleted.
     *
     * @param tasksSize Number of tasks used whether to pluralize "task."
     * @param deletedTask String of the task that has just been deleted.
     */
    public String showTaskDeleted(int tasksSize, String deletedTask) {
        String initialMessage = "As an IstjBot, I've removed this task: \n";
        String finalMessage = "Now you have " + tasksSize + " ";
        String plural = tasksSize > 1 ? "tasks" : "task";
        finalMessage += plural + " in the list.";
        return initialMessage + deletedTask + "\n" + finalMessage;
    }

    /**
     * Prints out messages and tasks that have been filtered with user's input date.
     *
     * @param searchList String of all tasks that are filtered with user's input date.
     */
    public String showTasksByDate(String searchList) {
        String initialMessage = "As an IstjBot, I present you the task(s) with that date.";
        initialMessage += searchList.isEmpty() ? "" : "\n";
        return initialMessage + searchList;
    }

    /**
     * Prints out messages and tasks that have been filtered with user's input keyword.
     *
     * @param searchList String of all tasks that are filtered with user's input keyword.
     */
    public String showTasksByKeyword(String searchList) {
        String initialMessage = "As an IstjBot, I present you the task(s) with that keyword.";
        initialMessage += searchList.isEmpty() ? "" : "\n";
        return initialMessage + searchList;
    }

    /**
     * Prints out all tasks that are stored.
     *
     * @param list String of all tasks.
     */
    public String showTasks(String list) {
        String initialMessage = "As an IstjBot, I present you the task(s) in your list:";
        initialMessage += list.isEmpty() ? "" : "\n";
        return initialMessage + list;
    }

    /**
     * Prints out a bye message to the user.
     */
    public String showBye() {
        String message = "Bye, I, IstjBot, will be organizing your tasks until you come back.";
        return message;
    }

    /**
     * Prints out the error message.
     *
     * @param errorMessage String of the error message.
     */
    public String showError(String errorMessage) {
        return errorMessage;
    }
}
