package com.azhen;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by azhen on 17-2-6.
 */
public interface BoyRepository extends JpaRepository<Boy,Integer>{
    //通过年龄来查询
    public List<Boy> findByAge(Integer age);
}
