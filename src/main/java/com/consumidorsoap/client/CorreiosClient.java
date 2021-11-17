package com.consumidorsoap.client;

import com.consumidorsoap.bindings.ConsultaCEP;
import com.consumidorsoap.bindings.ConsultaCEPResponse;
import com.consumidorsoap.bindings.ObjectFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import javax.xml.bind.JAXBElement;

public class CorreiosClient extends WebServiceGatewaySupport {

    public ConsultaCEPResponse buscarDetalhesCep(String cep) {
        ObjectFactory objectFactory = new ObjectFactory();
        ConsultaCEP consultaCEP = objectFactory.createConsultaCEP();
        consultaCEP.setCep(cep);
        JAXBElement<ConsultaCEP> jaxbRequest = objectFactory.createConsultaCEP(consultaCEP);

        JAXBElement<ConsultaCEPResponse> jaxbResponse = (JAXBElement<ConsultaCEPResponse>) getWebServiceTemplate().marshalSendAndReceive(jaxbRequest);
        return jaxbResponse.getValue();
    }
}
