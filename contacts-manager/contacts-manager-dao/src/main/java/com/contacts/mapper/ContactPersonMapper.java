package com.contacts.mapper;

import com.contacts.pojo.ContactPerson;
import com.contacts.pojo.ContactPersonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContactPersonMapper {
    int countByExample(ContactPersonExample example);

    int deleteByExample(ContactPersonExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ContactPerson record);

    int insertSelective(ContactPerson record);

    List<ContactPerson> selectByExample(ContactPersonExample example);

    ContactPerson selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ContactPerson record, @Param("example") ContactPersonExample example);

    int updateByExample(@Param("record") ContactPerson record, @Param("example") ContactPersonExample example);

    int updateByPrimaryKeySelective(ContactPerson record);

    int updateByPrimaryKey(ContactPerson record);
}