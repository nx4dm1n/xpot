/**
 * This class is generated by jOOQ
 */
package jooq.steve.db;


import javax.annotation.Generated;

import jooq.steve.db.tables.Chargebox;
import jooq.steve.db.tables.Connector;
import jooq.steve.db.tables.ConnectorMetervalue;
import jooq.steve.db.tables.ConnectorStatus;
import jooq.steve.db.tables.Reservation;
import jooq.steve.db.tables.SchemaVersion;
import jooq.steve.db.tables.Transaction;
import jooq.steve.db.tables.User;


/**
 * Convenience access to all tables in stevedb
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

	/**
	 * The table stevedb.chargebox
	 */
	public static final Chargebox CHARGEBOX = jooq.steve.db.tables.Chargebox.CHARGEBOX;

	/**
	 * The table stevedb.connector
	 */
	public static final Connector CONNECTOR = jooq.steve.db.tables.Connector.CONNECTOR;

	/**
	 * The table stevedb.connector_metervalue
	 */
	public static final ConnectorMetervalue CONNECTOR_METERVALUE = jooq.steve.db.tables.ConnectorMetervalue.CONNECTOR_METERVALUE;

	/**
	 * The table stevedb.connector_status
	 */
	public static final ConnectorStatus CONNECTOR_STATUS = jooq.steve.db.tables.ConnectorStatus.CONNECTOR_STATUS;

	/**
	 * The table stevedb.reservation
	 */
	public static final Reservation RESERVATION = jooq.steve.db.tables.Reservation.RESERVATION;

	/**
	 * The table stevedb.schema_version
	 */
	public static final SchemaVersion SCHEMA_VERSION = jooq.steve.db.tables.SchemaVersion.SCHEMA_VERSION;

	/**
	 * The table stevedb.transaction
	 */
	public static final Transaction TRANSACTION = jooq.steve.db.tables.Transaction.TRANSACTION;

	/**
	 * The table stevedb.user
	 */
	public static final User USER = jooq.steve.db.tables.User.USER;
}