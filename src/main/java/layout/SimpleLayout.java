package layout;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.LayoutBase;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class SimpleLayout extends LayoutBase<ILoggingEvent> {

    public String doLayout(ILoggingEvent event) {
        Instant instant = Instant.ofEpochMilli(event.getTimeStamp());
        LocalDateTime dateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        StringBuffer sbuf = new StringBuffer(128);
        sbuf.append(dateTime);
        sbuf.append(" ");
        sbuf.append(event.getLevel());
        sbuf.append(" [");
        sbuf.append(event.getThreadName());
        sbuf.append("] ");
        sbuf.append(event.getLoggerName());
        sbuf.append(" - ");
        sbuf.append(event.getFormattedMessage());
        sbuf.append("\n");
        return sbuf.toString();
    }
}
