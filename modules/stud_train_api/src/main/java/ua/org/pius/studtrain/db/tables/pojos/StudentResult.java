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
public class StudentResult implements java.io.Serializable {

	private static final long serialVersionUID = 1370712728;

	private Integer  id;
	private String   text;
	private Integer  ball;
	private Integer  successQuestion;
	private Integer  allQuestions;
	private java.sql.Timestamp timeStart;
	private java.sql.Timestamp timeEnd;

	public StudentResult() {}

	public StudentResult(
		Integer  id,
		String   text,
		Integer  ball,
		Integer  successQuestion,
		Integer  allQuestions,
		java.sql.Timestamp timeStart,
		java.sql.Timestamp timeEnd
	) {
		this.id = id;
		this.text = text;
		this.ball = ball;
		this.successQuestion = successQuestion;
		this.allQuestions = allQuestions;
		this.timeStart = timeStart;
		this.timeEnd = timeEnd;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Integer getBall() {
		return this.ball;
	}

	public void setBall(Integer ball) {
		this.ball = ball;
	}

	public Integer getSuccessQuestion() {
		return this.successQuestion;
	}

	public void setSuccessQuestion(Integer successQuestion) {
		this.successQuestion = successQuestion;
	}

	public Integer getAllQuestions() {
		return this.allQuestions;
	}

	public void setAllQuestions(Integer allQuestions) {
		this.allQuestions = allQuestions;
	}

	public java.sql.Timestamp getTimeStart() {
		return this.timeStart;
	}

	public void setTimeStart(java.sql.Timestamp timeStart) {
		this.timeStart = timeStart;
	}

	public java.sql.Timestamp getTimeEnd() {
		return this.timeEnd;
	}

	public void setTimeEnd(java.sql.Timestamp timeEnd) {
		this.timeEnd = timeEnd;
	}
}
