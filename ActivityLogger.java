import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ActivityLogger {
  private static ActivityLogger instance;
  private final ArrayList<String> activityLogs = new ArrayList<String>();

  private ActivityLogger(){};

  public static ActivityLogger getInstance() {
    if(instance == null) {
      instance = new ActivityLogger();
    }
    return instance;
  }

  /**
   * Create a log for the activity and add it to the activity logs
   * @param message Short description of the activity
   */
  public void logActivity(String message) {
    // Formats the current date and time before adding it to the activity's message to create the log
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy (HH:mm)");
    String logTime = LocalDateTime.now().format(dateFormat);

    String log = String.format("%s %s", logTime, message);
    activityLogs.add(log);
  }

  public ArrayList<String> getActivityLog() {
    return activityLogs;
  }
}