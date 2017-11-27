package atwy.mircoboot.base.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import atwy.mircoboot.base.HelloController;
import junit.framework.TestCase;

@SpringBootTest(classes=HelloController.class)
@RunWith(SpringJUnit4ClassRunner.class)
@ConditionalOnWebApplication
public class TestHelloController {
	
	@Autowired
	HelloController helloController;
	
	@Test
	public void testindex() {
		TestCase.assertEquals(this.helloController.index(), "hello  world!");
	}
}
