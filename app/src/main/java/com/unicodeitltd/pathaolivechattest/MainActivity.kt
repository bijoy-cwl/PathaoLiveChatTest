package com.unicodeitltd.pathaolivechattest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.idesk360.idesklivechatlib.IdeskLiveChat
import com.idesk360.idesklivechatlib.model.IdeskChatSDKConfig

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startLiveChat(view: View) {
        val sdkConfig = IdeskChatSDKConfig(
            resourceUri = "toolstatic.idesk360.com",//required
            appUri = "tool.idesk360.com",//required
            pageId = "1694592792000",//required
            miscellaneous = mapOf("float" to 0),//optional,
            customerInfo = mapOf("name" to "kamal", "rmn" to "019667653443")//optional
        )

        IdeskLiveChat(sdkConfig, this).OpenChatWindow()
    }
}