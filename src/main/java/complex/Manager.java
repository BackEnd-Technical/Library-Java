package complex;

import lombok.*;

import java.util.List;
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Manager {
    private int id;
    private String name;
    private List<User> users;
}
