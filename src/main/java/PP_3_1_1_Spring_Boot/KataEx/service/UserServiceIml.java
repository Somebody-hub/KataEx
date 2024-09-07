package  PP_3_1_1_Spring_Boot.KataEx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import PP_3_1_1_Spring_Boot.KataEx.model.User;
import PP_3_1_1_Spring_Boot.KataEx.dao.UserDao;
import java.util.List;

@Service
public class UserServiceIml implements UserService {

    private UserDao userDao;

    @Autowired
    public UserServiceIml(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    @Transactional
    public void deleteUserById(Long id) {
        userDao.deleteUserById(id);
    }

    @Override
    @Transactional
    public void updateUser(Long id, User user) {
        userDao.updateUser(id, user);
    }

    @Override
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}
