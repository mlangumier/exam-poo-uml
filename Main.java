import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    //--- 
    ActivityLogger.getInstance().logActivity("Creating first log");
    ActivityLogger.getInstance().logActivity("Doing something else");


    //--- Display logs

    System.out.println("----- LOGS -----");

    ArrayList<String> logs = ActivityLogger.getInstance().getActivityLog();

    for(String log: logs) {
      System.out.println(log);
    }
  }
}
