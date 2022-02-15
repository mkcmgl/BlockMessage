package com.inspur.ethereumtest.service.impl;
import com.inspur.ethereumtest.mapper.BlockSyncLogMapper;
import com.inspur.ethereumtest.mapper.BlockbynumberMapper;
import com.inspur.ethereumtest.pojo.Blockbynumber;
import com.inspur.ethereumtest.service.BlockByService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;
@Service("blocker")
public class BlockByServiceImpl implements BlockByService {
    @Autowired
    private BlockSyncLogMapper blockSyncLogMapper;
    @Override
    public void save(Map<String,Object> block) {
        blockSyncLogMapper.insert(block);
    }
    @Override
    public void saveByNumber(Map<String, Object> block) {
        blockSyncLogMapper.insertByNumber(block);
    }

    @Override
    public String getMaxId() {
       return blockSyncLogMapper.getMaxId();
    }

    @Override
    public List<Blockbynumber> list() {
        List<Blockbynumber>blockList=blockSyncLogMapper.findAll();
        return blockList;
    }

    @Override
    public List<Blockbynumber> selectById(String id) {
//        return (List<Blockbynumber>) blockSyncLogMapper.selectById(id);
        return null;
    }
    @Override
   public void saveByHash(Map<String, Object> block) {
        blockSyncLogMapper.insertByHash( block);
    }
    @Override
    public void saveTransactionByHash(Map<String, Object> block) {
    }


}
