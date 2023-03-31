package basic;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class AccountDTO {
    private Integer id;
    private String username;
    private String password;
}
