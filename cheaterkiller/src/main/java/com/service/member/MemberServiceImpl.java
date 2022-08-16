package com.service.member;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.member.MemberDao;
import com.repository.member.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberRepository memberRepository;
	
	@Override
	public MemberDao findById(Long memberSeq) {
		Optional<MemberDao> returnValue = memberRepository.findById(memberSeq) ; 
		return returnValue.get();
	}
}
