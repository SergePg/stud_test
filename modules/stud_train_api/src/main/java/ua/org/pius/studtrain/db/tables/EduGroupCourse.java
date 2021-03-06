/**
 * This class is generated by jOOQ
 */
package ua.org.pius.studtrain.db.tables;

import ua.org.pius.studtrain.db.Keys;
import ua.org.pius.studtrain.db.Public;
import ua.org.pius.studtrain.db.tables.records.EduGroupCourseRecord;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.5" },
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EduGroupCourse extends org.jooq.impl.TableImpl<EduGroupCourseRecord> {

	private static final long serialVersionUID = -1869199004;

	/**
	 * The singleton instance of <code>public.edu_group_course</code>
	 */
	public static final EduGroupCourse EDU_GROUP_COURSE = new EduGroupCourse();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<EduGroupCourseRecord> getRecordType() {
		return EduGroupCourseRecord.class;
	}

	/**
	 * The column <code>public.edu_group_course.id</code>.
	 */
	public final org.jooq.TableField<EduGroupCourseRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.edu_group_course.edu_group_id</code>.
	 */
	public final org.jooq.TableField<EduGroupCourseRecord, Integer> EDU_GROUP_ID = createField("edu_group_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>public.edu_group_course.studies_course_id</code>.
	 */
	public final org.jooq.TableField<EduGroupCourseRecord, Integer> STUDIES_COURSE_ID = createField("studies_course_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>public.edu_group_course</code> table reference
	 */
	public EduGroupCourse() {
		this("edu_group_course", null);
	}

	/**
	 * Create an aliased <code>public.edu_group_course</code> table reference
	 */
	public EduGroupCourse(String alias) {
		this(alias, EduGroupCourse.EDU_GROUP_COURSE);
	}

	private EduGroupCourse(String alias, org.jooq.Table<EduGroupCourseRecord> aliased) {
		this(alias, aliased, null);
	}

	private EduGroupCourse(String alias, org.jooq.Table<EduGroupCourseRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<EduGroupCourseRecord> getPrimaryKey() {
		return Keys.PK_EDU_GROUP_COURSE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<EduGroupCourseRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<EduGroupCourseRecord>>asList(Keys.PK_EDU_GROUP_COURSE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<EduGroupCourseRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<EduGroupCourseRecord, ?>>asList(Keys.EDU_GROUP_COURSE__FK_EDU_GROUP_COURSE_EDU_GROUP, Keys.EDU_GROUP_COURSE__FK_EDU_GROUP_COURSE_STUDIES_COURSE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EduGroupCourse as(String alias) {
		return new EduGroupCourse(alias, this);
	}

	/**
	 * Rename this table
	 */
	public EduGroupCourse rename(String name) {
		return new EduGroupCourse(name, null);
	}
}
