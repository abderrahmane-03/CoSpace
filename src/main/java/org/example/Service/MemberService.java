package org.example.Service;

import org.example.Repository.INF.MemberRepository;
import org.example.entities.Member;

import java.util.List;

public class MemberService {

    private final MemberRepository memberRepository;

    // Constructor injection for the repository
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    // Method to create a new member
    public void createMember(Member member) {
        memberRepository.save(member);
    }

    // Method to get member by ID
    public Member getMemberById(String id) {
        return memberRepository.findById(id);
    }

    // Method to get all member
    public List<Member> getAllMember() {
        return memberRepository.findAll();
    }

    // Method to update member
    public void updateMember(Member member) {
        memberRepository.update(member);
    }

    // Method to delete member by ID
    public void deleteMemberById(String id) {
        memberRepository.deleteById(id);
    }
}
