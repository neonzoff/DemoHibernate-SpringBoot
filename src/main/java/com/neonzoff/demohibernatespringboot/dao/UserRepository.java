package com.neonzoff.demohibernatespringboot.dao;

import com.neonzoff.demohibernatespringboot.model.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author Tseplyaev Dmitry
 */
public interface UserRepository extends PagingAndSortingRepository<UserModel, Integer> {

}
