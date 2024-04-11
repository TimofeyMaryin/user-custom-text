package custom.lib.another

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import custom.lib.another.ui.theme.FirstCloLibTheme
import custom.lib.user_custom_text.StatusSizeText
import custom.lib.user_custom_text.UserApplicationTextContainer
import custom.lib.user_custom_text.user_text.ExtraLargeText
import custom.lib.user_custom_text.user_text.LargeText
import custom.lib.user_custom_text.user_text.PrimaryText
import custom.lib.user_custom_text.user_text.SecondaryText
import custom.lib.user_custom_text.user_text.SmallText

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstCloLibTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                    ) {
                        Text(text = "Hello World")
                        UserApplicationTextContainer(
                            value = "User Applicatin Text Container",
                            statusSizeText = StatusSizeText.LARGE
                        )
                        SmallText(value = "Small Text")
                        SecondaryText(value = "Secondary Text")
                        PrimaryText(value = "Primary Text")
                        LargeText(value = "Large Text")
                        ExtraLargeText(value = "Extra Large Text")
                    }
                }
            }
        }
    }
}

@Composable
fun A() {
    Text(text = "x")
}

