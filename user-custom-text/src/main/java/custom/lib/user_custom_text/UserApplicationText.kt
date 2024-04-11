package custom.lib.user_custom_text

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight


@Composable
fun UserApplicationTextContainer(
    value: String,
    statusSizeText: StatusSizeText,
    statusWeightText: StatusWeightText = StatusWeightText.NORMAL,
    color: Color = Color.Unspecified,
    modifier: Modifier = Modifier,
    fontFamily: FontFamily? = null,
) {

    Text(
        text = value,
        modifier = modifier,
        color = color,
        fontWeight = when (statusWeightText) {
            StatusWeightText.LIGHT -> FontWeight.Light
            StatusWeightText.NORMAL -> FontWeight.Normal
            StatusWeightText.SEMI_BOLD -> FontWeight.SemiBold
            StatusWeightText.BOLD -> FontWeight.Bold
        },
        fontFamily = fontFamily,
        style = when (statusSizeText) {
            StatusSizeText.SMALL -> MaterialTheme.typography.labelMedium
            StatusSizeText.SECONDARY -> MaterialTheme.typography.titleSmall
            StatusSizeText.PRIMARY -> MaterialTheme.typography.titleMedium
            StatusSizeText.LARGE -> MaterialTheme.typography.titleLarge
            StatusSizeText.EXTRA_LARGE -> MaterialTheme.typography.displaySmall
        }
    )

}

enum class StatusSizeText {
    SMALL, SECONDARY, PRIMARY, LARGE, EXTRA_LARGE
}

enum class  StatusWeightText {
    LIGHT, NORMAL, SEMI_BOLD, BOLD
}


