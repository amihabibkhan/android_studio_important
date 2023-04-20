Chronometer counter = (Chronometer) findViewById(R.id.counter);

public void startTimer(){
    counter.setBase(SystemClock.elapsedRealtime());
    counter.start();
}

public void stopTimer(){
    counter.stop();
}

//https://www.youtube.com/watch?v=LzfaWf7_iHw
