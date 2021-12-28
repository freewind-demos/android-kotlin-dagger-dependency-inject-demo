package demos

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var core: Core;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerCoreComponent.builder().build().inject(this)
        val textView = findViewById<TextView>(R.id.text);
        textView.text = core.hello("dagger");
    }

}
