//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.11.15 às 04:04:35 PM BRT 
//


package com.consumidorsoap.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de valorDeclarado complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="valorDeclarado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="maximo" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="minimo" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "valorDeclarado", propOrder = {
    "maximo",
    "minimo"
})
public class ValorDeclarado {

    protected Double maximo;
    protected Double minimo;

    /**
     * Obtém o valor da propriedade maximo.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaximo() {
        return maximo;
    }

    /**
     * Define o valor da propriedade maximo.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaximo(Double value) {
        this.maximo = value;
    }

    /**
     * Obtém o valor da propriedade minimo.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinimo() {
        return minimo;
    }

    /**
     * Define o valor da propriedade minimo.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimo(Double value) {
        this.minimo = value;
    }

}
