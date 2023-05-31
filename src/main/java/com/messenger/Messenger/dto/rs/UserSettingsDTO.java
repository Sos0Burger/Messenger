package com.messenger.Messenger.dto.rs;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserSettingsDTO {
    Integer id;
    @Schema(description = "Почта", example = "cockdestroyer@gmail.djf")
    private String email;
    @Schema(description = "Отображаемое имя", example = "NAGIBATOR228")
    private String nickName;
    @Schema(description = "Аватар профиля", example = "https://i.imgur.com/AD3MbBi.jpeg")
    private String image;
}
