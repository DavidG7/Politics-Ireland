package ireland.politics.root.politics

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import hugo.weaving.DebugLog
import android.os.SystemClock
import hugo.weaving.internal.Hugo


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
        SystemClock.sleep(15) // Don't ever really do this!
        return first + " " + last
    }
}