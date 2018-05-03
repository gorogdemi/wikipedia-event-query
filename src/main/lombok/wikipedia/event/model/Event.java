package wikipedia.event.model;

import java.time.LocalDate;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import lombok.Data;
import lombok.NonNull;

/**
 * Class representing an event that occurred on a specific date.
 */
@Data
public class Event {

	/**
	 * Date of the event.
	 */
	@NonNull
	private LocalDate date;

	/**
	 * Description of the event.
	 */
	@NonNull
	private String description;

	// CHECKSTYLE:OFF
	public boolean equals(Object o) {
		if (o == null) return false;
		if (o == this) return true;
		if (! getClass().equals(o.getClass())) return false;
		Event that = (Event) o;
		return new EqualsBuilder()
			.append(date, that.date)
			.append(description, that.description)
			.isEquals();
	}

	public int hashCode() {
		return new HashCodeBuilder(13, 7).append(date).append(description).toHashCode();
	}
	// CHECKSTYLE:ON

	/**
	 * Returns the string representation of this event.
	 *
	 * @return the string representation of this event in the form
	 *         <span><em>date</em><code> - </code><em>description</em></span>
	 */
	public String toString() {
		return String.format("%s - %s", date.toString(), description);
	}

}
