package demos

import dagger.Component
import javax.inject.Inject

@Component
interface CoreComponent {
    fun inject(core: Core);
}

class Core {
    @Inject
    lateinit var util: Util
    fun hello(name: String) {
        println("Hello, ${util.toUpper(name)}!")
    }
}

class Util @Inject constructor() {
    fun toUpper(s: String) = s.uppercase();
}