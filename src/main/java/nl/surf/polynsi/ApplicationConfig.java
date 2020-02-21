package nl.surf.polynsi;

import javax.xml.ws.Endpoint;

import nl.surf.polynsi.soap.connection.provider.ConnectionServiceProviderPortImpl;
import nl.surf.polynsi.soap.connection.requester.ConnectionServiceRequesterPortImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.feature.LoggingFeature;
import org.apache.cxf.jaxws.EndpointImpl;

import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletPath;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class ApplicationConfig {
    @Autowired
    private Bus bus;

    @Bean
    public ServletRegistrationBean<CXFServlet> dispatcherServlet() {
        return new ServletRegistrationBean<CXFServlet>(new CXFServlet(), "/soap/*");
    }

    @Bean
    @Primary
    public DispatcherServletPath dispatcherServletPathProvider() {
        return () -> "";
    }


    @Bean
    public Endpoint endpointConnectionProvider() {
        EndpointImpl endpoint = new EndpointImpl(bus, new ConnectionServiceProviderPortImpl());
        endpoint.publish("/connection/provider");
        return endpoint;
    }

    @Bean
    public Endpoint endpointConnectionRequester() {
        EndpointImpl endpoint = new EndpointImpl(bus, new ConnectionServiceRequesterPortImpl());
        endpoint.publish("/connection/requester");
        return endpoint;
    }
}
