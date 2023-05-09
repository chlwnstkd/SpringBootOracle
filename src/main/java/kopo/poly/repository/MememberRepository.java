package kopo.poly.repository;

import kopo.poly.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MememberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();

}