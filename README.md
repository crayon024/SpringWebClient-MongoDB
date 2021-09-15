# Spring_WebClient 访问 MongoDB服务
## 打包
1.服务端

注释 webclient 包下的 ClientController 和 Spring5WebclientApplication

2.客户端

2.1 注释 demo 包下的 Spring5BookMyshowApplication 类

2.2 修改 webclient 包下的 ClientController 代码, 将 init() 方法中访问的 url 设置为对应的服务端 address 和路径 
