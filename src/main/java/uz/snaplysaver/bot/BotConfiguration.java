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

    private void sendMsg(Long chatId, String text) {
        SendMessage build = SendMessage.builder().chatId(chatId).text(text).build();
        try {
            execute(build);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public String getBotUsername() {
        return "snaply_saver_bot";
    }

    @Override
    public String getBotToken() {
        return "7090751376:AAGmKN7eRwi7GxCesv-c0MlB8cMtG82B_BY";
    }
}
