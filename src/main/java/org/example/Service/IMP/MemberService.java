package org.example.Service.IMP;

import org.example.Repository.IMP.MemberRepositoryIMP;
import org.example.entities.Member;

import java.util.List;

public class MemberService {

    private final MemberRepositoryIMP memberRepository;

    // Constructor injection for the repository
    public MemberService(MemberRepositoryIMP memberRepository) {
        this.memberRepository = memberRepository;
    }

    // Method to create a new member
    public boolean createMember(Member member) {
        memberRepository.save(member);  // Use the instance of memberRepository to call the non-static method
        return true;
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
