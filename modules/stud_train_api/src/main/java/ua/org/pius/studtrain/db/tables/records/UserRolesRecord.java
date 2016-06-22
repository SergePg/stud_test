/**
 * This class is generated by jOOQ
 */
package ua.org.pius.studtrain.db.tables.records;

import ua.org.pius.studtrain.db.tables.UserRoles;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.5" },
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserRolesRecord extends org.jooq.impl.UpdatableRecordImpl<UserRolesRecord> implements org.jooq.Record2<String, String> {

	private static final long serialVersionUID = 535209878;

	/**
	 * Setter for <code>public.user_roles.username</code>.
	 */
	public void setUsername(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.user_roles.username</code>.
	 */
	public String getUsername() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>public.user_roles.rolename</code>.
	 */
	public void setRolename(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.user_roles.rolename</code>.
	 */
	public String getRolename() {
		return (String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record2<String, String> key() {
		return (org.jooq.Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<String, String> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<String, String> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<String> field1() {
		return UserRoles.USER_ROLES.USERNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<String> field2() {
		return UserRoles.USER_ROLES.ROLENAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getUsername();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getRolename();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRolesRecord value1(String value) {
		setUsername(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRolesRecord value2(String value) {
		setRolename(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRolesRecord values(String value1, String value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached UserRolesRecord
	 */
	public UserRolesRecord() {
		super(UserRoles.USER_ROLES);
	}

	/**
	 * Create a detached, initialised UserRolesRecord
	 */
	public UserRolesRecord(String username, String rolename) {
		super(UserRoles.USER_ROLES);

		setValue(0, username);
		setValue(1, rolename);
	}
}
