package cloud.viyana.xylomusic;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private final int  NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float  LEFT_VOLUME = 1.0f;
    private final float  RIGHT_VOLUME = 1.0f;
    private final int  NO_LOOP = 0;
    private final int  PRIORITY = 0;
    private final float  NORMAL_PLAY_RATE = 1.0f;

    private SoundPool mSoundPool;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC, 0);
        mCSoundId = mSoundPool.load(getApplicationContext(), R.raw.note1_c, 1);
        mCSoundId = mSoundPool.load(getApplicationContext(), R.raw.note2_d, 1);
        mCSoundId = mSoundPool.load(getApplicationContext(), R.raw.note3_e, 1);
        mCSoundId = mSoundPool.load(getApplicationContext(), R.raw.note4_f, 1);
        mCSoundId = mSoundPool.load(getApplicationContext(), R.raw.note5_g, 1);
        mCSoundId = mSoundPool.load(getApplicationContext(), R.raw.note6_a, 1);
        mCSoundId = mSoundPool.load(getApplicationContext(), R.raw.note7_b, 1);
    }

    private void playC(View v){
        mSoundPool.play(mCSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);

    }

    private void playD(View v){
        mSoundPool.play(mDSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);

    }

    private void playE(View v){
        mSoundPool.play(mESoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    private void playF(View v){
        mSoundPool.play(mFSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    private void playG(View v){
        mSoundPool.play(mGSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    private void playA(View v){
        mSoundPool.play(mASoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    private void playB(View v){
        mSoundPool.play(mBSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }



}
