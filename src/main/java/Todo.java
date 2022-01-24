public class Todo extends Task {
    Todo(String description) {
        super(description);
    }

    @Override
    public String toTxtString() {
        String marked = this.isDone? "1" : "0";
        String txtString = "todo-" + marked + "-" + this.description;
        return txtString;
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}
