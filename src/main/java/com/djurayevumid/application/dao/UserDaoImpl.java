package com.djurayevumid.application.dao;

import com.djurayevumid.application.model.User;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class UserDaoImpl implements UserDao {


    private final LocalContainerEntityManagerFactoryBean entityManager;



    public UserDaoImpl(LocalContainerEntityManagerFactoryBean entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public List<User> getAllUsers() {

        return entityManager.getObject().createEntityManager().createQuery("from User", User.class).getResultList();
    }

    @Override
    public void saveUser(User user) {
        entityManager.getObject().createEntityManager().persist(user);
    }

    public User getUser(int id) {
        return entityManager.getObject().createEntityManager().find(User.class, id);
    }

    @Override
    public User updateUser(User user) {
        return entityManager.getObject().createEntityManager().merge(user);
    }


    public void deleteUser(int id) {
        User user = entityManager.getObject().createEntityManager().find(User.class, id);
        entityManager.getObject().createEntityManager().remove(user);
    }
}
