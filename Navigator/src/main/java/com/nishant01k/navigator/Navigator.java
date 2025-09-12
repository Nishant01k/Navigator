package com.nishant01k.navigator;

import android.app.Activity;
import android.content.Intent;

public class Navigator {

    // Simple navigation
    public static void goTo(Activity current, Class<?> destination) {
        Intent intent = new Intent(current, destination);
        current.startActivity(intent);
    }

    // Navigation with finish option
    public static void goTo(Activity current, Class<?> destination, boolean finishCurrent) {
        Intent intent = new Intent(current, destination);
        current.startActivity(intent);
        if (finishCurrent) {
            current.finish();
        }
    }
}
