package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.MallAdmin;
import org.springframework.stereotype.Repository;

@Repository
public interface IMallAdminRepository extends JpaRepository<MallAdmin, Long> {
}