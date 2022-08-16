package com.repository.member;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dao.member.MemberDao;

@Repository
public interface MemberRepository extends JpaRepository<MemberDao, Long> {

	//public MemberDao findById(Long memberSeq);
}
