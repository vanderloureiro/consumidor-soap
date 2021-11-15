package com.consumidorsoap.client;

import com.consumidorsoap.bindings.ConsultaCEP;
import com.consumidorsoap.bindings.ConsultaCEPResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class CorreiosClient extends WebServiceGatewaySupport {

    public ConsultaCEPResponse buscarDetalhesCep(String cep) {
        ConsultaCEP request = new ConsultaCEP();
        request.setCep(cep);

        return (ConsultaCEPResponse) getWebServiceTemplate().marshalSendAndReceive("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                request, new SoapActionCallback("http://cliente.bean.master.sigep.bsb.correios.com.br/consultaCEP"));
    }
}
