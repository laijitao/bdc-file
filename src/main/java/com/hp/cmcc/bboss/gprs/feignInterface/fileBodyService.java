package com.hp.cmcc.bboss.gprs.feignInterface;

import java.util.List;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.hp.cmcc.bboss.gprs.pojo.BbdcTypeCdr;
import com.hp.cmcc.bboss.gprs.pojo.HandleReturnPara;

@FeignClient(value = "BDC-CDR-SERVICE")
public interface fileBodyService {

	@RequestMapping(value = "/record/addField",method = RequestMethod.GET,consumes = "application/json")
	HandleReturnPara fileBodyHandle(@RequestParam("fileBody") List<String> fileBody, @RequestBody List<BbdcTypeCdr> rule, 
			@RequestParam("fileName") String fileName);
}