package com.zpark.util;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016101100661198";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCbuhRc4RTeP6B4Bb674O7cKBP9qy2W4Fx/Hgh6CFHnjSKufJF4O3h9lwSsbzTyRdXsqNwBiyI4or1IN8wjgjQngQfKS+kmwflRdEDrdQslW4Y3DOqnaB+H1FEsWlZW3cfEeFTopmcAWKRSyj9gH0f3X4BiZXxjSjK40Uo/WG8xzvpVEhK5owThxv+SjgRW0FtM/rPkHZv+rnaKeYkNDMp7x/uDIytxnSmBXp2XRqxV4RxGtyfWVjlwKuoGVhkP7lprSYB4MSOxRNAGaw29xrYTHnqUd6tTzZ9l8EQFoOA4jGDVqiOCvgjZJ5k+bcI6aewnD2q2zdA8uigHvfDhtUFdAgMBAAECggEAOL9kcDwtaJfzGAmv6bMcF+oa7tOUN2jnDAObvyyM/D44JzGJqTCyxcFkmJmlx6ufOzCFi6JyBAV5yHlc0IvACa1Bc3yaJ9+DxSUCC0uJlkF19VWlpP+SjeLW+bypvdnv1C6tcmJBIqUqrGi7E4ISrZiFplWpMF13glXyIodNbe6VZIGRWWaw83scBz5uyd4pfyRpf/JTjTcBr+EfpbuKZ7w+qsZrQmjsql2iVXNb9BXPRrKIxhLlyXy96lMoR8jngvGBS8yG5K0Sp4np86Up8EGBo8cQ90omv7F/RNNReFWg5+M0mtasG3sYN952awqCCLVwMU1lsL1p7hg7YyomGQKBgQDq5oU8eGIzjN/ZN12EE8sOx6LOop88b1TKFsdg5BrDvBfRTDI8qWoz9l4RwWhwaWvfphhdz/niKAhQynrSE/7EET1sD+ajdGayNRSySe9QtsGtWgGKDsOeRV+AxUZmYcjKrjsJyShO/wOHhARjjK9CmhePL+1QkwDPlgAM06Hn9wKBgQCptvs5/7xohAvLPN7BN8xM1Bq8fze3cTkOPvgo0LvT52K+y6vmTgoFZNEHzdT1HhHaii0KdpMY05wkJTooneSTSaK6KGJP2+wJkq/vCqEpD1FPxsq4IVpguWZNvf/k4uL1pbp5TGI4UU5UByIwrSlsvMLD+qwHBpW1BaVZWlEUSwKBgQCDn8Za2w4T2sV4Hwj8wGaREpaM+R0HLU8yqk7wYQEKWvRxqCOiUEAde9i8VEbkbn4u5RBUSPy5mDsIolzuKJwiW5KyYbqYLtp40zuUp888yBuAuqWQKbO9lRvtuR04s2RjBfw5AIngsg7VOcmHysZOKLA44N82vhi/OUsv5MqdgwKBgEYL0MrSY0fb4CZE/EdRKVA4ZsSP2UYsQ/k+QhxOcod2Q8ots8g9Q2OQhbmr2Y5Fl+bUCtz7raCcjiBZARUMfe/Qf4pH6rO9OEGHOnf1siiJOu0rRjYTBgNP4gqKNdiZUEVE3p77yLonzKVfwFvIzIUlr1lF18SakiWBrAoh/b7bAoGBAJRc8Y1nUpLSDjZozol5uJ6bSds0R2vePAotahDZA8KNW7mc/TzfmoDkVy/GkelYwHNdAHMSEsQdUko86TorwnJxVvf/hg/8225xIXJvM4DPdPG7slzKPH5wzyEpUoK6T8Co1QAlCxvVy7r7xnbz60n0MBD+wr193ga2+DSRMAEq";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAm7oUXOEU3j+geAW+u+Du3CgT/astluBcfx4IeghR540irnyReDt4fZcErG808kXV7KjcAYsiOKK9SDfMI4I0J4EHykvpJsH5UXRA63ULJVuGNwzqp2gfh9RRLFpWVt3HxHhU6KZnAFikUso/YB9H91+AYmV8Y0oyuNFKP1hvMc76VRISuaME4cb/ko4EVtBbTP6z5B2b/q52inmJDQzKe8f7gyMrcZ0pgV6dl0asVeEcRrcn1lY5cCrqBlYZD+5aa0mAeDEjsUTQBmsNvca2Ex56lHerU82fZfBEBaDgOIxg1aojgr4I2SeZPm3COmnsJw9qts3QPLooB73w4bVBXQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8082/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8082/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关	alipaydev测试版网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

