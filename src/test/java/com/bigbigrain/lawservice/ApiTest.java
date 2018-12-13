package com.bigbigrain.lawservice;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.bigbigrain.lawservice.api.LawApi;
import com.bigbigrain.lawservice.vo.EntityEvaluate;
import com.bigbigrain.lawservice.vo.EntityRequest;
import com.bigbigrain.lawservice.vo.NetEvaluate;
import com.bigbigrain.lawservice.vo.NetRequest;
import com.bigbigrain.lawservice.vo.OrgEvaluate;
import com.bigbigrain.lawservice.vo.OrgRequest;
import com.bigbigrain.lawservice.vo.ResultVo;
import com.bigbigrain.lawservice.vo.SecondEvaluate;
import com.bigbigrain.lawservice.vo.TelEvaluate;
import com.bigbigrain.lawservice.vo.TelRequest;
import com.bigbigrain.lawservice.vo.UserInfo;

public class ApiTest {
	@Test
	public void testGetToken() {
		ResultVo vo = LawApi.getToken("5ADC9994E4644FF5A539C8B7CDA314AF");
		System.out.println(vo);
	}
	
	@Test
	public void testSynEvaluateOrg() {
		UserInfo userInfo = new UserInfo();
		userInfo.setName("胖小明");
		userInfo.setLxdh("1521170589695");
		
		OrgEvaluate evaluate = new OrgEvaluate();
		evaluate.setWybm("F81401F3350941499E78B410483FDF80");
		evaluate.setDepartment("北京市司法局");
		evaluate.setXzqh_name("北京市");
		evaluate.setXzqh("11");
		evaluate.setOverall_evaluate("2");
		evaluate.setData_sources("02");
		evaluate.setPjqd("1");
		evaluate.setPj_time(new Date());
		evaluate.setFlag(1);
		evaluate.setCreate_name("胖小明");
		evaluate.setCreate_time(new Date());
		evaluate.setUpdate_name("胖小明");
		evaluate.setUpdate_time(new Date());
		evaluate.setOther_evaluate("无");
		
		List<SecondEvaluate> secondEvaluates = new ArrayList<>();
		SecondEvaluate se1 = new SecondEvaluate();
		se1.setWybm("E421AF21862742658B8286B047BF7132");
		se1.setEvaluate_index("1");
		se1.setEvaluate("2");
		se1.setFlag(1);
		SecondEvaluate se2 = new SecondEvaluate();
		se2.setWybm("F7FC60E29FB94CF9A88D63A7B6CFE9D8");
		se2.setEvaluate_index("2");
		se2.setEvaluate("2");
		se2.setFlag(1);
		SecondEvaluate se3 = new SecondEvaluate();
		se3.setWybm("416FCBB33E0241F6B35E006A3CF6281D");
		se3.setEvaluate_index("3");
		se3.setEvaluate("2");
		se3.setFlag(1);
		SecondEvaluate se4 = new SecondEvaluate();
		se4.setWybm("697B82A272CE41A68DA1BB7E04C6F82A");
		se4.setEvaluate_index("4");
		se4.setEvaluate("2");
		se4.setFlag(1);
		SecondEvaluate se5 = new SecondEvaluate();
		se5.setWybm("E776F769C66849A2965AD29119F9EF5A");
		se5.setEvaluate_index("5");
		se5.setEvaluate("2");
		se5.setFlag(1);
		secondEvaluates.add(se1);
		secondEvaluates.add(se2);
		secondEvaluates.add(se3);
		secondEvaluates.add(se4);
		secondEvaluates.add(se5);
		
		OrgRequest requestParam = new OrgRequest("5ADC9994E4644FF5A539C8B7CDA314AF",userInfo,evaluate,secondEvaluates);
		
		ResultVo vo = LawApi.synEvaluateOrg("a9b0140f639c4c8389c606fce5c38f27", requestParam);
		System.out.println(vo);
	}
	
	@Test
	public void testSynEvaluateNet() {
		UserInfo userInfo = new UserInfo();
		userInfo.setName("胖小明");
		userInfo.setLxdh("1521170589695");
        	 
		NetEvaluate evaluate = new NetEvaluate();
		evaluate.setWybm("72BD79527D1F4AD6BF9205D5B741373F");
		evaluate.setDepartment("北京法律服务网");
		evaluate.setXzqh_name("北京市");
		evaluate.setXzqh("11");
		evaluate.setService_type("2");
		evaluate.setOverall_evaluate("2");
		evaluate.setData_sources("02");
		evaluate.setPjqd("1");
		evaluate.setPj_time(new Date());
		evaluate.setFlag(1);
		evaluate.setCreate_name("胖小明");
		evaluate.setCreate_time(new Date());
		evaluate.setUpdate_name("胖小明");
		evaluate.setUpdate_time(new Date());
		evaluate.setOther_evaluate("无");
		
		List<SecondEvaluate> secondEvaluates = new ArrayList<>();
		SecondEvaluate se1 = new SecondEvaluate();
		se1.setWybm("3AD26B0AD3924307B6B3D2787CC595A4");
		se1.setEvaluate_index("1");
		se1.setEvaluate("2");
		se1.setFlag(1);
		SecondEvaluate se2 = new SecondEvaluate();
		se2.setWybm("2E45E6B18BCD4DA7B75EE332B2CBF5F8");
		se2.setEvaluate_index("2");
		se2.setEvaluate("2");
		se2.setFlag(1);
		SecondEvaluate se3 = new SecondEvaluate();
		se3.setWybm("9255DB038D824768BC20C6865D31F967");
		se3.setEvaluate_index("3");
		se3.setEvaluate("2");
		se3.setFlag(1);
		SecondEvaluate se4 = new SecondEvaluate();
		se4.setWybm("697B82A272CE41A68DA1BB7E04C6F82A");
		se4.setEvaluate_index("4");
		se4.setEvaluate("2");
		se4.setFlag(1);
		SecondEvaluate se5 = new SecondEvaluate();
		se5.setWybm("E84A9239599B461ABFDC190CEFEC07DD");
		se5.setEvaluate_index("5");
		se5.setEvaluate("2");
		se5.setFlag(1);
		secondEvaluates.add(se1);
		secondEvaluates.add(se2);
		secondEvaluates.add(se3);
		secondEvaluates.add(se4);
		secondEvaluates.add(se5);
		
		NetRequest requestParam = new NetRequest("5ADC9994E4644FF5A539C8B7CDA314AF",userInfo,evaluate,secondEvaluates);
		
		ResultVo vo = LawApi.synEvaluateNet("a9b0140f639c4c8389c606fce5c38f27", requestParam);
		System.out.println(vo);
	}
	
	@Test
	public void testSynEvaluateTel() {
		UserInfo userInfo = new UserInfo();
		userInfo.setName("胖小明");
		userInfo.setLxdh("1521170589695");
		
		TelEvaluate evaluate = new TelEvaluate();
		evaluate.setWybm("683614D21A1F4B818695620E077B3976");
		evaluate.setLd_time(new Date());
		evaluate.setDepartment("北京12348话务中心");
		evaluate.setXzqh_name("北京市");
		evaluate.setXzqh("11");
		evaluate.setService_type("2");
		evaluate.setOverall_evaluate("2");
		evaluate.setPj_time(new Date());
		evaluate.setFlag(1);
		evaluate.setCreate_name("胖小明");
		evaluate.setCreate_time(new Date());
		evaluate.setUpdate_name("胖小明");
		evaluate.setUpdate_time(new Date());
		evaluate.setOther_evaluate("无");
		
		List<SecondEvaluate> secondEvaluates = new ArrayList<>();
		SecondEvaluate se1 = new SecondEvaluate();
		se1.setWybm("6012CEE7EFF54496847F21982E8C0B07");
		se1.setEvaluate_index("1");
		se1.setEvaluate("2");
		se1.setFlag(1);
		SecondEvaluate se2 = new SecondEvaluate();
		se2.setWybm("87829CE66AAF49D78E4A306FF98A2D81");
		se2.setEvaluate_index("2");
		se2.setEvaluate("2");
		se2.setFlag(1);
		SecondEvaluate se3 = new SecondEvaluate();
		se3.setWybm("91BB737B16AD433780A181FE5320A98F");
		se3.setEvaluate_index("3");
		se3.setEvaluate("2");
		se3.setFlag(1);
		SecondEvaluate se4 = new SecondEvaluate();
		se4.setWybm("ED01B753C1A74824A508FE1708C12A0C");
		se4.setEvaluate_index("4");
		se4.setEvaluate("2");
		se4.setFlag(1);
		SecondEvaluate se5 = new SecondEvaluate();
		se5.setWybm("C2C0D38CB0B64C06B3D1B8F5CB1D2E43");
		se5.setEvaluate_index("5");
		se5.setEvaluate("2");
		se5.setFlag(1);
		secondEvaluates.add(se1);
		secondEvaluates.add(se2);
		secondEvaluates.add(se3);
		secondEvaluates.add(se4);
		secondEvaluates.add(se5);
		
		TelRequest requestParam = new TelRequest("5ADC9994E4644FF5A539C8B7CDA314AF",userInfo,evaluate,secondEvaluates);
		
		ResultVo vo = LawApi.synEvaluateTel("a9b0140f639c4c8389c606fce5c38f27", requestParam);
		System.out.println(vo);
	}
	
	@Test
	public void testSynEvaluateEntity() {
		UserInfo userInfo = new UserInfo();
		userInfo.setName("胖小明");
		userInfo.setLxdh("1521170589695");
		
		EntityEvaluate evaluate = new EntityEvaluate();
		evaluate.setWybm("98619684A5274531B84DA341D1749E7F");
		evaluate.setDepartment("北京市公众法律服务中心");
		evaluate.setJgdz("北京市朝阳区");
		evaluate.setJgdh("010-12348");
		evaluate.setXzqh_name("北京市");
		evaluate.setXzqh("11");
		evaluate.setService_type("2");
		evaluate.setOverall_evaluate("2");
		evaluate.setPj_time(new Date());
		evaluate.setFlag(1);
		evaluate.setCreate_name("胖小明");
		evaluate.setCreate_time(new Date());
		evaluate.setUpdate_name("胖小明");
		evaluate.setUpdate_time(new Date());
		evaluate.setOther_evaluate("无");
		
		List<SecondEvaluate> secondEvaluates = new ArrayList<>();
		SecondEvaluate se1 = new SecondEvaluate();
		se1.setWybm("6F4FAF9A2F35452EA6FF7FC06E4013F5");
		se1.setEvaluate_index("1");
		se1.setEvaluate("2");
		se1.setFlag(1);
		SecondEvaluate se2 = new SecondEvaluate();
		se2.setWybm("4E1BBDBED02640AEA904F4A1738E9FD6");
		se2.setEvaluate_index("2");
		se2.setEvaluate("2");
		se2.setFlag(1);
		SecondEvaluate se3 = new SecondEvaluate();
		se3.setWybm("5A3410862BD744929891930FA72C2041");
		se3.setEvaluate_index("3");
		se3.setEvaluate("2");
		se3.setFlag(1);
		SecondEvaluate se4 = new SecondEvaluate();
		se4.setWybm("CD08250FF5904B24BE851E67410E7F5B");
		se4.setEvaluate_index("4");
		se4.setEvaluate("2");
		se4.setFlag(1);
		SecondEvaluate se5 = new SecondEvaluate();
		se5.setWybm("52E5525C2A4C4A2DA5F18906850CFF0A");
		se5.setEvaluate_index("5");
		se5.setEvaluate("2");
		se5.setFlag(1);
		secondEvaluates.add(se1);
		secondEvaluates.add(se2);
		secondEvaluates.add(se3);
		secondEvaluates.add(se4);
		secondEvaluates.add(se5);
		
		EntityRequest requestParam = new EntityRequest("5ADC9994E4644FF5A539C8B7CDA314AF",userInfo,evaluate,secondEvaluates);
		
		ResultVo vo = LawApi.synEvaluateEntity("a9b0140f639c4c8389c606fce5c38f27", requestParam);
		System.out.println(vo);
	}
}
