//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.11.17 às 01:38:40 AM BRT 
//


package com.consumidorsoap.bindings;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de acao.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="acao"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DEVOLVIDO_AO_REMETENTE"/&gt;
 *     &lt;enumeration value="ENCAMINHADO_PARA_REFUGO"/&gt;
 *     &lt;enumeration value="REINTEGRADO_E_DEVOLVIDO_AO_REMETENTE"/&gt;
 *     &lt;enumeration value="DESBLOQUEADO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "acao")
@XmlEnum
public enum Acao {

    DEVOLVIDO_AO_REMETENTE,
    ENCAMINHADO_PARA_REFUGO,
    REINTEGRADO_E_DEVOLVIDO_AO_REMETENTE,
    DESBLOQUEADO;

    public String value() {
        return name();
    }

    public static Acao fromValue(String v) {
        return valueOf(v);
    }

}
