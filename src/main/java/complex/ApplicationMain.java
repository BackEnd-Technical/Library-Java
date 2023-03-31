package complex;

import java.util.List;

public class ApplicationMain {
    public static void main(String[] args) {
        User user1 = new User(1, "vinh");
        User user2 = new User(2, "trung");
        Manager manager = new Manager(1, "manager", List.of(user1, user2));
        Company company = new Company(1, "SSV", manager);
        CompanyDTO companyDTO = CompanyMapper.INSTANCE.entityToDto(company);
        System.out.println(company.toString());
        System.out.println(companyDTO.toString());
    }
}
