package com.syncteam.sync;

//import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
//import android.location.LocationManager;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Toast;

public class SimplerSMSReceiver extends BroadcastReceiver {

//private LocationManager hdLocMgr;
//private String hdLocProvider;

@Override
public void onReceive(Context context, Intent intent) {
    // TODO Auto-generated method stub

    //Intent m=new Intent(context, ReceivelocationActivity.class);    
      //PendingIntent pi=PendingIntent.getBroadcast(context, 0, m, 0); 
    Bundle bundle = intent.getExtras();        
    SmsMessage[] msgs = null;
    String str = ""; 
    String str2="";
    String str3="";
    String autoReplyToken = "Request_Accepted";
    if (bundle != null)
    {
        //---retrieve the SMS message received---
        Object[] pdus = (Object[]) bundle.get("pdus");
        msgs = new SmsMessage[pdus.length];            
        for (int i=0; i<msgs.length; i++){
            msgs[i] = SmsMessage.createFromPdu((byte[])pdus[i]);                
            str += "SMS from " + msgs[i].getOriginatingAddress();                     
            str2=msgs[i].getOriginatingAddress();
            str += " :";
            str += msgs[i].getMessageBody().toString();
         str3=msgs[i].getMessageBody().toString();
            str += "\n";        
        }
        //---display the new SMS message---
        Toast.makeText(context, str, Toast.LENGTH_SHORT).show();}
    }
}
    