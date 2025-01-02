package com.example.demo.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.bean.UserDTO;

@Mapper
public interface UserDAO {

    @Select("SELECT * FROM user_table WHERE uemail = #{uemail} AND upassword = #{upassword}")
    UserDTO login(UserDTO userDTO);

    @Select("SELECT * FROM user_table WHERE uemail = #{uemail}")
    UserDTO getMember(String uemail);

    @Update("UPDATE user_table SET upassword = #{upassword}, uname = #{uname} WHERE uemail = #{uemail}")
    void update(UserDTO userDTO);

    @Delete("DELETE FROM user_table WHERE uemail = #{uemail}")
    void delete(UserDTO userDTO);

    @Select("SELECT * FROM user_table LIMIT ")
    List<UserDTO> list(Map<String, Integer> map);

    @Select("SELECT * FROM user_table WHERE uid = #{uid} AND uname = #{uname} AND uemail = #{uemail}")
    UserDTO naverLogin(String uid, String uname, String uemail);


    @Insert("INSERT INTO patients_tb (name) VALUES (#{name})")
    void write(String name);

    @Select("SELECT * FROM patients_tb")
    List<UserDTO> getList(Map<String, Integer> map);

    @Delete("DELETE FROM patients_tb WHERE seq = #{seq}")
    void deletePatient(int seq);

    @Insert("INSERT INTO TempMember (seq, name) VALUES (1, #{name})")
    void TempMember(Map<String, Object> map);

    @Select("SELECT * FROM TempMember WHERE seq = 1")
    UserDTO GetTempMember();

    @Delete("DELETE FROM TempMember WHERE seq = 1")
    void DeleteTempMember();
}
