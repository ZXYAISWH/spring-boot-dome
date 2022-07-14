package util;

import org.jasypt.properties.PropertyValueEncryptionUtils;
import org.jasypt.util.password.BasicPasswordEncryptor;
import org.jasypt.util.text.BasicTextEncryptor;

/**
 * 加密的工具类
 */
public final class JasyptUtil {

    /**
     * 创建加密文本对象
     */
    private static BasicTextEncryptor textEncryptor = new BasicTextEncryptor();

    /**
     * 创建加密密码对象
     */
    private static BasicPasswordEncryptor passwordEncryptor = new BasicPasswordEncryptor();

    /**
     * 设置加密文本的密码
     */
    static {
        textEncryptor.setPassword("zxy");
    }

    /**
     * 对文本进行解密
     * @return 解密后的结果
     */
    public static String decryptText(String value){
        //变成jasypt解密的格式
        value = "ENC(" + value + ")";
        //判断是否属于解密类型
        Boolean flag = PropertyValueEncryptionUtils.isEncryptedValue(value);
        //如果是属于解密的类型
        if(flag){
            //返回解密后的值
            return PropertyValueEncryptionUtils.decrypt(value,textEncryptor);
        }
        //如果不属于解密的类型,就返回空
        return "";
    }

    /**
     * 对文本进行加密
     * @return 解密后的结果
     */
    public static String encryptText(String value){
        //返回加密后的值
        return textEncryptor.encrypt(value);
    }

    /**
     * 对密码进行加密
     * @param password
     * @return 加密后的结果
     */
    public static String encryptPassword(String password){
        return passwordEncryptor.encryptPassword(password);
    }

    /**
     * 判断加密后的密码是否正确
     * @param password
     * @return
     */
    public static Boolean checkPassword(String password,String encryptPassword){
        return passwordEncryptor.checkPassword(password,encryptPassword);
    }

}
