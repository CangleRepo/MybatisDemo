import org.mybatis.generator.api.ShellRunner;

/**
 * @author raorui
 * @date 2022/6/16 15:51
 */
public class Test {
    /**
     * 功能描述:自动生成mapper.xml、dao、entity
     */
     // 该配置文件放在src\\main\\resources\\该路径下即可
     public static void main(String[] args) {
         args = new String[] { "-configfile", "src\\main\\resources\\mybatis-generator.xml", "-overwrite" };
         ShellRunner.main(args);
     }
}
