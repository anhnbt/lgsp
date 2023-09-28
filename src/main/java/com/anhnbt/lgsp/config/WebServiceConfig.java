package com.anhnbt.lgsp.config;

import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {

    // Đường dẫn tới tệp XSD cho input
    private static final String INPUT_XSD_PATH = "XacMinhThongTinNhanThanRequest.xsd";

    // Đường dẫn tới tệp XSD cho output
    private static final String OUTPUT_XSD_PATH = "XacMinhThongTinNhanThanResponse.xsd";

    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/ws/*");
    }

    @Bean(name = "countries")
    public DefaultWsdl11Definition serviceCountriesWsdl(XsdSchema countriesSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("CountriesPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://spring.io/guides/gs-producing-web-service");
        wsdl11Definition.setSchema(countriesSchema);
        return wsdl11Definition;
    }

    @Bean(name = "XacMinhThongTinNhanThanRequest")
    public DefaultWsdl11Definition inputWsdlDefinition(XsdSchema inputSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("XacMinhThongTinNhanThanRequestPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://gtel.vn/qldc");
        wsdl11Definition.setSchema(inputSchema);
        return wsdl11Definition;
    }

    @Bean(name = "XacMinhThongTinNhanThanResponse")
    public DefaultWsdl11Definition outputWsdlDefinition(XsdSchema outputSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("XacMinhThongTinNhanThanResponsePort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://gtel.vn/qldc");
        wsdl11Definition.setSchema(outputSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema countriesSchema() {
        return new SimpleXsdSchema(new ClassPathResource("countries.xsd"));
    }

    @Bean
    public XsdSchema inputSchema() {
        return new SimpleXsdSchema(new ClassPathResource(INPUT_XSD_PATH));
    }

    @Bean
    public XsdSchema outputSchema() {
        return new SimpleXsdSchema(new ClassPathResource(OUTPUT_XSD_PATH));
    }
}