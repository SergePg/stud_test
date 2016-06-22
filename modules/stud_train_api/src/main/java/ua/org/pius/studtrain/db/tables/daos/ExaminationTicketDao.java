/**
 * This class is generated by jOOQ
 */
package ua.org.pius.studtrain.db.tables.daos;

import ua.org.pius.studtrain.db.tables.ExaminationTicket;
import ua.org.pius.studtrain.db.tables.records.ExaminationTicketRecord;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.5" },
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ExaminationTicketDao extends org.jooq.impl.DAOImpl<ExaminationTicketRecord, ua.org.pius.studtrain.db.tables.pojos.ExaminationTicket, Integer> {

	/**
	 * Create a new ExaminationTicketDao without any configuration
	 */
	public ExaminationTicketDao() {
		super(ExaminationTicket.EXAMINATION_TICKET, ua.org.pius.studtrain.db.tables.pojos.ExaminationTicket.class);
	}

	/**
	 * Create a new ExaminationTicketDao with an attached configuration
	 */
	public ExaminationTicketDao(org.jooq.Configuration configuration) {
		super(ExaminationTicket.EXAMINATION_TICKET, ua.org.pius.studtrain.db.tables.pojos.ExaminationTicket.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Integer getId(ua.org.pius.studtrain.db.tables.pojos.ExaminationTicket object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<ua.org.pius.studtrain.db.tables.pojos.ExaminationTicket> fetchById(Integer... values) {
		return fetch(ExaminationTicket.EXAMINATION_TICKET.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public ua.org.pius.studtrain.db.tables.pojos.ExaminationTicket fetchOneById(Integer value) {
		return fetchOne(ExaminationTicket.EXAMINATION_TICKET.ID, value);
	}

	/**
	 * Fetch records that have <code>exam_id IN (values)</code>
	 */
	public java.util.List<ua.org.pius.studtrain.db.tables.pojos.ExaminationTicket> fetchByExamId(Integer... values) {
		return fetch(ExaminationTicket.EXAMINATION_TICKET.EXAM_ID, values);
	}

	/**
	 * Fetch records that have <code>number IN (values)</code>
	 */
	public java.util.List<ua.org.pius.studtrain.db.tables.pojos.ExaminationTicket> fetchByNumber(Integer... values) {
		return fetch(ExaminationTicket.EXAMINATION_TICKET.NUMBER, values);
	}
}