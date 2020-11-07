package com.example.drug_free;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import io.smooch.core.CardSummary;
import io.smooch.core.Conversation;
import io.smooch.core.ConversationDelegate;
import io.smooch.core.ConversationEvent;
import io.smooch.core.InitializationStatus;
import io.smooch.core.LoginResult;
import io.smooch.core.LogoutResult;
import io.smooch.core.Message;
import io.smooch.core.MessageAction;
import io.smooch.core.MessageUploadStatus;
import io.smooch.core.PaymentStatus;
import io.smooch.core.Settings;
import io.smooch.core.Smooch;
import io.smooch.core.SmoochCallback;
import io.smooch.core.SmoochConnectionStatus;

public class MainActivity extends AppCompatActivity implements ConversationDelegate {
    public String conversationText = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashbord);

        Smooch.init(getApplication(), new Settings("5fa69de9f0f418000cd90483"), new SmoochCallback() {
            @Override
            public void run(SmoochCallback.Response response) {
                Smooch.setConversationDelegate(MainActivity.this);

            }
        });
    }

    public void renderConversationHistory() {
        TextView textView = findViewById(R.id.textView);
        textView.setText(conversationText);
    }


    public void sendMessage(View view) {
        EditText editText = findViewById(R.id.editText);
        String text = editText.getText().toString();
        Log.d("MainActivity", "sendMessage: " + text);

        Smooch.getConversation().sendMessage(new Message(text));
        editText.setText("", TextView.BufferType.EDITABLE);
        conversationText += text + "\n";
        renderConversationHistory();
    }

    public void getMessages() {
        List<Message> messages;
        for (Message message : messages = Smooch.getConversation().getMessages()) {
            String text = !message.isFromCurrentUser() ? message.getName() + " says " + message.getText() : message.getText();
            conversationText += text + "\n";
        }
    }

    @Override
    public void onMessagesReceived(@NonNull Conversation conversation, @NonNull List<Message> list) {
        getMessages();
        renderConversationHistory();
    }

    @Override
    public void onMessagesReset(@NonNull Conversation conversation, @NonNull List<Message> list) {

    }

    @Override
    public void onUnreadCountChanged(@NonNull Conversation conversation, int i) {

    }

    @Override
    public void onMessageSent(@NonNull Message message, @NonNull MessageUploadStatus messageUploadStatus) {

    }

    @Override
    public void onConversationEventReceived(@NonNull ConversationEvent conversationEvent) {

    }

    @Override
    public void onInitializationStatusChanged(@NonNull InitializationStatus initializationStatus) {

            getMessages();
            renderConversationHistory();
        }


    @Override
    public void onLoginComplete(@NonNull LoginResult loginResult) {

    }

    @Override
    public void onLogoutComplete(@NonNull LogoutResult logoutResult) {

    }

    @Override
    public void onPaymentProcessed(@NonNull MessageAction messageAction, @NonNull PaymentStatus paymentStatus) {

    }

    @Override
    public boolean shouldTriggerAction(@NonNull MessageAction messageAction) {
        return true;
    }

    @Override
    public void onCardSummaryLoaded(@NonNull CardSummary cardSummary) {

    }

    @Override
    public void onSmoochConnectionStatusChanged(@NonNull SmoochConnectionStatus smoochConnectionStatus) {

    }

    @Override
    public void onSmoochShown() {

    }

    @Override
    public void onSmoochHidden() {

    }

    @Override
    public void onConversationsListUpdated(@NonNull List<Conversation> list) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}