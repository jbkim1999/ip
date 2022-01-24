import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Deadline extends Task {

    Deadline(String description, String by) throws DateTimeParseException {
        super(description, LocalDate.parse(by));
    }

    public String dateToString() {
        String formattedDate = this.date.orElseThrow().format(DateTimeFormatter.ofPattern("MMM d yyyy"));
        return formattedDate;
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + "(by: " + this.dateToString() + ")";
    }
}
