package basic;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AccountMapper {
    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    Account convert(AccountDTO accountDTO);

    @InheritInverseConfiguration
    AccountDTO convert(Account account);
}
