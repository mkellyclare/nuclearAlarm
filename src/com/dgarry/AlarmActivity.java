package com.dgarry;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Debug;
import android.speech.tts.TextToSpeech;
import android.view.View;


public class AlarmActivity extends Activity implements TextToSpeech.OnInitListener {
    private TextToSpeech textToSpeech;

    public void onCreate(Bundle savedInstanceState) {
//        Debug.waitForDebugger();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarm);
        textToSpeech = new TextToSpeech(this, this);
    }

    public void handleSpeak(View view) {
        saySomething();
    }

    private void saySomething() {
        String myText1 = "Did you sleep well?";
        String myText2 = "I hope so, because your stupid Don, ha ha ha ha ha ha";
        textToSpeech.speak(myText1, TextToSpeech.QUEUE_FLUSH, null);
        textToSpeech.speak(myText2, TextToSpeech.QUEUE_ADD, null);
    }

    public void onInit(int i) {
        saySomething();
    }
}