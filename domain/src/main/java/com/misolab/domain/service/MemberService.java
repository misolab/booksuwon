package com.misolab.domain.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import com.misolab.domain.entity.Member;
import com.misolab.domain.repository.MemberRepository;

@RequiredArgsConstructor
@Service
public class MemberService {

    final MemberRepository memberRepository;

    public Member findMember(String username) {
        return memberRepository.findByUsername(username);
    }

    public void update(Member member) {
        memberRepository.save(member);
    }

    public void resetToken(String token) {
        memberRepository.findByToken(token).ifPresent(member -> {
            member.reset(null);
            memberRepository.save(member);
        });
    }

}
