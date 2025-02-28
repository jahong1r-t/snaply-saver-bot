package uz.snaplysaver.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.snaplysaver.entity.enums.Platform;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Video {
    private String id;
    private String title;
    private String url;
    private Platform platform;
    private Boolean isSendToBase;
    private String message_id;
}
