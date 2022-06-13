import com.github.onenine.amis.InputText

class InputTextDSL : InputText() {
    fun label(lambda: () -> String) {
        this.label = lambda()
    }

    fun name(lambda: () -> String) {
        this.name = lambda()
    }
}

inline fun inputText(lambda: InputTextDSL.() -> Unit): InputText {
    val input = InputTextDSL()
    input.lambda()
    return input
}
