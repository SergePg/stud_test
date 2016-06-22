/**
 * This class is generated by jOOQ
 */
package ua.org.pius.studtrain.db.tables.records;

import ua.org.pius.studtrain.db.tables.Roles;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.5" },
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RolesRecord extends org.jooq.impl.UpdatableRecordImpl<RolesRecord> implements org.jooq.Record3<String, java.sql.Timestamp, String> {

	private static final long serialVersionUID = -1572756947;

	/**
	 * Setter for <code>public.roles.rolename</code>.
	 */
	public void setRolename(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.roles.rolename</code>.
	 */
	public String getRolename() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>public.roles.created_at</code>.
	 */
	public void setCreatedAt(java.sql.Timestamp value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.roles.created_at</code>.
	 */
	public java.sql.Timestamp getCreatedAt() {
		return (java.sql.Timestamp) getValue(1);
	}

	/**
	 * Setter for <code>public.roles.printname</code>.
	 */
	public void setPrintname(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.roles.printname</code>.
	 */
	public String getPrintname() {
		return (String) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<String> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<String, java.sql.Timestamp, String> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<String, java.sql.Timestamp, String> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<String> field1() {
		return Roles.ROLES.ROLENAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field2() {
		return Roles.ROLES.CREATED_AT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<String> field3() {
		return Roles.ROLES.PRINTNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getRolename();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value2() {
		return getCreatedAt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getPrintname();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RolesRecord value1(String value) {
		setRolename(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RolesRecord value2(java.sql.Timestamp value) {
		setCreatedAt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RolesRecord value3(String value) {
		setPrintname(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RolesRecord values(String value1, java.sql.Timestamp value2, String value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached RolesRecord
	 */
	public RolesRecord() {
		super(Roles.ROLES);
	}

	/**
	 * Create a detached, initialised RolesRecord
	 */
	public RolesRecord(String rolename, java.sql.Timestamp createdAt, String printname) {
		super(Roles.ROLES);

		setValue(0, rolename);
		setValue(1, createdAt);
		setValue(2, printname);
	}
}
