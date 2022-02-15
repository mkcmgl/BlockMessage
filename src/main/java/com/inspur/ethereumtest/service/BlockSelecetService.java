package com.inspur.ethereumtest.service;

import com.inspur.ethereumtest.pojo.Blockbynumber;
import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.util.List;
public interface BlockSelecetService {

    public List<Blockbynumber> findByNumber(String number);
    public List<Blockbynumber>finByHash(String hash);
}
