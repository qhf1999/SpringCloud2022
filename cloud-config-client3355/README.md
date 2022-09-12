运维人员向github提交变更
配置更新后，Spring Cloud Config 服务端（Server）可以直接从 Git 仓库中获取最新的配置。
除非重启 Spring Cloud Config 客户端（Client），否则无法通过 Spring Cloud Config 服务端获取最新的配置信息。

手动刷新Config Client配置
可以在Config client中引入SpringBoot actuator 监控
使用以下命令发送一个 POST 请求刷新 Spring Cloud Config 3355 客户端，通知客户端配置文件已经修改，需要重新拉去配置。
curl -X POST "http://localhost:3355/actuator/refresh"