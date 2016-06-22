/**
 * This class is generated by jOOQ
 */
package ua.org.pius.studtrain.db.tables.daos;

import ua.org.pius.studtrain.db.tables.pojos.Logs;
import ua.org.pius.studtrain.db.tables.records.LogsRecord;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.5" },
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LogsDao extends org.jooq.impl.DAOImpl<LogsRecord, Logs, org.jooq.Record3<String, String, java.sql.Timestamp>> {

	/**
	 * Create a new LogsDao without any configuration
	 */
	public LogsDao() {
		super(ua.org.pius.studtrain.db.tables.Logs.LOGS, Logs.class);
	}

	/**
	 * Create a new LogsDao with an attached configuration
	 */
	public LogsDao(org.jooq.Configuration configuration) {
		super(ua.org.pius.studtrain.db.tables.Logs.LOGS, Logs.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected org.jooq.Record3<String, String, java.sql.Timestamp> getId(Logs object) {
		return compositeKeyRecord(object.getUsername(), object.getDomain(), object.getCreatedAt());
	}

	/**
	 * Fetch records that have <code>username IN (values)</code>
	 */
	public java.util.List<Logs> fetchByUsername(String... values) {
		return fetch(ua.org.pius.studtrain.db.tables.Logs.LOGS.USERNAME, values);
	}

	/**
	 * Fetch records that have <code>domain IN (values)</code>
	 */
	public java.util.List<Logs> fetchByDomain(String... values) {
		return fetch(ua.org.pius.studtrain.db.tables.Logs.LOGS.DOMAIN, values);
	}

	/**
	 * Fetch records that have <code>created_at IN (values)</code>
	 */
	public java.util.List<Logs> fetchByCreatedAt(java.sql.Timestamp... values) {
		return fetch(ua.org.pius.studtrain.db.tables.Logs.LOGS.CREATED_AT, values);
	}

	/**
	 * Fetch records that have <code>description IN (values)</code>
	 */
	public java.util.List<Logs> fetchByDescription(String... values) {
		return fetch(ua.org.pius.studtrain.db.tables.Logs.LOGS.DESCRIPTION, values);
	}
}