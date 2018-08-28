package com.sanshao.jpa.domain.simple;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<SimpleUser, Integer> {

}
