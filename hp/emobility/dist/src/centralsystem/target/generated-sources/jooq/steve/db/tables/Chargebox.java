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
import jooq.steve.db.tables.records.ChargeboxRecord;

import org.joda.time.DateTime;
import org.jooq.Field;
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
public class Chargebox extends TableImpl<ChargeboxRecord> {

	private static final long serialVersionUID = 1735156036;

	/**
	 * The reference instance of <code>stevedb.chargebox</code>
	 */
	public static final Chargebox CHARGEBOX = new Chargebox();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ChargeboxRecord> getRecordType() {
		return ChargeboxRecord.class;
	}

	/**
	 * The column <code>stevedb.chargebox.chargeBoxId</code>.
	 */
	public final TableField<ChargeboxRecord, String> CHARGEBOXID = createField("chargeBoxId", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

	/**
	 * The column <code>stevedb.chargebox.endpoint_address</code>.
	 */
	public final TableField<ChargeboxRecord, String> ENDPOINT_ADDRESS = createField("endpoint_address", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

	/**
	 * The column <code>stevedb.chargebox.ocppProtocol</code>.
	 */
	public final TableField<ChargeboxRecord, String> OCPPPROTOCOL = createField("ocppProtocol", org.jooq.impl.SQLDataType.VARCHAR.length(10), this, "");

	/**
	 * The column <code>stevedb.chargebox.chargePointVendor</code>.
	 */
	public final TableField<ChargeboxRecord, String> CHARGEPOINTVENDOR = createField("chargePointVendor", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

	/**
	 * The column <code>stevedb.chargebox.chargePointModel</code>.
	 */
	public final TableField<ChargeboxRecord, String> CHARGEPOINTMODEL = createField("chargePointModel", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

	/**
	 * The column <code>stevedb.chargebox.chargePointSerialNumber</code>.
	 */
	public final TableField<ChargeboxRecord, String> CHARGEPOINTSERIALNUMBER = createField("chargePointSerialNumber", org.jooq.impl.SQLDataType.VARCHAR.length(25), this, "");

	/**
	 * The column <code>stevedb.chargebox.chargeBoxSerialNumber</code>.
	 */
	public final TableField<ChargeboxRecord, String> CHARGEBOXSERIALNUMBER = createField("chargeBoxSerialNumber", org.jooq.impl.SQLDataType.VARCHAR.length(25), this, "");

	/**
	 * The column <code>stevedb.chargebox.fwVersion</code>.
	 */
	public final TableField<ChargeboxRecord, String> FWVERSION = createField("fwVersion", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

	/**
	 * The column <code>stevedb.chargebox.fwUpdateStatus</code>.
	 */
	public final TableField<ChargeboxRecord, String> FWUPDATESTATUS = createField("fwUpdateStatus", org.jooq.impl.SQLDataType.VARCHAR.length(25), this, "");

	/**
	 * The column <code>stevedb.chargebox.fwUpdateTimestamp</code>.
	 */
	public final TableField<ChargeboxRecord, DateTime> FWUPDATETIMESTAMP = createField("fwUpdateTimestamp", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateTimeConverter());

	/**
	 * The column <code>stevedb.chargebox.iccid</code>.
	 */
	public final TableField<ChargeboxRecord, String> ICCID = createField("iccid", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

	/**
	 * The column <code>stevedb.chargebox.imsi</code>.
	 */
	public final TableField<ChargeboxRecord, String> IMSI = createField("imsi", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

	/**
	 * The column <code>stevedb.chargebox.meterType</code>.
	 */
	public final TableField<ChargeboxRecord, String> METERTYPE = createField("meterType", org.jooq.impl.SQLDataType.VARCHAR.length(25), this, "");

	/**
	 * The column <code>stevedb.chargebox.meterSerialNumber</code>.
	 */
	public final TableField<ChargeboxRecord, String> METERSERIALNUMBER = createField("meterSerialNumber", org.jooq.impl.SQLDataType.VARCHAR.length(25), this, "");

	/**
	 * The column <code>stevedb.chargebox.diagnosticsStatus</code>.
	 */
	public final TableField<ChargeboxRecord, String> DIAGNOSTICSSTATUS = createField("diagnosticsStatus", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

	/**
	 * The column <code>stevedb.chargebox.diagnosticsTimestamp</code>.
	 */
	public final TableField<ChargeboxRecord, DateTime> DIAGNOSTICSTIMESTAMP = createField("diagnosticsTimestamp", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateTimeConverter());

	/**
	 * The column <code>stevedb.chargebox.lastHeartbeatTimestamp</code>.
	 */
	public final TableField<ChargeboxRecord, DateTime> LASTHEARTBEATTIMESTAMP = createField("lastHeartbeatTimestamp", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateTimeConverter());

	/**
	 * The column <code>stevedb.chargebox.note</code>.
	 */
	public final TableField<ChargeboxRecord, String> NOTE = createField("note", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * Create a <code>stevedb.chargebox</code> table reference
	 */
	public Chargebox() {
		this("chargebox", null);
	}

	/**
	 * Create an aliased <code>stevedb.chargebox</code> table reference
	 */
	public Chargebox(String alias) {
		this(alias, CHARGEBOX);
	}

	private Chargebox(String alias, Table<ChargeboxRecord> aliased) {
		this(alias, aliased, null);
	}

	private Chargebox(String alias, Table<ChargeboxRecord> aliased, Field<?>[] parameters) {
		super(alias, Stevedb.STEVEDB, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<ChargeboxRecord> getPrimaryKey() {
		return Keys.KEY_CHARGEBOX_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<ChargeboxRecord>> getKeys() {
		return Arrays.<UniqueKey<ChargeboxRecord>>asList(Keys.KEY_CHARGEBOX_PRIMARY, Keys.KEY_CHARGEBOX_CHARGEBOXID_UNIQUE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Chargebox as(String alias) {
		return new Chargebox(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Chargebox rename(String name) {
		return new Chargebox(name, null);
	}
}
