import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.web.bean.User;
import com.web.service.UserService;

/**
 * 
 */
/**
 * @author  zhihuayang E-mail:425273175@qq.com 
 * @date 创建时间：2016年4月27日 下午1:40:36
 * @version 1.0 
 * @parameter  
 * @return  
*/
/**
 * @author lenovo
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
public class MybatisTest {
//  private ApplicationContext ac = null;  
	
	@Resource
	private UserService userService;
	
	
	@Test
	public void Test1(){
		User user=userService.getUserById(1);
		System.out.println(user.getPassword());
	}

}
