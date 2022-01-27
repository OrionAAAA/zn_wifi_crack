### **简介**

通过弱口令字典暴力连接wifi

内置字典pwd.txt

可以结合市面上的弱口令字典

例如：https://github.com/conwnet/wpa-dictionary

### **如何使用**

App为启动类，运行该类的main方法即可运行；



### **基本原理**

- 字典的密码会按照wifi配置文件的格式放到temp.xml中，并且通过netsh添加到系统中

```shell
netsh wlan add profile filename=temp.xml
```

- 连接wifi

```shell
netsh wlan connect name=%{ssid}
```

- 连接过程中会进行等待

```java
Thread.sleep(2000);
```

- 通过netsh命令判断连接状态

```shell
netsh wlan show interface
```