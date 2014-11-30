package com.syncteam.sync;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import android.os.Bundle;
import android.widget.Toast;


//public class MainActivity extends Activity {
	
	//@Override
	//protected void onCreate(Bundle savedInstanceState) {
	//	super.onCreate(savedInstanceState);
	//	setContentView(R.layout.activity_main);
	//}
	//public void gotoActivity(View v)
	//{
	//	Intent intent =  new Intent(this, TextSender.class);
	//	startActivity(intent);
	//}
//}

public class MainActivity extends YouTubeBaseActivity implements
YouTubePlayer.OnInitializedListener {

static private final String DEVELOPER_KEY = "AIzaSyB69s6zBWbUAnz17MRvKltRRZ5h7O3Iddg";
       static private final String VIDEO = "4SK0cUNMnMM";
       @Override
       protected void onCreate(Bundle savedInstanceState) {
              super.onCreate(savedInstanceState);
              setContentView(R.layout.activity_main);
              YouTubePlayerView youTubeView = (YouTubePlayerView)
findViewById(R.id.youtube_view);
           youTubeView.initialize(DEVELOPER_KEY, this);
          }
         @Override
         public void onInitializationFailure(Provider provider,
YouTubeInitializationResult error) {
                Toast.makeText(this, "Oh no! "+error.toString(),
Toast.LENGTH_LONG).show();
       }
       @Override
       public void onInitializationSuccess(Provider provider, YouTubePlayer player,
boolean wasRestored) {
              player.loadVideo(VIDEO);
       }
}

