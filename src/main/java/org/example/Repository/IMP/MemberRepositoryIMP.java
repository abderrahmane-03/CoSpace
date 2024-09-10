package org.example.Repository.IMP;

import org.example.Repository.INF.MemberRepository;
import org.example.entities.Member;

import java.util.List;

public class MemberRepositoryIMP implements MemberRepository {


    @Override
    public Member findById(String s) {
        return null;
    }

    @Override
    public List findAll() {
        return List.of();
    }

    @Override
    public void save(Member entity) {

    }

    @Override
    public void update(Member entity) {

    }

    @Override
    public void deleteById(String s) {

    }

}
