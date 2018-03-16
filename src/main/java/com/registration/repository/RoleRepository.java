package com.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.registration.modal.Role;


public interface RoleRepository extends JpaRepository<Role, Long>{
}