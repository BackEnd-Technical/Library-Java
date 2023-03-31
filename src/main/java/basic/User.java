package basic;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class User {
    private int id;
    private String name;
    private String address;
    private String version;
}
