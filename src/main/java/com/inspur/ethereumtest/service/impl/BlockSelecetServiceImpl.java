package com.inspur.ethereumtest.service.impl;

import com.inspur.ethereumtest.mapper.BlockbynumberMapper;
import com.inspur.ethereumtest.pojo.Blockbynumber;
import com.inspur.ethereumtest.service.BlockSelecetService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("select")
public class BlockSelecetServiceImpl implements BlockSelecetService {

    @Autowired
    private BlockbynumberMapper blockbynumberMapper;

    @Override
    public List<Blockbynumber> findByNumber(String number) {
        return blockbynumberMapper.selectByNumber(number);
    }

    @Override
    public List<Blockbynumber> finByHash(String hash) {
        return blockbynumberMapper.selectByHash(hash);
    }
}