package de.rwth.idsg.steve.repository.dto;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.joda.time.DateTime;

/**
 * @author Sevket Goekay <goekay@dbis.rwth-aachen.de>
 * @since 29.12.2014
 */
@Getter
@EqualsAndHashCode
@Builder
public final class TaskOverview implements Comparable<TaskOverview> {
    private final int taskId, responseCount, requestCount;
    private final DateTime start, end;

    /**
     * We want the tasks to be printed in descending order.
     */
    @Override
    public int compareTo(TaskOverview o) {
        return (o.taskId - this.taskId);
    }
}
