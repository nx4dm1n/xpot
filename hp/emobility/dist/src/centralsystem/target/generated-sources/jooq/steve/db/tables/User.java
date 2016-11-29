/**
 * This class is generated by jOOQ
 */
package jooq.steve.db.tables;


import de.rwth.idsg.steve.utils.DateTimeConverter;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.steve.db.Keys;
import jooq.steve.db.Stevedb;
import jooq.steve.db.tables.records.UserRecord;

import org.joda.time.DateTime;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class User extends TableImpl<UserRecord> {

	private static final long serialVersionUID = -122382790;

	/**
	 * The reference instance of <code>stevedb.user</code>
	 */
	public static final User USER = new User();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<UserRecord> getRecordType() {
		return UserRecord.class;
	}

	/**
	 * The column <code>stevedb.user.idTag</code>.
	 */
	public final TableField<UserRecord, String> IDTAG = createField("idTag", org.jooq.impl.SQLDataType.VARCHAR.length(15).nullable(false), this, "");

	/**
	 * The column <code>stevedb.user.parentIdTag</code>.
	 */
	public final TableField<UserRecord, String> PARENTIDTAG = createField("parentIdTag", org.jooq.impl.SQLDataType.VARCHAR.length(15), this, "");

	/**
	 * The column <code>stevedb.user.expiryDate</code>.
	 */
	public final TableField<UserRecord, DateTime> EXPIRYDATE = createField("expiryDate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateTimeConverter());

	/**
	 * The column <code>stevedb.user.inTransaction</code>.
	 */
	public final TableField<UserRecord, Boolean> INTRANSACTION = createField("inTransaction", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>stevedb.user.blocked</code>.
	 */
	public final TableField<UserRecord, Boolean> BLOCKED = createField("blocked", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>stevedb.user.note</code>.
	 */
	public final TableField<UserRecord, String> NOTE = createField("note", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * Create a <code>stevedb.user</code> table reference
	 */
	public User() {
		this("user", null);
	}

	/**
	 * Create an aliased <code>stevedb.user</code> table reference
	 */
	public User(String alias) {
		this(alias, USER);
	}

	private User(String alias, Table<UserRecord> aliased) {
		this(alias, aliased, null);
	}

	private User(String alias, Table<UserRecord> aliased, Field<?>[] parameters) {
		super(alias, Stevedb.STEVEDB, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<UserRecord> getPrimaryKey() {
		return Keys.KEY_USER_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<UserRecord>> getKeys() {
		return Arrays.<UniqueKey<UserRecord>>asList(Keys.KEY_USER_PRIMARY, Keys.KEY_USER_IDTAG_UNIQUE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<UserRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<UserRecord, ?>>asList(Keys.FK_USER_PARENTIDTAG);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public User as(String alias) {
		return new User(alias, this);
	}

	/**
	 * Rename this table
	 */
	public User rename(String name) {
		return new User(name, null);
	}
}
