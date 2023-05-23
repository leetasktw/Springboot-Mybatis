package com.leetasktw.mapper;

import com.leetasktw.pojo.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {

    public List<Member> selectAll();

    public int insert(Member member);

    public int delete(Integer id);
}
