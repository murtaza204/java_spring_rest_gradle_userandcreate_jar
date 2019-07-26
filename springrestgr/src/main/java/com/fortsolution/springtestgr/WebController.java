/**
 * 
 */
package com.fortsolution.springtestgr;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fortsolution.aclassprojecct.TestAclass;
import com.fortsolution.testBclass.TestBclass;

/**
 * @author Ghuam Murtaza
 *
 * Jul 26, 2019
 * murtaza@fortsolution.com
 * Company fortsolution.com 
 */
@RestController
public class WebController {
	
	private final Logger logger = LoggerFactory.getLogger(WebController.class);
	
	@Autowired
	private TestAclass testAclass ;
	@Autowired
	private TestBclass testBclass;
	@RequestMapping(value = "/testAclass", method = RequestMethod.GET)
	public String testAclass()
	{
		logger.debug("testAclass() is executed!");
		return testAclass.getResult();
		
	}
	
	@RequestMapping(value = "/testBclass", method = RequestMethod.GET)
	public String testBclass()
	{
		logger.debug("testBclass() is executed!");
		return testBclass.getResult();
		
	}
}
