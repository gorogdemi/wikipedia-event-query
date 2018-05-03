package wikipedia.event.model;

import java.time.LocalDate;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Class representing an event that occurred on a specific date.
 */
public class Event {

	/**
	 * Date of the event.
	 */
	private LocalDate date;

	/**
	 * Description of the event.
	 */
	private String description;

	/**
	 * Constructor for creating an {@code Event} object.
	 *
	 * @param date the date of the event
	 * @param description the description of the event
	 */
	public Event(LocalDate date, String description) {
		this.date = date;
		this.description = description;
	}

	/**
	 * Returns the date of this event.
	 *
	 * @return the date of this event
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * Sets the date of this event.
	 *
	 * @param date the date of this event
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * Returns the description of this event.
	 *
	 * @return the description of this event
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description of this event.
	 *
	 * @param description the description of this event
	 */
	public void setDescription(String description) {
		this.description = description;
	}

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
