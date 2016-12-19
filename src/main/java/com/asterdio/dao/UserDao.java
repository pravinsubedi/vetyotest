package com.asterdio.dao;

import com.asterdio.model.User;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by Admin on 12/19/2016.
 */

@Transactional
public interface UserDao extends CrudRepository<User, Integer> {

}
