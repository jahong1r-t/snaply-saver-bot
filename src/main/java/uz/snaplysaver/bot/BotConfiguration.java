package uz.snaplysaver.bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import uz.snaplysaver.service.AdminService;
import uz.snaplysaver.service.UserService;

public class BotConfiguration extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() || update.hasCallbackQuery()) {
            Message message = update.getMessage();
            Long chatId = message.getChatId();
            if (chatId == 5699941692L) {
                new AdminService().service(message);
            } else {
                new UserService().service(message);
            }
        }
    }


    @Override
    public String getBotUsername() {
        return "";
    }

    @Override
    public String getBotToken() {
        return "";
    }
}
