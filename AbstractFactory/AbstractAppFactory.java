import java.nio.file.Files;

/**
 * AbstractAppFactory
 */
public interface AbstractAppFactory {
    Calendar createCalendar();
    Clock createClock();
    Phone createPhone();
}