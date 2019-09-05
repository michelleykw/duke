package duke;

import java.util.Date;

public class Event extends Task {
    protected String at;

    public Event(String description, Date at) {
        super(description);
        super.date = at;
        super.type ="E";
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + " (at: " + super.date + ")";
    }
}