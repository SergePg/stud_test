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
public class RolePrivs implements java.io.Serializable {

	private static final long serialVersionUID = -66544388;

	private String rolename;
	private String privilegeId;

	public RolePrivs() {}

	public RolePrivs(
		String rolename,
		String privilegeId
	) {
		this.rolename = rolename;
		this.privilegeId = privilegeId;
	}

	public String getRolename() {
		return this.rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public String getPrivilegeId() {
		return this.privilegeId;
	}

	public void setPrivilegeId(String privilegeId) {
		this.privilegeId = privilegeId;
	}
}
