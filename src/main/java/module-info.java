module springfox.docketyper.demo { 
    
    requires com.fasterxml.jackson.annotation;
    requires java.annotation;
    requires java.validation;
    requires com.fasterxml.jackson.databind;
    requires springfox.docketyper;
    requires jackson.datatype.threetenbp;
    requires java.logging;
    requires java.sql;
    requires java.xml.bind;
    requires org.slf4j;
    requires spring.beans;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.core;
    requires spring.web;
	requires org.apache.tomcat.embed.core;
    requires springfox.core;
    requires springfox.swagger2;
    requires springfox.spring.web;
    requires swagger.annotations;
    requires threetenbp;

    exports io.swagger.api;
    exports io.swagger.configuration;
    exports io.swagger.model;
}