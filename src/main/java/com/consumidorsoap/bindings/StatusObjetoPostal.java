//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.11.15 às 05:46:20 PM BRT 
//


package com.consumidorsoap.bindings;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de statusObjetoPostal.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="statusObjetoPostal"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EmBranco"/&gt;
 *     &lt;enumeration value="Postado"/&gt;
 *     &lt;enumeration value="Cancelado"/&gt;
 *     &lt;enumeration value="Estorno"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "statusObjetoPostal")
@XmlEnum
public enum StatusObjetoPostal {

    @XmlEnumValue("EmBranco")
    EM_BRANCO("EmBranco"),
    @XmlEnumValue("Postado")
    POSTADO("Postado"),
    @XmlEnumValue("Cancelado")
    CANCELADO("Cancelado"),
    @XmlEnumValue("Estorno")
    ESTORNO("Estorno");
    private final String value;

    StatusObjetoPostal(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusObjetoPostal fromValue(String v) {
        for (StatusObjetoPostal c: StatusObjetoPostal.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
