server:
  port: 8080

mybatis:
  type-aliases-package: com.yiluyouni.cloud.entity
  mapper-locations: classpath:mapper/*.xml

spring:
  datasource:
    url: jdbc:mysql://192.168.189.21:3306/alipay
    username: root
    password: root
    driver-class-name: com.mysql.jdbc.Driver
  application:
    name: microservice-alipay
  mvc:
    view:
      prefix: /WEB-INF/jsp/
      suffix: .jsp

eureka:
  client:
    service-url:
      defaultZone: http://user:password123@localhost:8761/eureka
  instance:
    prefer-ip-address: true
    instanceId: ${spring.application.name}:${spring.application.instance_id:${server.port}}

logging:
  level:
    root: INFO
    org.hibernate: INFO
    org.hibernate.type.descriptor.sql.BasicBinder: TRACE
    org.hibernate.type.descriptor.sql.BasicExtractor: TRACE
    com.itmuch: DEBUG
