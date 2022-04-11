package itheima;

/***学习内容：
        1、网络编程三要素：IP地址、端口、协议
        2、InetAddress
        3、UDP通信协议
        4、TCP通信协议
*/
import java.net.InetAddress;
import java.net.UnknownHostException;

/*
    InetAddress
        此类表示Internet协议（IP）地址

        public static InetAddress getByName(String host); 确定主机名称的IP地址。主机名称可以是及其名称，也可以是IP地址
        public String getHostName(); 获取此IP地址的主机名
        public String getHostAddress(); 返回文本显示中的IP地址字符串
 */
public class InetAddressDemo {
    public static void main(String[]args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("192.168.0.14");

        String name = address.getHostName();
        System.out.println("主机名：" + name);

        String ip = address.getHostAddress();
        System.out.println("IP地址：" + ip);

    }
}