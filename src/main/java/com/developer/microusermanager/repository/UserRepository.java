package com.developer.microusermanager.repository;

import com.developer.microusermanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

    @Query("SELECT u.name from Users u where u.id in (:pIdList)")
    List<String> findByIdList(@Param("pIdList") List<Long> idList);

}