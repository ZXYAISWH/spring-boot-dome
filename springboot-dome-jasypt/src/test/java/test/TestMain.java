package test;

import org.jasypt.properties.PropertyValueEncryptionUtils;
import org.jasypt.util.numeric.BasicDecimalNumberEncryptor;
import org.jasypt.util.numeric.BasicIntegerNumberEncryptor;
import org.jasypt.util.numeric.DecimalNumberEncryptor;
import org.jasypt.util.numeric.IntegerNumberEncryptor;
import org.jasypt.util.password.BasicPasswordEncryptor;
import org.jasypt.util.text.BasicTextEncryptor;
import org.junit.Test;
import util.JasyptUtil;

import java.math.BigInteger;

public class TestMain {



    @Test
    public void test3(){
        IntegerNumberEncryptor integerNumberEncryptor = new BasicIntegerNumberEncryptor();
        BigInteger encrypt = integerNumberEncryptor.encrypt(new BigInteger("123"));
        System.out.println(encrypt);
        DecimalNumberEncryptor decimalNumberEncryptor = new BasicDecimalNumberEncryptor();
    }

    @Test
    public void test(){
        BasicTextEncryptor basicTextEncryptor = new BasicTextEncryptor();
        basicTextEncryptor.setPassword("duing");
        String name = basicTextEncryptor.decrypt("ENC(oLfneCaBJ54JT4N/QdGYsQ==)");
//        String name = basicTextEncryptor.encrypt("zxy");
//        String name1 = basicTextEncryptor.encrypt("zxy111");
        //WY4qwIMrSKUEFUfBOWRrVw==
        //9TMHzJbwkgzGZWYuzVIIuQ==
        System.out.println(name);
//        System.out.println(name1);
//        Boolean flag = PropertyValueEncryptionUtils.isEncryptedValue("ENC()");
//        String decrypt = PropertyValueEncryptionUtils.decrypt("ENC(9TMHzJbwkgzGZWYuzVIIuQ==)",basicTextEncryptor);
//        System.out.println(flag);
//        System.out.println(decrypt);
//        String password = basicTextEncryptor.decrypt("ENC(9TMHzJbwkgzGZWYuzVIIuQ==)",basicTextEncryptor);
//        System.out.println(password);
    }

    @Test
    public void test2(){
//        BasicPasswordEncryptor passwordEncryptor = new BasicPasswordEncryptor();
//        String name = passwordEncryptor.encryptPassword("zhangsan");
//        //Vuljo2TFCQsCaLzvEl4Dtp/EttsFFWG7
//        //6maBww7O/dwIMNhfUwMyIVkvSFTIu9pJ
//        System.out.println(name);
//        Boolean a = passwordEncryptor.checkPassword("zhangsan",name);
//        System.out.println(a);
        String pwd = JasyptUtil.encryptPassword("zhangsan");
        Boolean flag = JasyptUtil.checkPassword("zhangsan",pwd);
        System.out.println(flag);
    }

    @Test
    public void testJasypt(){
        String key = JasyptUtil.encryptText("zhangsan");
        System.out.println(key);
        String value = JasyptUtil.decryptText(key);
        System.out.println(value);
    }

}
