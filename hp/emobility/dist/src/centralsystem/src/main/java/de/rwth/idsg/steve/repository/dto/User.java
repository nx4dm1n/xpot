package de.rwth.idsg.steve.repository.dto;

import lombok.Builder;
import lombok.Getter;

/**
 *
 * @author Sevket Goekay <goekay@dbis.rwth-aachen.de>
 *
 */
@Getter
@Builder
public final class User {
    private final String idTag, parentIdTag, expiryDate, note;
    private final boolean inTransaction, blocked;
}
