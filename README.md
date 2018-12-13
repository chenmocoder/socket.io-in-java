# socket.io-in-java
项目中使用socket.io 做消息的实时传送，
server端是 express+mongodb 需要和其他部分合作，对方系统使用java编写，顾用java写了 socket.io 的客户端 以供对方参考,并做了一些实验

此类库自带 重连机制，顾不必自己封装重连，否则会建立两次 连接，客户端会受到 两次消息。
这个也是使用tcp来传输消息，在服务器上使用 tcpdump 抓包分析可见。
