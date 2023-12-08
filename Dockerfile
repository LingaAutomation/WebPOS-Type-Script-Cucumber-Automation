FROM openjdk:11
EXPOSE 8080
ADD target/basicvalidaitonsuite-doller-store-timeclock-3.jar basicvalidaitonsuite-doller-store-timeclock-3.jar
ENTRYPOINT["java","-jar","/basicvalidaitonsuite-doller-store-timeclock-3.jar"]