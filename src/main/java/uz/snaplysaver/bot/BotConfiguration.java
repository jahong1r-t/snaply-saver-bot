package uz.snaplysaver.bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class BotConfiguration extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {
    }


    @Override
    public String getBotUsername() {
        return "";
    }
}
