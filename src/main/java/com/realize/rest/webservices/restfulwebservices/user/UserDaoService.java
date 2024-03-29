package com.realize.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

@Service
public class UserDaoService {
    //public List<User> findAll()
    //public User save()
    //public User findOne()



    private static int usersCount = 0;

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User("Naresh", ++usersCount, LocalDate.now().minusYears(22)));
        users.add(new User("Surendra", ++usersCount, LocalDate.now().minusYears(25)));
        users.add(new User("Manoj", ++usersCount, LocalDate.now().minusYears(23)));
        users.add(new User("Vinod", ++usersCount, LocalDate.now().minusYears(20)));

    }

    public List<User> findAllUsers() {
        return users;
    }

    public User findOne(int id ) {
        Predicate<? super User> predicate = user -> user.getId() == id;
        return users.stream().filter(predicate).findFirst().orElse(null);
    }
    public User save(User user) {
        user.setId(++usersCount);
        users.add(user);
        return user;
    }
    public void deleteUserById(int id ) {
        Predicate<? super User> predicate = user -> user.getId() == id;
        users.removeIf(predicate);
    }
}
