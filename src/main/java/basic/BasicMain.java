package basic;


import java.util.List;

public class BasicMain {
    public static void main(String[] args) {
        User user1 = new User(1, "vinh", "BN", "1.0");
        User user2 = new User(2, "trung", "PT", "2.0");
        List<User> userList = List.of(user1, user2);
        List<UserDTO> userDTOList = basic.UserMapper.INSTANCE.convertListEntityToDto(userList);
        System.out.println(userList.toString());
        System.out.println(userDTOList.toString());

        Account account = new Account(1, "account1", "account1");
        AccountDTO accountDTO = new AccountDTO(1, "accountDTO1", "accountDTO1");
        AccountDTO dtoConvert = AccountMapper.INSTANCE.convert(account);
        Account accountConvert = AccountMapper.INSTANCE.convert(accountDTO);
        System.out.println(dtoConvert.toString());
        System.out.println(accountConvert.toString());

    }
}
