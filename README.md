# Apache-Kafka




-->server:
-->   port: 9000
   
spring:
    kafka:
      consumer:
         bootstrap-servers: localhost:9092
         group-id: myGroup
         auto-offset-reset: earliest
         key-deserializer: org.apache.kafka.common.serialization.StringDeserializer
         #value-deserializer: org.apache.kafka.common.serialization.StringDeserializer 
         value-deserializer: org.springframework.kafka.support.serializer.JsonDeserializer 
         properties:
           spring:
              json:
                 trusted:
                    packages: "*"
      producer:
        bootstrap-servers: localhost:9092
        key-serializer: org.apache.kafka.common.serialization.StringSerializer
        #value-serializer: org.apache.kafka.common.serialization.StringSerializer   
        value-serializer: org.springframework.kafka.support.serializer.JsonSerializer   
        
        https://www.conduktor.io/kafka/kafka-topics-cli-tutorial
        This link is from Stephen of Conductor,contains CLI for working with apache kafka-***
        
        https://www.javaguides.net/2022/05/spring-boot-kafka-producer-consumer-example-tutorial.html
        
        https://kafka.apache.org/quickstart
        
        https://www.confluent.io/blog/apache-kafka-spring-boot-application/
        
        https://docs.spring.io/spring-kafka/reference/html/#quick-tour
        
        
