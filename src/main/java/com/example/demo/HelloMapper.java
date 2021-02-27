package com.example.demo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface HelloMapper {

  @Select("SELECT text FROM messages WHERE lang = #{lang}")
  public String findByLang(@Param("lang") String lang);

}
