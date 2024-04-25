package com.javiervilla00.digitalLibrary.feature.user.domain;

public class AddUserUseCase {

    private UserRepository userRepository;

    public AddUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void execute(User user){
        userRepository.saveUser(user);
    }
}
