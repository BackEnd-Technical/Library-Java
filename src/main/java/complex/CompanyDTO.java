package complex;

import lombok.*;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDTO {
    private int id;
    private String name;
    private ManagerDTO manager;
}
