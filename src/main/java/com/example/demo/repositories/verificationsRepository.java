package com.example.demo.repositories;
import com.example.demo.model.reports;
import com.example.demo.model.verifications;
import org.springframework.data.jpa.repository.JpaRepository;
public interface verificationsRepository extends JpaRepository<verifications, Integer> {
}
