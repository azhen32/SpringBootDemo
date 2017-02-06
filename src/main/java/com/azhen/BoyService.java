package com.azhen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by azhen on 17-2-6.
 */
@Service
public class BoyService {
    @Autowired
    private BoyRepository boyRepository;

    @Transactional
    public void insertTwo() {
        Boy boy1 = new Boy();
        boy1.setAge(20);
        boy1.setCupSize("F");
        boyRepository.save(boy1);

        Boy boy2 = new Boy();
        boy1.setAge(20);
        boy1.setCupSize("EEE");
        boyRepository.save(boy2);
    }
}
