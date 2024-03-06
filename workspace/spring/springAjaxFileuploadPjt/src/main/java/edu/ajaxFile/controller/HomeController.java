package edu.ajaxFile.controller;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	
	@RequestMapping(value="/ajaxIndex.do")
	public String ajaxIndex() {
		return "ajaxIndex";
	}
	
	/*
	  @RequestMapping(value="/callText.do")
	  @ResponseBody //���ϰ��� ���䵥���ͷ� �����. 
	  public String callText() { 
		  return"ajaxData"; 
	  }
	 
	*/
	@RequestMapping(value="/callText.do")
	public void callText(HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html; charset=utf-8");
		response.getWriter().append("ajaxData").flush();;
	}
	
	@RequestMapping(value="/callJSON.do")
	@ResponseBody 
	public Map<String,String> callJSON(){
		Map<String,String> map = new HashMap<String,String>();
		map.put("key1","data1");
		map.put("key2","data2");
		map.put("key3","data3");
		
		return map;
	}
	
	@RequestMapping(value="/callJSON2.do")
	@ResponseBody
	public List<Map<String,String>> callJSON2(){
		List<Map<String,String>> list 
				= new ArrayList<Map<String,String>>();
		
		/*
		 [{name : ȫ�浿
			  age : 20}
			,{name : �̱浿
			  age : 25}
			,{name : ��浿
			  age : 29}] 
		  
		 */
		Map<String,String> map1 = new HashMap<String,String>();
		map1.put("name","ȫ�浿");
		map1.put("age","20");
		list.add(map1);
		
		Map<String,String> map2 = new HashMap<String,String>();
		map2.put("name","�̱浿");
		map2.put("age","25");
		list.add(map2);
		
		Map<String,String> map3 = new HashMap<String,String>();
		map3.put("name","��浿");
		map3.put("age","29");
		list.add(map3);
		
		return list;
	}
	
	@RequestMapping(value="/fileIndex.do")
	public String fileIndex() {
		return "fileIndex";
	}
	
	@RequestMapping(value="/upload.do", method=RequestMethod.POST)
	public String upload(HttpServletRequest request, MultipartFile uploadFile,String title) throws IllegalStateException, IOException {
		String path = request.getSession()
					 		 .getServletContext()
					 		 .getRealPath("/resources/upload");
		
		path = "D:\\ohm\\spring\\springAjaxFileuploadPjt\\src\\main\\webapp\\resources\\upload";
		System.out.println(path);
		
		//upload ������ ���ٸ� ������ �ּ���
		File dir = new File(path);
		if(!dir.exists()) {
			dir.mkdirs(); //�������� �ʴ� ��� ���� ���� ����
		}
		
		if(!uploadFile.getOriginalFilename().isEmpty()) { // ������ �����ϴ� ���
			String fileNM = uploadFile.getOriginalFilename(); //���� ���ϸ�
			
			String[] fileNMArr= fileNM.split(".");
			String ext =  fileNMArr[fileNMArr.length-1];
			
			String realFileNM = fileNMArr[0]+"001."+ext; //���� ���ϸ�
			
			uploadFile.transferTo(new File(path,realFileNM));
		}
			
		return "redirect:/";
	}
	
	
	
	
	
}
