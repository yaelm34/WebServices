
package client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AfficherChambresJSONResponse_QNAME = new QName("http://localhost:10000/ReservationVoyage", "afficherChambresJSONResponse");
    private final static QName _CreerChambresResponse_QNAME = new QName("http://localhost:10000/ReservationVoyage", "creerChambresResponse");
    private final static QName _AfficherChambresResponse_QNAME = new QName("http://localhost:10000/ReservationVoyage", "afficherChambresResponse");
    private final static QName _AfficherChambres_QNAME = new QName("http://localhost:10000/ReservationVoyage", "afficherChambres");
    private final static QName _AfficherChambresJSON_QNAME = new QName("http://localhost:10000/ReservationVoyage", "afficherChambresJSON");
    private final static QName _ReserverChambreResponse_QNAME = new QName("http://localhost:10000/ReservationVoyage", "reserverChambreResponse");
    private final static QName _CreerChambres_QNAME = new QName("http://localhost:10000/ReservationVoyage", "creerChambres");
    private final static QName _ReserverChambre_QNAME = new QName("http://localhost:10000/ReservationVoyage", "reserverChambre");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AfficherChambresJSONResponse }
     * 
     */
    public AfficherChambresJSONResponse createAfficherChambresJSONResponse() {
        return new AfficherChambresJSONResponse();
    }

    /**
     * Create an instance of {@link CreerChambresResponse }
     * 
     */
    public CreerChambresResponse createCreerChambresResponse() {
        return new CreerChambresResponse();
    }

    /**
     * Create an instance of {@link CreerChambres }
     * 
     */
    public CreerChambres createCreerChambres() {
        return new CreerChambres();
    }

    /**
     * Create an instance of {@link ReserverChambre }
     * 
     */
    public ReserverChambre createReserverChambre() {
        return new ReserverChambre();
    }

    /**
     * Create an instance of {@link AfficherChambres }
     * 
     */
    public AfficherChambres createAfficherChambres() {
        return new AfficherChambres();
    }

    /**
     * Create an instance of {@link AfficherChambresJSON }
     * 
     */
    public AfficherChambresJSON createAfficherChambresJSON() {
        return new AfficherChambresJSON();
    }

    /**
     * Create an instance of {@link ReserverChambreResponse }
     * 
     */
    public ReserverChambreResponse createReserverChambreResponse() {
        return new ReserverChambreResponse();
    }

    /**
     * Create an instance of {@link AfficherChambresResponse }
     * 
     */
    public AfficherChambresResponse createAfficherChambresResponse() {
        return new AfficherChambresResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficherChambresJSONResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:10000/ReservationVoyage", name = "afficherChambresJSONResponse")
    public JAXBElement<AfficherChambresJSONResponse> createAfficherChambresJSONResponse(AfficherChambresJSONResponse value) {
        return new JAXBElement<AfficherChambresJSONResponse>(_AfficherChambresJSONResponse_QNAME, AfficherChambresJSONResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerChambresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:10000/ReservationVoyage", name = "creerChambresResponse")
    public JAXBElement<CreerChambresResponse> createCreerChambresResponse(CreerChambresResponse value) {
        return new JAXBElement<CreerChambresResponse>(_CreerChambresResponse_QNAME, CreerChambresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficherChambresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:10000/ReservationVoyage", name = "afficherChambresResponse")
    public JAXBElement<AfficherChambresResponse> createAfficherChambresResponse(AfficherChambresResponse value) {
        return new JAXBElement<AfficherChambresResponse>(_AfficherChambresResponse_QNAME, AfficherChambresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficherChambres }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:10000/ReservationVoyage", name = "afficherChambres")
    public JAXBElement<AfficherChambres> createAfficherChambres(AfficherChambres value) {
        return new JAXBElement<AfficherChambres>(_AfficherChambres_QNAME, AfficherChambres.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficherChambresJSON }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:10000/ReservationVoyage", name = "afficherChambresJSON")
    public JAXBElement<AfficherChambresJSON> createAfficherChambresJSON(AfficherChambresJSON value) {
        return new JAXBElement<AfficherChambresJSON>(_AfficherChambresJSON_QNAME, AfficherChambresJSON.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserverChambreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:10000/ReservationVoyage", name = "reserverChambreResponse")
    public JAXBElement<ReserverChambreResponse> createReserverChambreResponse(ReserverChambreResponse value) {
        return new JAXBElement<ReserverChambreResponse>(_ReserverChambreResponse_QNAME, ReserverChambreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerChambres }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:10000/ReservationVoyage", name = "creerChambres")
    public JAXBElement<CreerChambres> createCreerChambres(CreerChambres value) {
        return new JAXBElement<CreerChambres>(_CreerChambres_QNAME, CreerChambres.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserverChambre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:10000/ReservationVoyage", name = "reserverChambre")
    public JAXBElement<ReserverChambre> createReserverChambre(ReserverChambre value) {
        return new JAXBElement<ReserverChambre>(_ReserverChambre_QNAME, ReserverChambre.class, null, value);
    }

}
