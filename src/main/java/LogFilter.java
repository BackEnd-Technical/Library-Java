import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.FilterReply;

public class LogFilter extends Filter<ILoggingEvent> {
    @Override
    public FilterReply decide(ILoggingEvent iLoggingEvent) {
        if (iLoggingEvent.getMessage().contains("Main")) {
            return FilterReply.ACCEPT;
        }
        return FilterReply.DENY;
    }
}
