package com.example.DataIntegrityException.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Member;
@Repository
public interface MemberRepository extends JpaRepository<Member,Integer> {
}
