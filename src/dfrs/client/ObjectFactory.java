
package dfrs.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dfrs.client package. 
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

    private final static QName _EditFlightRecord_QNAME = new QName("http://server.dfrs/", "editFlightRecord");
    private final static QName _GetAllFlightInfo_QNAME = new QName("http://server.dfrs/", "getAllFlightInfo");
    private final static QName _TransferReservationResponse_QNAME = new QName("http://server.dfrs/", "transferReservationResponse");
    private final static QName _BookFlight_QNAME = new QName("http://server.dfrs/", "bookFlight");
    private final static QName _GetBookedFlightCount_QNAME = new QName("http://server.dfrs/", "getBookedFlightCount");
    private final static QName _GetBookedFlightCountResponse_QNAME = new QName("http://server.dfrs/", "getBookedFlightCountResponse");
    private final static QName _EditFlightRecordResponse_QNAME = new QName("http://server.dfrs/", "editFlightRecordResponse");
    private final static QName _GetAllFlightInfoResponse_QNAME = new QName("http://server.dfrs/", "getAllFlightInfoResponse");
    private final static QName _TransferReservation_QNAME = new QName("http://server.dfrs/", "transferReservation");
    private final static QName _BookFlightResponse_QNAME = new QName("http://server.dfrs/", "bookFlightResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dfrs.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BookFlightResponse }
     * 
     */
    public BookFlightResponse createBookFlightResponse() {
        return new BookFlightResponse();
    }

    /**
     * Create an instance of {@link TransferReservation }
     * 
     */
    public TransferReservation createTransferReservation() {
        return new TransferReservation();
    }

    /**
     * Create an instance of {@link EditFlightRecordResponse }
     * 
     */
    public EditFlightRecordResponse createEditFlightRecordResponse() {
        return new EditFlightRecordResponse();
    }

    /**
     * Create an instance of {@link GetAllFlightInfoResponse }
     * 
     */
    public GetAllFlightInfoResponse createGetAllFlightInfoResponse() {
        return new GetAllFlightInfoResponse();
    }

    /**
     * Create an instance of {@link GetBookedFlightCountResponse }
     * 
     */
    public GetBookedFlightCountResponse createGetBookedFlightCountResponse() {
        return new GetBookedFlightCountResponse();
    }

    /**
     * Create an instance of {@link BookFlight }
     * 
     */
    public BookFlight createBookFlight() {
        return new BookFlight();
    }

    /**
     * Create an instance of {@link GetBookedFlightCount }
     * 
     */
    public GetBookedFlightCount createGetBookedFlightCount() {
        return new GetBookedFlightCount();
    }

    /**
     * Create an instance of {@link TransferReservationResponse }
     * 
     */
    public TransferReservationResponse createTransferReservationResponse() {
        return new TransferReservationResponse();
    }

    /**
     * Create an instance of {@link GetAllFlightInfo }
     * 
     */
    public GetAllFlightInfo createGetAllFlightInfo() {
        return new GetAllFlightInfo();
    }

    /**
     * Create an instance of {@link EditFlightRecord }
     * 
     */
    public EditFlightRecord createEditFlightRecord() {
        return new EditFlightRecord();
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public Result createResult() {
        return new Result();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditFlightRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.dfrs/", name = "editFlightRecord")
    public JAXBElement<EditFlightRecord> createEditFlightRecord(EditFlightRecord value) {
        return new JAXBElement<EditFlightRecord>(_EditFlightRecord_QNAME, EditFlightRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllFlightInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.dfrs/", name = "getAllFlightInfo")
    public JAXBElement<GetAllFlightInfo> createGetAllFlightInfo(GetAllFlightInfo value) {
        return new JAXBElement<GetAllFlightInfo>(_GetAllFlightInfo_QNAME, GetAllFlightInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.dfrs/", name = "transferReservationResponse")
    public JAXBElement<TransferReservationResponse> createTransferReservationResponse(TransferReservationResponse value) {
        return new JAXBElement<TransferReservationResponse>(_TransferReservationResponse_QNAME, TransferReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookFlight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.dfrs/", name = "bookFlight")
    public JAXBElement<BookFlight> createBookFlight(BookFlight value) {
        return new JAXBElement<BookFlight>(_BookFlight_QNAME, BookFlight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookedFlightCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.dfrs/", name = "getBookedFlightCount")
    public JAXBElement<GetBookedFlightCount> createGetBookedFlightCount(GetBookedFlightCount value) {
        return new JAXBElement<GetBookedFlightCount>(_GetBookedFlightCount_QNAME, GetBookedFlightCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookedFlightCountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.dfrs/", name = "getBookedFlightCountResponse")
    public JAXBElement<GetBookedFlightCountResponse> createGetBookedFlightCountResponse(GetBookedFlightCountResponse value) {
        return new JAXBElement<GetBookedFlightCountResponse>(_GetBookedFlightCountResponse_QNAME, GetBookedFlightCountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditFlightRecordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.dfrs/", name = "editFlightRecordResponse")
    public JAXBElement<EditFlightRecordResponse> createEditFlightRecordResponse(EditFlightRecordResponse value) {
        return new JAXBElement<EditFlightRecordResponse>(_EditFlightRecordResponse_QNAME, EditFlightRecordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllFlightInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.dfrs/", name = "getAllFlightInfoResponse")
    public JAXBElement<GetAllFlightInfoResponse> createGetAllFlightInfoResponse(GetAllFlightInfoResponse value) {
        return new JAXBElement<GetAllFlightInfoResponse>(_GetAllFlightInfoResponse_QNAME, GetAllFlightInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferReservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.dfrs/", name = "transferReservation")
    public JAXBElement<TransferReservation> createTransferReservation(TransferReservation value) {
        return new JAXBElement<TransferReservation>(_TransferReservation_QNAME, TransferReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookFlightResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.dfrs/", name = "bookFlightResponse")
    public JAXBElement<BookFlightResponse> createBookFlightResponse(BookFlightResponse value) {
        return new JAXBElement<BookFlightResponse>(_BookFlightResponse_QNAME, BookFlightResponse.class, null, value);
    }

}
