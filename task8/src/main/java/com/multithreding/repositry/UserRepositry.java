package com.multithreding.repositry;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import com.multithreding.entity.User;


@Repository
public interface UserRepositry extends MongoRepository<User, String> {

}
