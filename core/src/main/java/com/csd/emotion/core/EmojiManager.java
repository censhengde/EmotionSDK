package com.csd.emotion.core;

import android.util.SparseArray;

import java.util.Map;

/**
 * Author：岑胜德 on 2021/9/10 02:57
 * <p>
 * 说明：
 */
public final class EmojiManager {

    private SparseArray<EmojiPackage> mEmojiPackages;

    /**
     * 添加一个表情包
     *
     * @param factory
     */
    public void addEmojiPackage(EmojiFactory factory) {
        if (mEmojiPackages == null) {
            mEmojiPackages = new SparseArray<>();
        }
        final EmojiPackage emojiPackage = factory.getEmojiPackage();
        mEmojiPackages.put(emojiPackage.id, emojiPackage);
    }

    public EmojiPackage getEmojiPackage(int packageId) {
        return mEmojiPackages.get(packageId);
    }
}
