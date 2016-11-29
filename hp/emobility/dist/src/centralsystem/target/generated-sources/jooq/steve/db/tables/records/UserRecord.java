/**
 * This class is generated by jOOQ
 */
package jooq.steve.db.tables.records;


import javax.annotation.Generated;

import jooq.steve.db.tables.User;

import org.joda.time.DateTime;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


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
public class UserRecord extends UpdatableRecordImpl<UserRecord> implements Record6<String, String, DateTime, Boolean, Boolean, String> {

	private static final long serialVersionUID = 399584617;

	/**
	 * Setter for <code>stevedb.user.idTag</code>.
	 */
	public void setIdtag(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>stevedb.user.idTag</code>.
	 */
	public String getIdtag() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>stevedb.user.parentIdTag</code>.
	 */
	public void setParentidtag(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>stevedb.user.parentIdTag</code>.
	 */
	public String getParentidtag() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>stevedb.user.expiryDate</code>.
	 */
	public void setExpirydate(DateTime value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>stevedb.user.expiryDate</code>.
	 */
	public DateTime getExpirydate() {
		return (DateTime) getValue(2);
	}

	/**
	 * Setter for <code>stevedb.user.inTransaction</code>.
	 */
	public void setIntransaction(Boolean value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>stevedb.user.inTransaction</code>.
	 */
	public Boolean getIntransaction() {
		return (Boolean) getValue(3);
	}

	/**
	 * Setter for <code>stevedb.user.blocked</code>.
	 */
	public void setBlocked(Boolean value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>stevedb.user.blocked</code>.
	 */
	public Boolean getBlocked() {
		return (Boolean) getValue(4);
	}

	/**
	 * Setter for <code>stevedb.user.note</code>.
	 */
	public void setNote(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>stevedb.user.note</code>.
	 */
	public String getNote() {
		return (String) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<String> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<String, String, DateTime, Boolean, Boolean, String> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<String, String, DateTime, Boolean, Boolean, String> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return User.USER.IDTAG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return User.USER.PARENTIDTAG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<DateTime> field3() {
		return User.USER.EXPIRYDATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field4() {
		return User.USER.INTRANSACTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field5() {
		return User.USER.BLOCKED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return User.USER.NOTE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getIdtag();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getParentidtag();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DateTime value3() {
		return getExpirydate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value4() {
		return getIntransaction();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value5() {
		return getBlocked();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getNote();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord value1(String value) {
		setIdtag(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord value2(String value) {
		setParentidtag(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord value3(DateTime value) {
		setExpirydate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord value4(Boolean value) {
		setIntransaction(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord value5(Boolean value) {
		setBlocked(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord value6(String value) {
		setNote(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord values(String value1, String value2, DateTime value3, Boolean value4, Boolean value5, String value6) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached UserRecord
	 */
	public UserRecord() {
		super(User.USER);
	}

	/**
	 * Create a detached, initialised UserRecord
	 */
	public UserRecord(String idtag, String parentidtag, DateTime expirydate, Boolean intransaction, Boolean blocked, String note) {
		super(User.USER);

		setValue(0, idtag);
		setValue(1, parentidtag);
		setValue(2, expirydate);
		setValue(3, intransaction);
		setValue(4, blocked);
		setValue(5, note);
	}
}
