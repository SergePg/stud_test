/**
 * This class is generated by jOOQ
 */
package ua.org.pius.studtrain.db.tables;

import ua.org.pius.studtrain.db.Keys;
import ua.org.pius.studtrain.db.Public;
import ua.org.pius.studtrain.db.tables.records.StudentTaskRecord;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.5" },
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StudentTask extends org.jooq.impl.TableImpl<StudentTaskRecord> {

	private static final long serialVersionUID = -1999171965;

	/**
	 * The singleton instance of <code>public.student_task</code>
	 */
	public static final StudentTask STUDENT_TASK = new StudentTask();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<StudentTaskRecord> getRecordType() {
		return StudentTaskRecord.class;
	}

	/**
	 * The column <code>public.student_task.id</code>.
	 */
	public final org.jooq.TableField<StudentTaskRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.student_task.student_id</code>.
	 */
	public final org.jooq.TableField<StudentTaskRecord, Integer> STUDENT_ID = createField("student_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.student_task.exam_id</code>.
	 */
	public final org.jooq.TableField<StudentTaskRecord, Integer> EXAM_ID = createField("exam_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.student_task.examination_ticket_id</code>.
	 */
	public final org.jooq.TableField<StudentTaskRecord, Integer> EXAMINATION_TICKET_ID = createField("examination_ticket_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.student_task.student_result_id</code>.
	 */
	public final org.jooq.TableField<StudentTaskRecord, Integer> STUDENT_RESULT_ID = createField("student_result_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>public.student_task</code> table reference
	 */
	public StudentTask() {
		this("student_task", null);
	}

	/**
	 * Create an aliased <code>public.student_task</code> table reference
	 */
	public StudentTask(String alias) {
		this(alias, StudentTask.STUDENT_TASK);
	}

	private StudentTask(String alias, org.jooq.Table<StudentTaskRecord> aliased) {
		this(alias, aliased, null);
	}

	private StudentTask(String alias, org.jooq.Table<StudentTaskRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<StudentTaskRecord> getPrimaryKey() {
		return Keys.PK_STUDENT_TASK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<StudentTaskRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<StudentTaskRecord>>asList(Keys.PK_STUDENT_TASK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<StudentTaskRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<StudentTaskRecord, ?>>asList(Keys.STUDENT_TASK__FK_STUDENT_TASK_STUDENT, Keys.STUDENT_TASK__FK_STUDENT_TASK_EXAM, Keys.STUDENT_TASK__FK_STUDENT_TASK_EXAMINATION_TICKET, Keys.STUDENT_TASK__FK_STUDENT_TASK_STUDENT_RESULT);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StudentTask as(String alias) {
		return new StudentTask(alias, this);
	}

	/**
	 * Rename this table
	 */
	public StudentTask rename(String name) {
		return new StudentTask(name, null);
	}
}
