package com.zxy.util;

import org.jasypt.properties.PropertyValueEncryptionUtils;
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
     * 设置密码的密码
     */
    static {
        textEncryptor.setPassword("zxy");
    }

    /**
     * 对文本进行解密
     * @return 解密后的结果
     */
    public static String decrypt(String value){
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
    public static String encrypt(String value){
        //返回加密后的值
        return textEncryptor.encrypt(value);
    }



}
