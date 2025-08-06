package com.cashtrackify.app;

import com.cashtrackify.dao.UserDAOImpl;
import com.cashtrackify.model.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("Simrit", "simrit@example.com", "password123");

        UserDAOImpl userDAO = new UserDAOImpl();
        boolean success = userDAO.addUser(user);

        if (success) {
            System.out.println("✅ User added successfully!");
        } else {
            System.out.println("❌ Failed to add user.");
        }
    }
}
