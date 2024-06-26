package Rudiko.schoollanguages.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class RegistrationUserDto {
    private String fullName;
    private String password;
    private String confirmPassword;
    private String phoneNumber;
    private String birthday;
    private String gender;
    private String login;
    private String email;
}
