package com.zgo.lib.utils

import java.security.MessageDigest


/*
 * 消息摘要加密方式
 * 
 * @author: zhhli
 * @date: 21/12/17
 */

/**
 *
 * MD5加密 加密之后没转成16进制是16位，转成16进制之后是32位
 */
fun md5(input: String): String {
    return DigestUtil.md5(input)
}

/**
 * sha1 加密 加密之后是20位 ，转成16进制之后40位
 */
fun sha1(input: String): String {
    return DigestUtil.sha1(input)
}

/**
 * sha256 加密 加密之后是32位 ，转成16进制之后64位
 */
fun sha256(input: String): String {
    return DigestUtil.sha256(input)
}

/**
 * internal 模块内可见
 */
internal object DigestUtil {


    const val MD5_ALGORITHM = "MD5"
    const val SHA1_ALGORITHM = "SHA-1"
    const val SHA256_ALGORITHM = "SHA-256"


    /**
     *
     * MD5加密 加密之后没转成16进制是16位，转成16进制之后是32位
     */
    fun md5(input: String): String {
        return toHex(generateDigest(input, MD5_ALGORITHM))
    }

    /**
     * sha1 加密 加密之后是20位 ，转成16进制之后40位
     */
    fun sha1(input: String): String {
        return toHex(generateDigest(input, SHA1_ALGORITHM))
    }

    /**
     * sha256 加密 加密之后是32位 ，转成16进制之后64位
     */
    fun sha256(input: String): String {
        return toHex(generateDigest(input, SHA256_ALGORITHM))
    }

    private fun generateDigest(input: String, algorithm: String): ByteArray {
        val digest = MessageDigest.getInstance(algorithm)
        return digest.digest(input.toByteArray())
    }

    /**
     * 转成16进制
     */
    private fun toHex(byteArray: ByteArray): String {
        return with(StringBuilder()) {
            byteArray.forEach {
                val hex = it.toInt() and (0xFF)
                val toHexString = Integer.toHexString(hex)
                if (toHexString.length == 1) {
                    append("0").append(toHexString)
                } else {
                    append(toHexString)
                }
            }
            toString()
        }
    }


}

