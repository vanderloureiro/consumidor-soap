package com.consumidorsoap.client;

import com.consumidorsoap.bindings.ConsultaCEP;
import com.consumidorsoap.bindings.ConsultaCEPResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class CorreiosClient extends WebServiceGatewaySupport {

    public ConsultaCEPResponse buscarDetalhesCep(String cep) {
        ConsultaCEP request = new ConsultaCEP();
        request.setCep(cep);
        return (ConsultaCEPResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }
}
