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
public class ExaminationTicket implements java.io.Serializable {

	private static final long serialVersionUID = 1730839137;

	private Integer id;
	private Integer examId;
	private Integer number;

	public ExaminationTicket() {}

	public ExaminationTicket(
		Integer id,
		Integer examId,
		Integer number
	) {
		this.id = id;
		this.examId = examId;
		this.number = number;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getExamId() {
		return this.examId;
	}

	public void setExamId(Integer examId) {
		this.examId = examId;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
}
