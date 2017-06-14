/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.automationrhapsody.reststub.resources;
import org.apache.wink.common.model.wadl.WADLGenerator;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
@javax.ws.rs.Path("/myexample")
public class MyResource {
    @Context
    javax.ws.rs.core.Application app;
    
    @javax.ws.rs.OPTIONS
    @Produces("application/vnd.sun.wadl+xml")
    public org.apache.wink.common.model.wadl.Application getOptions() {
        System.out.println(app.getClasses());
        org.apache.wink.common.model.wadl.Application wadlAppDoc = new WADLGenerator().generate("", app.getClasses());
        /* modify the  wadlAppDoc JAXB model if you want to add additional information */
        System.out.println(wadlAppDoc.getAny());
        System.out.println("wadlgen");
        return wadlAppDoc;
    }
}	
