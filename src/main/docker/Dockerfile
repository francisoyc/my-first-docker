# 指定基础镜像
FROM java:8
# 指定挂载点
VOLUME /tmp
# 复制文件到容器
ADD my-first-docker-1.0.0-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
# 对外暴露的端口
EXPOSE 8088
# 配置容器启动后执行的命令
ENTRYPOINT [ "java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar" ]

