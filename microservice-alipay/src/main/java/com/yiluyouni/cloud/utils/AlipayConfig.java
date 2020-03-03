package com.yiluyouni.cloud.utils;

public class AlipayConfig {

	public static String app_id = "2016101800717801";//�ں�̨��ȡ���������ã�
	
	public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDoqPS/1wh1v7psYogNZwV6C8ssEJU4jCGfF/9G3cdIHbx9sXO6pBMivDqDrcDaORS8zkOCy9IVAvLosSQv6tQonuumVFFW4s2IQ5tbPHj4KUaMPlGv1M+bmJyFGGf1llNGcpyVlZ9FIGFgBe3GeJ02bMwBVqzIH4uLe/CzvJDjoARK5J7SjOMwUJX7RDl7ivrwXJl0Fg73/MAHs0+H2HIxkXIfia7J0CViIHxUu8bBR8f/B2eUKPgfnzUgQHJcTP9qHzgunqDvpUJfiooajaHcOK639F7/Gccp3HmWuuDmSxqim56+2C1FKTW6jBreQz2U3ZCf0Jlk4hH/IYe0IuAjAgMBAAECggEBAIa0C8Bmh4dlElJeWdcoposa+O7ySvMKbwzln+8vyImAbfl4HEEbbdjWkipbFyVBlzgZVA0OZPu1UV5X8VOs6lj6agVLHCzp84XJXtFcGc3UV/wquLDMzcaQfU6x6r7N4jkPcolIr4YeUUJ/LEOU4bD5HMRJoo/bc7e2co4dxuWCTWAEz4co3tctmwOtEqvhEglGMuqtc0DV87RF9wlIKYXGwoCBHmPdhknsUgd3e3dj2YAlNyiy+yqvgY9M2a5K6xTl+iQodnFjfP4W/8ajpcnmjyzYT3gypCOH0oEhKEb/B8YKDMBaBbnXIpds9obmQvd2iQWjZHaf2psLYknXOUECgYEA9Cltl8XSF8FQqxep4yQ5YJ/vnyyV2YyhZSM5TtoYak3LtHgoNPzzTNCspQS3xoAGHuyIUIofK/mAfWjp4zhIGd+ilgvbp8Md8ZXzoNAdSR7h2pVDJlpMOdcxODbQXGEpoAkJiE+DmvECGpnukdGJ5VkDCRpkzQMIfDNGXBBQW8UCgYEA8/DD8aYtBIm9rSJENJnKMgUhRwZZ9HImRIg5KD83WVnP8Kob6Q/Dre6mAq6tIvfNVwEgGZcPAcLX3+9fyDlqd4rpWBGUibReafuYwsTiJgU0Ha3zCnA3voF97iPRaP373fx+Qp+lRq9IUwAgOIxJcYJVesFNgS61CUgeVRxkAscCgYAmQQdmrBvKlQMqiz6W0+oZdXV5nuarexkeW3JzJECHB0FPOTQzeR41fsxN3ntcolpTJgQFel5/6Ut0Wqeqbfr98sfqclkr46ohW7kcDP9JoYkJUjF/JM6kkU6o3A2xK5f19vSDYtHfyLrnqA500jukr1mGZ5g7dqoxq2bura+pcQKBgDiHW7Dc9GOv06+SWEHkPZHX1H1UAHaAGVQaSTyFYbsn7+LyWKNqjsr4manXdrG6wO/fh+PGOKkM0N/I5eZNP9nR6/8Hm+dJT/O5ZQ4Fd+6dmBUkoUSS+qf/9AHCdR2idcJcZ5niyvcVWWo6hjz0bXSLYmme7+n2u+cZukW43YgzAoGABOdAcW9IE55cyRSyac37Wjj6gDPBNIcuM41bRNwgoBdSnQC+RdNI7PTF/MtDub7XdcodJ6UgkQtrXgX7/P1/J/tgETphBFliECueDWFsuxMib8iGA0YMkDAmf9P/jX6szofa0diM2c9LzCvW3ey5MMGKWyrFcWWSoktKtH4V5Io=";//�̳̲鿴��ȡ��ʽ���������ã�

	public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAipVfjUfLCunDZdMNK90ipK/2/oAJcpL4yB9wto1AopfeR53YmNdvfD4eXKyRBjYGoJPF5Q7O9e410M0/6j9taf2NAx6dJyEoSQIVpnS+0F5etsZZJmJL4rrm92V2zx9BleYk9xf60o8IOF4Gs2pBpTerHGKye0q1ND9s4I6g/acX58YLEw1TiuYvyQvsQN2VOWIe8c/5khFvlOMdtMnZ6cvVw3XGFBT/4o3MQsZ5MYzUy8kjYEQSPjjuUOqmObxjuBeDNIvLvFrthAIF09LCJlYyabLFBdCx6uk74DXBXn1Z4D0KpO3rS6JMBohcx6FOcP1WWWJIGlFVUF4Hog+QeQIDAQAB";//�̳̲鿴��ȡ��ʽ���������ã�
	
	public static String notify_url = "http://localhost:8080/alipay/alipayNotifyNotice.action";
	
	public static String return_url = "http://localhost:8080/alipay/alipayReturnNotice.action";
	
	public static String sign_type = "RSA2";
	
	public static String charset = "utf-8";
	
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";//ע�⣺ɳ����Ի�������ʽ����Ϊ��https://openapi.alipay.com/gateway.do
}
