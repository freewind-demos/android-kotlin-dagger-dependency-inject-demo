package demos

import dagger.Component
import javax.inject.Inject

@Component
interface CoreComponent {
    fun inject(activity: MainActivity);
}

class Core @Inject constructor() {
    @Inject
    lateinit var util: Util
    fun hello(name: String) = "Hello, ${util.toUpper(name)}!"
}

class Util @Inject constructor() {
    fun toUpper(s: String) = s.uppercase();
}