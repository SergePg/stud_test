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
public class StudentStatistics implements java.io.Serializable {

	private static final long serialVersionUID = -1908496590;

	private Integer id;
	private Integer numberExamForGroup;
	private Integer numberExamForStud;
	private Integer numberCorrects;
	private Integer numberIncorrects;
	private Integer numberRejections;
	private Integer numberTimeout;
	private Integer summBallPossible;
	private Integer summBall;
	private Integer studentId;

	public StudentStatistics() {}

	public StudentStatistics(
		Integer id,
		Integer numberExamForGroup,
		Integer numberExamForStud,
		Integer numberCorrects,
		Integer numberIncorrects,
		Integer numberRejections,
		Integer numberTimeout,
		Integer summBallPossible,
		Integer summBall,
		Integer studentId
	) {
		this.id = id;
		this.numberExamForGroup = numberExamForGroup;
		this.numberExamForStud = numberExamForStud;
		this.numberCorrects = numberCorrects;
		this.numberIncorrects = numberIncorrects;
		this.numberRejections = numberRejections;
		this.numberTimeout = numberTimeout;
		this.summBallPossible = summBallPossible;
		this.summBall = summBall;
		this.studentId = studentId;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumberExamForGroup() {
		return this.numberExamForGroup;
	}

	public void setNumberExamForGroup(Integer numberExamForGroup) {
		this.numberExamForGroup = numberExamForGroup;
	}

	public Integer getNumberExamForStud() {
		return this.numberExamForStud;
	}

	public void setNumberExamForStud(Integer numberExamForStud) {
		this.numberExamForStud = numberExamForStud;
	}

	public Integer getNumberCorrects() {
		return this.numberCorrects;
	}

	public void setNumberCorrects(Integer numberCorrects) {
		this.numberCorrects = numberCorrects;
	}

	public Integer getNumberIncorrects() {
		return this.numberIncorrects;
	}

	public void setNumberIncorrects(Integer numberIncorrects) {
		this.numberIncorrects = numberIncorrects;
	}

	public Integer getNumberRejections() {
		return this.numberRejections;
	}

	public void setNumberRejections(Integer numberRejections) {
		this.numberRejections = numberRejections;
	}

	public Integer getNumberTimeout() {
		return this.numberTimeout;
	}

	public void setNumberTimeout(Integer numberTimeout) {
		this.numberTimeout = numberTimeout;
	}

	public Integer getSummBallPossible() {
		return this.summBallPossible;
	}

	public void setSummBallPossible(Integer summBallPossible) {
		this.summBallPossible = summBallPossible;
	}

	public Integer getSummBall() {
		return this.summBall;
	}

	public void setSummBall(Integer summBall) {
		this.summBall = summBall;
	}

	public Integer getStudentId() {
		return this.studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
}
