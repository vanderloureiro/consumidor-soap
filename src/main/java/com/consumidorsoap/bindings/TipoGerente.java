//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.11.15 às 04:04:35 PM BRT 
//


package com.consumidorsoap.bindings;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoGerente.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoGerente"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GerenteConta"/&gt;
 *     &lt;enumeration value="GerenteContaMaster"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tipoGerente")
@XmlEnum
public enum TipoGerente {

    @XmlEnumValue("GerenteConta")
    GERENTE_CONTA("GerenteConta"),
    @XmlEnumValue("GerenteContaMaster")
    GERENTE_CONTA_MASTER("GerenteContaMaster");
    private final String value;

    TipoGerente(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoGerente fromValue(String v) {
        for (TipoGerente c: TipoGerente.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
