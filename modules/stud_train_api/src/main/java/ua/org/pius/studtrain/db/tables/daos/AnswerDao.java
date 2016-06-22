/**
 * This class is generated by jOOQ
 */
package ua.org.pius.studtrain.db.tables.daos;

import ua.org.pius.studtrain.db.tables.Answer;
import ua.org.pius.studtrain.db.tables.records.AnswerRecord;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.5" },
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AnswerDao extends org.jooq.impl.DAOImpl<AnswerRecord, ua.org.pius.studtrain.db.tables.pojos.Answer, Integer> {

	/**
	 * Create a new AnswerDao without any configuration
	 */
	public AnswerDao() {
		super(Answer.ANSWER, ua.org.pius.studtrain.db.tables.pojos.Answer.class);
	}

	/**
	 * Create a new AnswerDao with an attached configuration
	 */
	public AnswerDao(org.jooq.Configuration configuration) {
		super(Answer.ANSWER, ua.org.pius.studtrain.db.tables.pojos.Answer.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Integer getId(ua.org.pius.studtrain.db.tables.pojos.Answer object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<ua.org.pius.studtrain.db.tables.pojos.Answer> fetchById(Integer... values) {
		return fetch(Answer.ANSWER.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public ua.org.pius.studtrain.db.tables.pojos.Answer fetchOneById(Integer value) {
		return fetchOne(Answer.ANSWER.ID, value);
	}

	/**
	 * Fetch records that have <code>text IN (values)</code>
	 */
	public java.util.List<ua.org.pius.studtrain.db.tables.pojos.Answer> fetchByText(String... values) {
		return fetch(Answer.ANSWER.TEXT, values);
	}

	/**
	 * Fetch records that have <code>question_id IN (values)</code>
	 */
	public java.util.List<ua.org.pius.studtrain.db.tables.pojos.Answer> fetchByQuestionId(Integer... values) {
		return fetch(Answer.ANSWER.QUESTION_ID, values);
	}
}
