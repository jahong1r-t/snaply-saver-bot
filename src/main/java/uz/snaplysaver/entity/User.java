package uz.snaplysaver.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private String telegram_id;
    private String name;
    private String username;
    private String phoneNumber;
}
