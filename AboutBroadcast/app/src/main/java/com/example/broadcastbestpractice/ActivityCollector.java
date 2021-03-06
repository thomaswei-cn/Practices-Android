package com.example.broadcastbestpractice;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

public class ActivityCollector {
    private static List<Activity> activities = new ArrayList<Activity>();

    public static void addActivity(Activity activity) {
        activities.add(activity);
    }

    public static void removeActivity(Activity activity) {
        activities.remove(activity);
    }

    public static void finishALL() {
        for (Activity e : activities) {
            if (!e.isFinishing()) {
                e.finish();
            }
        }
        activities.clear();
    }
}
