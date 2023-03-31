package complex;

import lombok.*;

import java.util.List;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ManagerDTO {
    private int id;
    private String name;
    private List<UserDTO> users;
}
