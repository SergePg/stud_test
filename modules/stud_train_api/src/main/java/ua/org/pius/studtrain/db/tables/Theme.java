/**
 * This class is generated by jOOQ
 */
package ua.org.pius.studtrain.db.tables;

import ua.org.pius.studtrain.db.Keys;
import ua.org.pius.studtrain.db.Public;
import ua.org.pius.studtrain.db.tables.records.ThemeRecord;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.5" },
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Theme extends org.jooq.impl.TableImpl<ThemeRecord> {

	private static final long serialVersionUID = 1466521895;

	/**
	 * The singleton instance of <code>public.theme</code>
	 */
	public static final Theme THEME = new Theme();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ThemeRecord> getRecordType() {
		return ThemeRecord.class;
	}

	/**
	 * The column <code>public.theme.id</code>.
	 */
	public final org.jooq.TableField<ThemeRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.theme.parent</code>.
	 */
	public final org.jooq.TableField<ThemeRecord, Integer> PARENT = createField("parent", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>public.theme.name</code>.
	 */
	public final org.jooq.TableField<ThemeRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(55).nullable(false), this, "");

	/**
	 * The column <code>public.theme.creator_name</code>.
	 */
	public final org.jooq.TableField<ThemeRecord, String> CREATOR_NAME = createField("creator_name", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

	/**
	 * The column <code>public.theme.rgt</code>.
	 */
	public final org.jooq.TableField<ThemeRecord, Integer> RGT = createField("rgt", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.theme.lft</code>.
	 */
	public final org.jooq.TableField<ThemeRecord, Integer> LFT = createField("lft", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>public.theme</code> table reference
	 */
	public Theme() {
		this("theme", null);
	}

	/**
	 * Create an aliased <code>public.theme</code> table reference
	 */
	public Theme(String alias) {
		this(alias, Theme.THEME);
	}

	private Theme(String alias, org.jooq.Table<ThemeRecord> aliased) {
		this(alias, aliased, null);
	}

	private Theme(String alias, org.jooq.Table<ThemeRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<ThemeRecord> getPrimaryKey() {
		return Keys.PK_THEME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<ThemeRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<ThemeRecord>>asList(Keys.PK_THEME);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<ThemeRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<ThemeRecord, ?>>asList(Keys.THEME__FK_THEME_THEME, Keys.THEME__FK_THEME_USER);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Theme as(String alias) {
		return new Theme(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Theme rename(String name) {
		return new Theme(name, null);
	}
}
