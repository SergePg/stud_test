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
public class Question implements java.io.Serializable {

	private static final long serialVersionUID = -1892280968;

	private Integer id;
	private String  text;
	private Integer ball;
	private Integer questionTypeId;
	private Integer themeId;

	public Question() {}

	public Question(
		Integer id,
		String  text,
		Integer ball,
		Integer questionTypeId,
		Integer themeId
	) {
		this.id = id;
		this.text = text;
		this.ball = ball;
		this.questionTypeId = questionTypeId;
		this.themeId = themeId;
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

	public Integer getQuestionTypeId() {
		return this.questionTypeId;
	}

	public void setQuestionTypeId(Integer questionTypeId) {
		this.questionTypeId = questionTypeId;
	}

	public Integer getThemeId() {
		return this.themeId;
	}

	public void setThemeId(Integer themeId) {
		this.themeId = themeId;
	}
}
