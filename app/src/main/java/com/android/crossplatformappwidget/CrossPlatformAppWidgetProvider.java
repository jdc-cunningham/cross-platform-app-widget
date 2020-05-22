package com.android.crossplatformappwidget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.RemoteViews;

import com.android.mainactivity.R;
import com.android.mainactivity.MainActivity;

import static android.app.Activity.RESULT_OK;

// Need the following import to get access to the app resources, since this
// class is in a sub-package.

//import com.android.apis.R;

public class CrossPlatformAppWidgetProvider extends AppWidgetProvider {
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {

        final int N = appWidgetIds.length;
//
//        // Perform this loop procedure for each App Widget that belongs to this provider
        for (int i=0; i<N; i++) {
            int appWidgetId = appWidgetIds[i];
//
//            Log.i(">>>>>>>>>>>>>>>>", "bound");
//
//            // Create an Intent to launch ExampleActivity
//
            Intent intent = new Intent(context, MainActivity.class);
            PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, 0);
//////
//////            // Get the layout for the App Widget and attach an on-click listener
//////            // to the button
            RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.activity_main);
////            views.setOnClickPendingIntent(R.id.button, pendingIntent);
//////
//////            // Tell the AppWidgetManager to perform an update on the current app widget
            appWidgetManager.updateAppWidget(appWidgetId, views);
        }
    }
}