package com.example.projectBank.repository;

import org.springframework.aot.hint.MemberHint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<MemberHint, Long> {
    
}
