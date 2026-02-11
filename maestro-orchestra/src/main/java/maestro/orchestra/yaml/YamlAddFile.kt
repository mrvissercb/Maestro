package maestro.orchestra.yaml

import com.fasterxml.jackson.annotation.JsonCreator

data class YamlAddFile(
    val files: List<String?>? = null,
    val path: String? = null,
    val destination: String? = null,
    val label: String? = null,
    val optional: Boolean = false,
) {
    companion object {

        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(files: List<String>) = YamlAddFile(
            files = files,
        )
    }
}
