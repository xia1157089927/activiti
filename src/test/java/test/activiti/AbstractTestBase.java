package test.activiti;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.activiti.Application;
import com.google.gson.Gson;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class},
        		webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public abstract class AbstractTestBase {
	public static Logger log = LoggerFactory.getLogger(AbstractTestBase.class);
	public static Gson gson = new Gson();
}
