package com.rackspira.kal.broadcastalarmsample;

import java.util.List;

/**
 * Created by kristiawan on 12/17/16.
 */

public class GlobalReminder {
    private static List<Reminder> REMINDERS;

    public static List<Reminder> getREMINDERS() {
        return REMINDERS;
    }

    public static void setREMINDERS(List<Reminder> REMINDERS) {
        GlobalReminder.REMINDERS = REMINDERS;
    }
}
