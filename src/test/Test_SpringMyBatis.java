import cn.test.mybatis.Dao.CsSendP2pMessageInfoRepository;
import cn.test.mybatis.bean.CsSendP2pMessageInfoPo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;
import java.util.Random;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class Test_SpringMyBatis {

    @Autowired
    private CsSendP2pMessageInfoRepository userMapper;

    @Test
    public void testFindUserList(){
        CsSendP2pMessageInfoPo csSendP2pMessageInfoPo = new CsSendP2pMessageInfoPo();
        csSendP2pMessageInfoPo.setFromCsUserId("32108");
        csSendP2pMessageInfoPo.setToCsUserId("11133");
        csSendP2pMessageInfoPo.setChannel("APM");
        csSendP2pMessageInfoPo.setContent("{\"addInfo\":\"{\\\"hhhh\\\":\\\"999966\\\"}\",\"channel\":\"APM\",\"content\":\"testmsg\",\"date\":1714288981277,\"fromUserId\":\"32108\",\"fromUserName\":\"你好\",\"msg\":\"成功\",\"result\":\"200\",\"time\":1714288981248,\"toUserId\":\"11133\",\"type\":\"3\",\"uqIdentNo\":\"0.9339679251812745\"}");
        csSendP2pMessageInfoPo.setUqIdentNo(System.currentTimeMillis()+"");
        csSendP2pMessageInfoPo.setMsgContent("testmsg");
        csSendP2pMessageInfoPo.setMsgType(0);
        csSendP2pMessageInfoPo.setMsgTime(1714288981277L);
        csSendP2pMessageInfoPo.setStatus(1);
        csSendP2pMessageInfoPo.setCreateTime(new Date());
        csSendP2pMessageInfoPo.setUpdateTime(new Date());
        csSendP2pMessageInfoPo.setFileUrl("eweqwe");
        csSendP2pMessageInfoPo.setFileName("eweqwe");
//        userMapper.insert1(csSendP2pMessageInfoPo);
        userMapper.insert(csSendP2pMessageInfoPo);
    }

}

