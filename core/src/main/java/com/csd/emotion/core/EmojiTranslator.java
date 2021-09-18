package com.csd.emotion.core;

/**
 * Author：岑胜德 on 2021/9/16 11:21
 * <p>
 * 说明： 表情翻译器
 */
public interface EmojiTranslator {

     CharSequence translate(CharSequence source);
     void translateAsyc(CharSequence input);




}
