package org.pragma.foodcourtmessaging.application.dto.response;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JwtResponse{
    private String token;
}
