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
    private static final String OUTPUT_XSD_PATH = "CongdanCollection.xsd";

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
    public DefaultWsdl11Definition xacMinhThongTinNhanThanWsdlDefinition(XsdSchema xacMinhThongTinNhanThanSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("XacMinhThongTinNhanThanRequestPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://gtel.vn/qldc");
        wsdl11Definition.setSchema(xacMinhThongTinNhanThanSchema);
        return wsdl11Definition;
    }

    @Bean(name = "CongdanCollection")
    public DefaultWsdl11Definition congdanCollectionWsdlDefinition(XsdSchema congdanCollectionSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("CongdanCollectionPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://www.mic.gov.vn/dancu/1.0"); // Đặt tên miền cho CongdanCollection
        wsdl11Definition.setSchema(congdanCollectionSchema);

        return wsdl11Definition;
    }

    @Bean
    public XsdSchema countriesSchema() {
        return new SimpleXsdSchema(new ClassPathResource("countries.xsd"));
    }

    @Bean
    public XsdSchema xacMinhThongTinNhanThanSchema() {
        return new SimpleXsdSchema(new ClassPathResource(INPUT_XSD_PATH));
    }

    @Bean
    public XsdSchema congdanCollectionSchema() {
        return new SimpleXsdSchema(new ClassPathResource(OUTPUT_XSD_PATH));
    }
}