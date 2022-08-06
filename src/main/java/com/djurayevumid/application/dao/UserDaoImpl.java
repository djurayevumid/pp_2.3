package com.djurayevumid.application.dao;

import com.djurayevumid.application.model.User;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<User> getAllUsers() {

        return entityManager.createQuery("from User", User.class).getResultList();
    }

    @Override
    public void saveUser(User user) {
        entityManager.merge(user);
    }

    public User getUser(int id) {
        return entityManager.find(User.class, id);
    }



    public void deleteUser(int id) {
        entityManager.remove(getUser(id));

    }
}
