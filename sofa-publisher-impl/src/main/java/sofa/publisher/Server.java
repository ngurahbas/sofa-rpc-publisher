package sofa.publisher;

import com.alipay.sofa.rpc.config.ProviderConfig;
import com.alipay.sofa.rpc.config.ServerConfig;
import sofa.publisher.impl.ExampleServiceImpl;

public class Server {
    public static void main(String[] args) {
        ServerConfig serverConfig = new ServerConfig()
            .setProtocol("bolt") // Set a protocol, which is bolt by default
            .setPort(12200) // set a port, which is 12200 by default
            .setDaemon(false); // non-daemon thread

        ProviderConfig<ExampleService> providerConfig = new ProviderConfig<ExampleService>()
            .setInterfaceId(ExampleService.class.getName()) // Specify the interface
            .setRef(new ExampleServiceImpl()) // Specify the implementation
            .setServer(serverConfig); // Specify the server

        providerConfig.export();
    }
}