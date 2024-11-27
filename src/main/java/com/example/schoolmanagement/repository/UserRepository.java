package com.example.schoolmanagement.repository;

import com.example.schoolmanagement.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
        private List<User> users = new ArrayList<>();

        public void addUser(User user) {
                users.add(user);
        }

        public List<User> getAllUsers() {
                return users;
        }

        public User getUserById(int id) {
                for (User user : users) {
                        if (user.getId() == id) {
                                return user;
                        }
                }
                return null;
        }

        public User authenticate(String email, String password) {
                for (User user : users) {
                        if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                                return user;
                        }
                }
                return null;
        }
}
