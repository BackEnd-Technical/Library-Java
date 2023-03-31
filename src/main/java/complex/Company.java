package complex;

import lombok.*;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    private int id;
    private String name;
    private Manager manager;
}
