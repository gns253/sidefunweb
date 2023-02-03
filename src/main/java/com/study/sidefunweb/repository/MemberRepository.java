package com.study.sidefunweb.repository;

import com.study.sidefunweb.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member,Long> {

    Member save(Member member);

    Optional<Member> findById(Long memberId);
}
