package custom.lib.user_custom_text.user_text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import custom.lib.user_custom_text.StatusSizeText
import custom.lib.user_custom_text.StatusWeightText
import custom.lib.user_custom_text.UserApplicationTextContainer

@Composable
fun PrimaryText(
    value: String,
    statusWeightText: StatusWeightText = StatusWeightText.NORMAL,
    color: Color = Color.Unspecified,
    modifier: Modifier = Modifier,
    fontFamily: FontFamily? = null,
) {
    UserApplicationTextContainer(
        value = value,
        modifier = modifier,
        color = color,
        statusSizeText = StatusSizeText.PRIMARY,
        statusWeightText = statusWeightText,
        fontFamily = fontFamily
    )
}