package com.azhen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

/**
 * Created by azhen on 17-2-6.
 */
@RestController
public class BoyController {
    @Autowired
    private BoyRepository boyRepository;

    /**
     * 查询所有男生
     * @return
     */
    @GetMapping(value="/boys")
    public List<Boy> lis() {
        List<Boy> list =  boyRepository.findAll();
        return list;
    }

    @PostMapping(value="/boys")
    public Boy girlAdd(@RequestParam("cupSize") String cupSize,
                          @RequestParam("age") Integer age) {
        Boy boy = new Boy();
        boy.setCupSize(cupSize);
        boy.setAge(age);

        return boyRepository.save(boy);
    }

    //查询一个女生
    @GetMapping("/boys/{id}")
    public Boy find(@PathVariable("id") Integer id) {
        return boyRepository.findOne(id);
    }

    //通过年龄查询
    @GetMapping("/boys/age/{age}")
    public List<Boy> listByAge(@PathVariable("age") Integer age) {
        return boyRepository.findByAge(age);
    }
    //更新
    @PutMapping("/boys/{id}")
    public Boy update(@PathVariable("id") Integer id,Boy boy) {
        boy.setId(id);
        return boyRepository.save(boy);
    }

    //删除
    @DeleteMapping("/girls/{id}")
    public void delete(@PathVariable("id") Integer id) {
        boyRepository.delete(id);
    }
}
