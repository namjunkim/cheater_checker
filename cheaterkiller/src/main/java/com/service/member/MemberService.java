package com.service.member;

import com.dao.member.MemberDao;

public interface MemberService {
	public MemberDao findById(Long memberSeq);
}
