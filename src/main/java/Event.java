import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
	
public class Event extends Task {
	protected Optional<LocalDate> to;
	protected Optional<LocalDate> from;
	protected String strFrom;
	protected String strTo;
	public Event(String description, String from, String to) {
		super(description);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		try {
			this.from = Optional.of(LocalDate.parse(from, formatter));
			this.to = Optional.of(LocalDate.parse(to, formatter));
		} catch (Exception e) {
			this.strTo = to;
			this.strFrom = from;
		}
			
	}

	public String getDateMMMddyyyy() {
		if (strTo == null ) {
			DateTimeFormatter date = DateTimeFormatter.ofPattern("MMM dd yyyy");
			String formattedFrom = this.from.get().format(date);
			String formattedTo = this.to.get().format(date);
			return " (from: " + formattedFrom + " to: " + formattedTo + ")";
		}
		return " (from: " + strFrom + " to: " + strTo + ")";
	}

	@Override
	public String toString() {
		return "[E]" + super.toString() + this.getDateMMMddyyyy();
    	}
}
