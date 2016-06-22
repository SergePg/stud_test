/**
 * This class is generated by jOOQ
 */
package ua.org.pius.studtrain.db.tables.records;

import ua.org.pius.studtrain.db.tables.QuestionStatistics;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.5" },
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class QuestionStatisticsRecord extends org.jooq.impl.UpdatableRecordImpl<QuestionStatisticsRecord> implements org.jooq.Record10<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> {

	private static final long serialVersionUID = 1421260612;

	/**
	 * Setter for <code>public.question_statistics.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.question_statistics.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.question_statistics.number_exam_for_theme</code>.
	 */
	public void setNumberExamForTheme(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.question_statistics.number_exam_for_theme</code>.
	 */
	public Integer getNumberExamForTheme() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.question_statistics.number_exam_for_question</code>.
	 */
	public void setNumberExamForQuestion(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.question_statistics.number_exam_for_question</code>.
	 */
	public Integer getNumberExamForQuestion() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>public.question_statistics.number_corrects</code>.
	 */
	public void setNumberCorrects(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.question_statistics.number_corrects</code>.
	 */
	public Integer getNumberCorrects() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>public.question_statistics.number_incorrects</code>.
	 */
	public void setNumberIncorrects(Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.question_statistics.number_incorrects</code>.
	 */
	public Integer getNumberIncorrects() {
		return (Integer) getValue(4);
	}

	/**
	 * Setter for <code>public.question_statistics.number_rejections</code>.
	 */
	public void setNumberRejections(Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.question_statistics.number_rejections</code>.
	 */
	public Integer getNumberRejections() {
		return (Integer) getValue(5);
	}

	/**
	 * Setter for <code>public.question_statistics.number_timeout</code>.
	 */
	public void setNumberTimeout(Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>public.question_statistics.number_timeout</code>.
	 */
	public Integer getNumberTimeout() {
		return (Integer) getValue(6);
	}

	/**
	 * Setter for <code>public.question_statistics.summ_ball_possible</code>.
	 */
	public void setSummBallPossible(Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>public.question_statistics.summ_ball_possible</code>.
	 */
	public Integer getSummBallPossible() {
		return (Integer) getValue(7);
	}

	/**
	 * Setter for <code>public.question_statistics.summ_ball</code>.
	 */
	public void setSummBall(Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>public.question_statistics.summ_ball</code>.
	 */
	public Integer getSummBall() {
		return (Integer) getValue(8);
	}

	/**
	 * Setter for <code>public.question_statistics.question_id</code>.
	 */
	public void setQuestionId(Integer value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>public.question_statistics.question_id</code>.
	 */
	public Integer getQuestionId() {
		return (Integer) getValue(9);
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
	// Record10 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> fieldsRow() {
		return (org.jooq.Row10) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> valuesRow() {
		return (org.jooq.Row10) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<Integer> field1() {
		return QuestionStatistics.QUESTION_STATISTICS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<Integer> field2() {
		return QuestionStatistics.QUESTION_STATISTICS.NUMBER_EXAM_FOR_THEME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<Integer> field3() {
		return QuestionStatistics.QUESTION_STATISTICS.NUMBER_EXAM_FOR_QUESTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<Integer> field4() {
		return QuestionStatistics.QUESTION_STATISTICS.NUMBER_CORRECTS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<Integer> field5() {
		return QuestionStatistics.QUESTION_STATISTICS.NUMBER_INCORRECTS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<Integer> field6() {
		return QuestionStatistics.QUESTION_STATISTICS.NUMBER_REJECTIONS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<Integer> field7() {
		return QuestionStatistics.QUESTION_STATISTICS.NUMBER_TIMEOUT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<Integer> field8() {
		return QuestionStatistics.QUESTION_STATISTICS.SUMM_BALL_POSSIBLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<Integer> field9() {
		return QuestionStatistics.QUESTION_STATISTICS.SUMM_BALL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<Integer> field10() {
		return QuestionStatistics.QUESTION_STATISTICS.QUESTION_ID;
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
		return getNumberExamForTheme();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getNumberExamForQuestion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getNumberCorrects();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getNumberIncorrects();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getNumberRejections();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value7() {
		return getNumberTimeout();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value8() {
		return getSummBallPossible();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value9() {
		return getSummBall();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value10() {
		return getQuestionId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QuestionStatisticsRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QuestionStatisticsRecord value2(Integer value) {
		setNumberExamForTheme(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QuestionStatisticsRecord value3(Integer value) {
		setNumberExamForQuestion(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QuestionStatisticsRecord value4(Integer value) {
		setNumberCorrects(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QuestionStatisticsRecord value5(Integer value) {
		setNumberIncorrects(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QuestionStatisticsRecord value6(Integer value) {
		setNumberRejections(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QuestionStatisticsRecord value7(Integer value) {
		setNumberTimeout(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QuestionStatisticsRecord value8(Integer value) {
		setSummBallPossible(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QuestionStatisticsRecord value9(Integer value) {
		setSummBall(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QuestionStatisticsRecord value10(Integer value) {
		setQuestionId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QuestionStatisticsRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, Integer value6, Integer value7, Integer value8, Integer value9, Integer value10) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached QuestionStatisticsRecord
	 */
	public QuestionStatisticsRecord() {
		super(QuestionStatistics.QUESTION_STATISTICS);
	}

	/**
	 * Create a detached, initialised QuestionStatisticsRecord
	 */
	public QuestionStatisticsRecord(Integer id, Integer numberExamForTheme, Integer numberExamForQuestion, Integer numberCorrects, Integer numberIncorrects, Integer numberRejections, Integer numberTimeout, Integer summBallPossible, Integer summBall, Integer questionId) {
		super(QuestionStatistics.QUESTION_STATISTICS);

		setValue(0, id);
		setValue(1, numberExamForTheme);
		setValue(2, numberExamForQuestion);
		setValue(3, numberCorrects);
		setValue(4, numberIncorrects);
		setValue(5, numberRejections);
		setValue(6, numberTimeout);
		setValue(7, summBallPossible);
		setValue(8, summBall);
		setValue(9, questionId);
	}
}