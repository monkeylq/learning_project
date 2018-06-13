package com.lbcy.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.Primitives;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * create by liqi 2017.11.27
 */
public class MyStrUtils
{

    public static Gson gson = new Gson();
    public static Gson gsonWithNull = new GsonBuilder().serializeNulls().create();


    /**
     * toStr
     *
     * @param o
     * @return json Str
     */
    public static String toStr(Object o)
    {
        return gson.toJson(o);
    }


    /**
     * to Object
     */
    public static <T> T strToObject(String json, Class<T> classOfT)
    {
        Object object = gson.fromJson(json, (Type) classOfT);
        return Primitives.wrap(classOfT).cast(object);
    }


    /**
     * @param str 源字符
     * @return md5字符
     * @throws NoSuchAlgorithmException
     * @throws UnsupportedEncodingException
     */
    public static String toMd5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException
    {
        try
        {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            String md5 = new BigInteger(1, md.digest()).toString(16);
            return fillMD5(md5);
        } catch (Exception e)
        {
            throw new RuntimeException("MD5加密错误:" + e.getMessage(), e);
        }
    }

    private static String fillMD5(String md5)
    {
        return md5.length() == 32 ? md5 : fillMD5("0" + md5);
    }


    /**
     * 获取随即标识
     */
    public static String getUUID()
    {
        return UUID.randomUUID().toString().replace("-", "");
    }


    /**
     * 按格式获取当前日期
     *
     * @param dateFormat
     * @return
     */
    public static String getDate(String dateFormat)
    {
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        return sdf.format(new Date());
    }


    /*
      return one * two
     */
    public static BigDecimal sum(String one, String two)
    {
        BigDecimal de1 = new BigDecimal(one);
        BigDecimal de2 = new BigDecimal(two);
        return de1.add(de2);
    }

    /*
      return one * two
     */
    public static BigDecimal mul(String one, String two)
    {
        BigDecimal de1 = new BigDecimal(one);
        BigDecimal de2 = new BigDecimal(two);
        return de1.multiply(de2);
    }

    public static BigDecimal mul(BigDecimal one, String two)
    {
        BigDecimal de2 = new BigDecimal(two);
        return one.multiply(de2);
    }

    public static BigDecimal mul(String one, BigDecimal two)
    {
        BigDecimal de1 = new BigDecimal(one);
        return de1.multiply(two);
    }

//    public static void main(String[] args)
//    {
//        System.out.println(mul("1.5","10"));
//    }

}
