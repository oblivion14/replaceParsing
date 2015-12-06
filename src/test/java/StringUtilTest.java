import com.pineone.stringutil.StringUtilManager;
import org.junit.Test;

/**
 * Created by Melvin on 2015. 12. 6..
 */
public class StringUtilTest {

    StringUtilManager stringUtilManager = new StringUtilManager();

    @Test
    public void stringUtilTest() throws Exception {

        int num = 12;
        int length = 4;

        stringUtilManager.stringUtilManager(num, length);

    }

    @Test
    public void stringUtilTest1() throws Exception {

        int num = 350;
        int length = 8;

        stringUtilManager.stringUtilManager(num, length);

    }

    @Test
    public void stringUtilTest2() throws Exception {

        int num = 10;
        int length = 14;

        stringUtilManager.stringUtilManager(num, length);

    }




}
