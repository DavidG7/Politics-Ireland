package ireland.politics.root.politics

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import hugo.weaving.DebugLog

/**
 * Created by root on 21/01/17.
 */


class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getName("Jim","Stephens")
    }

    @DebugLog
    fun getName(first: String, last: String): String {
        return first + " " + last
    }
}