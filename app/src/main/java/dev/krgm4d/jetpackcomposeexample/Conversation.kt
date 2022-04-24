package dev.krgm4d.jetpackcomposeexample

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.krgm4d.jetpackcomposeexample.ui.theme.JetpackComposeExampleTheme

@Composable
fun Conversation(messages: List<Message>) {
    LazyColumn {
        items(messages) { message ->
            MessageCard(msg = message)
        }
    }
}

@Preview
@Composable
fun PreviewConversation() {
    JetpackComposeExampleTheme {
        Conversation(messages = SampleData.conversationSample)
    }
}