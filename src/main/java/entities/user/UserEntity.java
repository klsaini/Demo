package entities.user;

import pojos.user.Users;

public class UserEntity {
   public Users createUser(String name,String job) {
        return Users.builder()
                .name(name)
                .job(job)
                .build();
    }
}
