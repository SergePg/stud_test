/**
 * This class is generated by jOOQ
 */
package ua.org.pius.studtrain.db.tables.records;

import ua.org.pius.studtrain.db.tables.TaskAnswer;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.5" },
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TaskAnswerRecord extends org.jooq.impl.UpdatableRecordImpl<TaskAnswerRecord> implements org.jooq.Record4<Integer, Integer, Integer, String> {

	private static final long serialVersionUID = 1749163765;

	/**
	 * Setter for <code>public.task_answer.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.task_answer.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.task_answer.task_questions_id</code>.
	 */
	public void setTaskQuestionsId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.task_answer.task_questions_id</code>.
	 */
	public Integer getTaskQuestionsId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.task_answer.answer_id</code>.
	 */
	public void setAnswerId(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.task_answer.answer_id</code>.
	 */
	public Integer getAnswerId() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>public.task_answer.text</code>.
	 */
	public void setText(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.task_answer.text</code>.
	 */
	public String getText() {
		return (String) getValue(3);
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
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<Integer, Integer, Integer, String> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<Integer, Integer, Integer, String> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<Integer> field1() {
		return TaskAnswer.TASK_ANSWER.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<Integer> field2() {
		return TaskAnswer.TASK_ANSWER.TASK_QUESTIONS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<Integer> field3() {
		return TaskAnswer.TASK_ANSWER.ANSWER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<String> field4() {
		return TaskAnswer.TASK_ANSWER.TEXT;
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
	public Integer value2() {
		return getTaskQuestionsId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getAnswerId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getText();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TaskAnswerRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TaskAnswerRecord value2(Integer value) {
		setTaskQuestionsId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TaskAnswerRecord value3(Integer value) {
		setAnswerId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TaskAnswerRecord value4(String value) {
		setText(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TaskAnswerRecord values(Integer value1, Integer value2, Integer value3, String value4) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TaskAnswerRecord
	 */
	public TaskAnswerRecord() {
		super(TaskAnswer.TASK_ANSWER);
	}

	/**
	 * Create a detached, initialised TaskAnswerRecord
	 */
	public TaskAnswerRecord(Integer id, Integer taskQuestionsId, Integer answerId, String text) {
		super(TaskAnswer.TASK_ANSWER);

		setValue(0, id);
		setValue(1, taskQuestionsId);
		setValue(2, answerId);
		setValue(3, text);
	}
}
