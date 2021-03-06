/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (10.1.3.0.0, build 060119.1546.05277)

package remoteservices.runtime;

import oracle.j2ee.ws.common.encoding.*;
import oracle.j2ee.ws.client.ServiceExceptionImpl;
import oracle.j2ee.ws.common.util.exception.*;
import oracle.j2ee.ws.common.soap.SOAPVersion;
import oracle.j2ee.ws.client.HandlerChainImpl;
import javax.xml.rpc.*;
import javax.xml.rpc.encoding.*;
import javax.xml.rpc.handler.HandlerChain;
import javax.xml.rpc.handler.HandlerInfo;
import javax.xml.namespace.QName;

public class DeptService_Service_Impl extends oracle.j2ee.ws.client.BasicService implements remoteservices.DeptService_Service {
    private static final QName serviceName = new QName("urn:DeptService-example", "DeptService");
    private static final QName ns1_DeptServiceSoapHttpPort_QNAME = new QName("urn:DeptService-example", "DeptServiceSoapHttpPort");
    private static final Class deptService_PortType_PortClass = remoteservices.DeptService_PortType.class;
    
    public DeptService_Service_Impl() {
        super(serviceName, new QName[] {
                        ns1_DeptServiceSoapHttpPort_QNAME
                    },
            new remoteservices.runtime.DeptService_Service_SerializerRegistry().getRegistry());
        
    }
    
    public java.rmi.Remote getPort(QName portName, Class serviceDefInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (portName.equals(ns1_DeptServiceSoapHttpPort_QNAME) &&
                serviceDefInterface.equals(deptService_PortType_PortClass)) {
                return getDeptServiceSoapHttpPort();
            }
        } catch (Exception e) {
            throw new ServiceExceptionImpl(new LocalizableExceptionAdapter(e));
        }
        return super.getPort(portName, serviceDefInterface);
    }
    
    public java.rmi.Remote getPort(Class serviceDefInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (serviceDefInterface.equals(deptService_PortType_PortClass)) {
                return getDeptServiceSoapHttpPort();
            }
        } catch (Exception e) {
            throw new ServiceExceptionImpl(new LocalizableExceptionAdapter(e));
        }
        return super.getPort(serviceDefInterface);
    }
    
    public remoteservices.DeptService_PortType getDeptServiceSoapHttpPort() {
        String[] roles = new String[] {};
        HandlerChainImpl handlerChain = new HandlerChainImpl(getHandlerRegistry().getHandlerChain(ns1_DeptServiceSoapHttpPort_QNAME));
        handlerChain.setRoles(roles);
        remoteservices.runtime.DeptServiceSoapHttp_Stub stub = new remoteservices.runtime.DeptServiceSoapHttp_Stub(handlerChain);
        try {
            stub._initialize(super.internalTypeRegistry);
        } catch (JAXRPCException e) {
            throw e;
        } catch (Exception e) {
            throw new JAXRPCException(e.getMessage(), e);
        }
        return stub;
    }
}
