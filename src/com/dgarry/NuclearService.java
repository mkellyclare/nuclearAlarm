package com.dgarry;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;
import com.dgarry.utils.ThreadUtils;

public class NuclearService extends IntentService {

    public NuclearService() {
        super("NuclearService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        for (int i = 0; i < 20; i++) {
            System.out.println("counter = " + i);
            ThreadUtils.sleep(1000);
        }

    }
}
