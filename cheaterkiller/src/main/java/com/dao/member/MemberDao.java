package com.dao.member;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor(access= AccessLevel.PROTECTED)
@Entity(name = "member")
public class MemberDao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long memberSeq;
	
	private String memberName;
	
	@Builder
	public MemberDao(String memberName) {
		this.memberName = memberName;
	}
	
}
