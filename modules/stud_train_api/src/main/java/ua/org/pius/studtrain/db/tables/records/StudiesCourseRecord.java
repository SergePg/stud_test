/**
 * This class is generated by jOOQ
 */
package ua.org.pius.studtrain.db.tables.records;

import ua.org.pius.studtrain.db.tables.StudiesCourse;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.5" },
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StudiesCourseRecord extends org.jooq.impl.UpdatableRecordImpl<StudiesCourseRecord> implements org.jooq.Record6<Integer, String, String, java.sql.Timestamp, java.sql.Timestamp, Integer> {

	private static final long serialVersionUID = 1999369045;

	/**
	 * Setter for <code>public.studies_course.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.studies_course.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.studies_course.name</code>.
	 */
	public void setName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.studies_course.name</code>.
	 */
	public String getName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>public.studies_course.description</code>.
	 */
	public void setDescription(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.studies_course.description</code>.
	 */
	public String getDescription() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>public.studies_course.date_start</code>.
	 */
	public void setDateStart(java.sql.Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.studies_course.date_start</code>.
	 */
	public java.sql.Timestamp getDateStart() {
		return (java.sql.Timestamp) getValue(3);
	}

	/**
	 * Setter for <code>public.studies_course.date_end</code>.
	 */
	public void setDateEnd(java.sql.Timestamp value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.studies_course.date_end</code>.
	 */
	public java.sql.Timestamp getDateEnd() {
		return (java.sql.Timestamp) getValue(4);
	}

	/**
	 * Setter for <code>public.studies_course.state</code>.
	 */
	public void setState(Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.studies_course.state</code>.
	 */
	public Integer getState() {
		return (Integer) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<Integer, String, String, java.sql.Timestamp, java.sql.Timestamp, Integer> fieldsRow() {
		return (org.jooq.Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<Integer, String, String, java.sql.Timestamp, java.sql.Timestamp, Integer> valuesRow() {
		return (org.jooq.Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<Integer> field1() {
		return StudiesCourse.STUDIES_COURSE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<String> field2() {
		return StudiesCourse.STUDIES_COURSE.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<String> field3() {
		return StudiesCourse.STUDIES_COURSE.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field4() {
		return StudiesCourse.STUDIES_COURSE.DATE_START;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field5() {
		return StudiesCourse.STUDIES_COURSE.DATE_END;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<Integer> field6() {
		return StudiesCourse.STUDIES_COURSE.STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value4() {
		return getDateStart();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value5() {
		return getDateEnd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StudiesCourseRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StudiesCourseRecord value2(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StudiesCourseRecord value3(String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StudiesCourseRecord value4(java.sql.Timestamp value) {
		setDateStart(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StudiesCourseRecord value5(java.sql.Timestamp value) {
		setDateEnd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StudiesCourseRecord value6(Integer value) {
		setState(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StudiesCourseRecord values(Integer value1, String value2, String value3, java.sql.Timestamp value4, java.sql.Timestamp value5, Integer value6) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached StudiesCourseRecord
	 */
	public StudiesCourseRecord() {
		super(StudiesCourse.STUDIES_COURSE);
	}

	/**
	 * Create a detached, initialised StudiesCourseRecord
	 */
	public StudiesCourseRecord(Integer id, String name, String description, java.sql.Timestamp dateStart, java.sql.Timestamp dateEnd, Integer state) {
		super(StudiesCourse.STUDIES_COURSE);

		setValue(0, id);
		setValue(1, name);
		setValue(2, description);
		setValue(3, dateStart);
		setValue(4, dateEnd);
		setValue(5, state);
	}
}
