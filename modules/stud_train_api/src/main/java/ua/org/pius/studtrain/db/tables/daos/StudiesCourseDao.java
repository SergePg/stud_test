/**
 * This class is generated by jOOQ
 */
package ua.org.pius.studtrain.db.tables.daos;

import ua.org.pius.studtrain.db.tables.StudiesCourse;
import ua.org.pius.studtrain.db.tables.records.StudiesCourseRecord;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.5" },
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StudiesCourseDao extends org.jooq.impl.DAOImpl<StudiesCourseRecord, ua.org.pius.studtrain.db.tables.pojos.StudiesCourse, Integer> {

	/**
	 * Create a new StudiesCourseDao without any configuration
	 */
	public StudiesCourseDao() {
		super(StudiesCourse.STUDIES_COURSE, ua.org.pius.studtrain.db.tables.pojos.StudiesCourse.class);
	}

	/**
	 * Create a new StudiesCourseDao with an attached configuration
	 */
	public StudiesCourseDao(org.jooq.Configuration configuration) {
		super(StudiesCourse.STUDIES_COURSE, ua.org.pius.studtrain.db.tables.pojos.StudiesCourse.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Integer getId(ua.org.pius.studtrain.db.tables.pojos.StudiesCourse object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<ua.org.pius.studtrain.db.tables.pojos.StudiesCourse> fetchById(Integer... values) {
		return fetch(StudiesCourse.STUDIES_COURSE.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public ua.org.pius.studtrain.db.tables.pojos.StudiesCourse fetchOneById(Integer value) {
		return fetchOne(StudiesCourse.STUDIES_COURSE.ID, value);
	}

	/**
	 * Fetch records that have <code>name IN (values)</code>
	 */
	public java.util.List<ua.org.pius.studtrain.db.tables.pojos.StudiesCourse> fetchByName(String... values) {
		return fetch(StudiesCourse.STUDIES_COURSE.NAME, values);
	}

	/**
	 * Fetch records that have <code>description IN (values)</code>
	 */
	public java.util.List<ua.org.pius.studtrain.db.tables.pojos.StudiesCourse> fetchByDescription(String... values) {
		return fetch(StudiesCourse.STUDIES_COURSE.DESCRIPTION, values);
	}

	/**
	 * Fetch records that have <code>date_start IN (values)</code>
	 */
	public java.util.List<ua.org.pius.studtrain.db.tables.pojos.StudiesCourse> fetchByDateStart(java.sql.Timestamp... values) {
		return fetch(StudiesCourse.STUDIES_COURSE.DATE_START, values);
	}

	/**
	 * Fetch records that have <code>date_end IN (values)</code>
	 */
	public java.util.List<ua.org.pius.studtrain.db.tables.pojos.StudiesCourse> fetchByDateEnd(java.sql.Timestamp... values) {
		return fetch(StudiesCourse.STUDIES_COURSE.DATE_END, values);
	}

	/**
	 * Fetch records that have <code>state IN (values)</code>
	 */
	public java.util.List<ua.org.pius.studtrain.db.tables.pojos.StudiesCourse> fetchByState(Integer... values) {
		return fetch(StudiesCourse.STUDIES_COURSE.STATE, values);
	}
}
