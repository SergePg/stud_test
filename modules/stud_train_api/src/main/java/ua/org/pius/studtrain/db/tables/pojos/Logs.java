/**
 * This class is generated by jOOQ
 */
package ua.org.pius.studtrain.db.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.5" },
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Logs implements java.io.Serializable {

	private static final long serialVersionUID = -1003153109;

	private String   username;
	private String   domain;
	private java.sql.Timestamp createdAt;
	private String   description;

	public Logs() {}

	public Logs(
		String   username,
		String   domain,
		java.sql.Timestamp createdAt,
		String   description
	) {
		this.username = username;
		this.domain = domain;
		this.createdAt = createdAt;
		this.description = description;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public java.sql.Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(java.sql.Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
