package com.kindustry.common.util;

import org.junit.Test;

import com.kindustry.common.util.PinyinUtility;


public class Pinyin4jUtilTest {
  
  
  @Test
  public void testPu(){
    String str = "长沙市长";  
    String pinyin = PinyinUtility.converterToSpell(str);  
    System.out.println(str+" pin yin ："+pinyin);  
    pinyin = PinyinUtility.converterToFirstSpell(str);  
    System.out.println(str+" short pin yin ："+pinyin);  
  }

}
