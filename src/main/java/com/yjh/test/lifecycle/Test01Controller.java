package com.yjh.test.lifecycle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test01Controller {

	@ResponseBody
	@RequestMapping("lifecycle/test01/1")
	public String TestResponse() {
		return "<h2> 테스트 프로젝트 완성 </h2> "
				+ "<h4>해당 프로젝트를 통해서 문제 풀이를 진행 합니다.</h4>";
	}
	
	@ResponseBody
	@RequestMapping("lifecycle/test01/2")
	public Map<String, Integer> mapResponse() {
		
		Map<String, Integer> subjectMap = new HashMap<>();
			subjectMap.put("국어", 80);
			subjectMap.put("수학", 90);
			subjectMap.put("영어", 85);
			
			return subjectMap;
	}
}
