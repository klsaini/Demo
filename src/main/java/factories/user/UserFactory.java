package factories.user;

import entities.user.UserEntity;
import pojos.user.Users;

public class UserFactory {
    UserEntity userEntity=new UserEntity();
   public Users createUser(String name, String job) {
        return userEntity.createUser(name,job);
    }
}
