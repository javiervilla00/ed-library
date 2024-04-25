package com.javiervilla00.digitalLibrary.feature.user.data;


import com.javiervilla00.digitalLibrary.feature.user.data.local.UserFileLocalDataSource;
import com.javiervilla00.digitalLibrary.feature.user.domain.User;
import com.javiervilla00.digitalLibrary.feature.user.domain.UserRepository;

public class UserDataRepository implements UserRepository {

    private UserFileLocalDataSource localDataSource;

    public UserDataRepository(UserFileLocalDataSource localDataSource) {
        this.localDataSource = localDataSource;
    }

    @Override
    public void saveUser(User user) {
        localDataSource.save(user);
    }
}
