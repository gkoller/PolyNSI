/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package nl.surf.polynsi.soap.connection.provider;

import com.google.protobuf.util.Timestamps;
import net.devh.boot.grpc.client.inject.GrpcClient;
import nl.surf.polynsi.soap.policies.PathTraceType;
import nl.surf.polynsi.soap.policies.PathType;
import nl.surf.polynsi.soap.policies.SegmentType;
import nl.surf.polynsi.soap.policies.StpType;
import nl.surf.polynsi.soap.services.p2p.P2PServiceBaseType;
import nl.surf.polynsi.soap.services.types.OrderedStpType;
import org.ogf.nsi.grpc.connection.common.Header;
import org.ogf.nsi.grpc.connection.common.Schedule;
import org.ogf.nsi.grpc.connection.provider.ConnectionProviderGrpc;
import org.ogf.nsi.grpc.connection.provider.ReservationRequestCriteria;
import org.ogf.nsi.grpc.connection.provider.ReserveRequest;
import org.ogf.nsi.grpc.connection.provider.ReserveResponse;
import org.ogf.nsi.grpc.policy.Path;
import org.ogf.nsi.grpc.policy.PathTrace;
import org.ogf.nsi.grpc.policy.Segment;
import org.ogf.nsi.grpc.services.Directionality;
import org.ogf.nsi.grpc.services.PointToPointService;
import org.w3c.dom.Element;

import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.annotation.Generated;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.5
 * 2020-04-27T16:21:07.875+02:00
 * Generated source version: 3.3.5
 */

@javax.jws.WebService(serviceName = "ConnectionServiceProvider", portName = "ConnectionServiceProviderPort", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/provider", wsdlLocation = "file:/usr/home/guido/devel/surfnet/polynsi/src/main/resources/wsdl/connection/ogf_nsi_connection_provider_v2_0.wsdl", endpointInterface = "nl.surf.polynsi.soap.connection.provider.ConnectionProviderPort")

@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-04-27T16:21:07.875+02:00", comments = "Apache CXF 3.3.5")
public class ConnectionServiceProviderPortImpl implements ConnectionProviderPort {

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-04-27T16:21:07.875+02:00")
    private static final Logger LOG = Logger.getLogger(ConnectionServiceProviderPortImpl.class.getName());

    @GrpcClient("connection_provider")
    private ConnectionProviderGrpc.ConnectionProviderBlockingStub connectionProviderStub;

    /* (non-Javadoc)
     * @see nl.surf.polynsi.soap.connection.provider.ConnectionProviderPort#provision(java.lang.String connectionId, nl.surf.polynsi.soap.framework.headers.CommonHeaderType header)*
     */
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-04-27T16:21:07.875+02:00")
    public void provision(java.lang.String connectionId, javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header) throws ServiceException {
        LOG.info("Executing operation provision");
        System.out.println(connectionId);
        System.out.println(header.value);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see nl.surf.polynsi.soap.connection.provider.ConnectionProviderPort#querySummarySync(nl.surf.polynsi.soap.connection.types.QueryType querySummarySync, nl.surf.polynsi.soap.framework.headers.CommonHeaderType header)*
     */
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-04-27T16:21:07.875+02:00")
    public nl.surf.polynsi.soap.connection.types.QuerySummaryConfirmedType querySummarySync(nl.surf.polynsi.soap.connection.types.QueryType querySummarySync, javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header) throws Error {
        LOG.info("Executing operation querySummarySync");
        System.out.println(querySummarySync);
        System.out.println(header.value);
        try {
            nl.surf.polynsi.soap.connection.types.QuerySummaryConfirmedType _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new Error("error...");
    }

    /* (non-Javadoc)
     * @see nl.surf.polynsi.soap.connection.provider.ConnectionProviderPort#queryRecursive(nl.surf.polynsi.soap.connection.types.QueryType queryRecursive, nl.surf.polynsi.soap.framework.headers.CommonHeaderType header)*
     */
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-04-27T16:21:07.875+02:00")
    public nl.surf.polynsi.soap.connection.types.GenericAcknowledgmentType queryRecursive(nl.surf.polynsi.soap.connection.types.QueryType queryRecursive, javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header) throws ServiceException {
        LOG.info("Executing operation queryRecursive");
        System.out.println(queryRecursive);
        System.out.println(header.value);
        try {
            nl.surf.polynsi.soap.connection.types.GenericAcknowledgmentType _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see nl.surf.polynsi.soap.connection.provider.ConnectionProviderPort#reserveCommit(java.lang.String connectionId, nl.surf.polynsi.soap.framework.headers.CommonHeaderType header)*
     */
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-04-27T16:21:07.875+02:00")
    public void reserveCommit(java.lang.String connectionId, javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header) throws ServiceException {
        LOG.info("Executing operation reserveCommit");
        System.out.println(connectionId);
        System.out.println(header.value);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see nl.surf.polynsi.soap.connection.provider.ConnectionProviderPort#queryNotification(java.lang.String connectionId, java.lang.Long startNotificationId, java.lang.Long endNotificationId, nl.surf.polynsi.soap.framework.headers.CommonHeaderType header)*
     */
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-04-27T16:21:07.875+02:00")
    public void queryNotification(java.lang.String connectionId, java.lang.Long startNotificationId, java.lang.Long endNotificationId, javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header) throws ServiceException {
        LOG.info("Executing operation queryNotification");
        System.out.println(connectionId);
        System.out.println(startNotificationId);
        System.out.println(endNotificationId);
        System.out.println(header.value);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see nl.surf.polynsi.soap.connection.provider.ConnectionProviderPort#terminate(java.lang.String connectionId, nl.surf.polynsi.soap.framework.headers.CommonHeaderType header)*
     */
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-04-27T16:21:07.875+02:00")
    public void terminate(java.lang.String connectionId, javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header) throws ServiceException {
        LOG.info("Executing operation terminate");
        System.out.println(connectionId);
        System.out.println(header.value);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see nl.surf.polynsi.soap.connection.provider.ConnectionProviderPort#reserve(java.lang.String connectionId, java.lang.String globalReservationId, java.lang.String description, nl.surf.polynsi.soap.connection.types.ReservationRequestCriteriaType criteria, nl.surf.polynsi.soap.framework.headers.CommonHeaderType header)*
     */
    public void reserve(javax.xml.ws.Holder<java.lang.String> connectionId, java.lang.String globalReservationId, java.lang.String description, nl.surf.polynsi.soap.connection.types.ReservationRequestCriteriaType criteria, javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header) throws ServiceException {
        LOG.info("Executing operation reserve");

        // Build header
        try {
            Header.Builder pbHeaderBuilder = Header.newBuilder();
            pbHeaderBuilder.setProtocolVersion(header.value.getProtocolVersion())
                    .setCorrelationId(header.value.getCorrelationId()).setRequesterNsa(header.value.getRequesterNSA())
                    .setProviderNsa(header.value.getProviderNSA());
            if (header.value.getReplyTo() != null) {
                pbHeaderBuilder.setReplyTo(header.value.getReplyTo());
            }
            if (header.value.getSessionSecurityAttr() != null) {
                pbHeaderBuilder.setSessionSecurityAttributes("Ignoring SAML stuff for now (TODO).");
            }

            // Process NSI extensions that are included in the SOAP header
            for (Object elem : header.value.getAny()) {
                if (elem instanceof Element) {
                    Element hdElem = (Element) elem;
                    if (hdElem.getLocalName().equals("pathTrace")) {
                        // dynamically create Java PathTraceType instance from raw XML
                        JAXBContext hdElemContext = JAXBContext
                                .newInstance("nl.surf.polynsi.soap.policies", nl.surf.polynsi.soap.policies.ObjectFactory.class
                                        .getClassLoader());
                        JAXBElement<PathTraceType> root = hdElemContext.createUnmarshaller()
                                .unmarshal(hdElem.getOwnerDocument().getDocumentElement(), PathTraceType.class);
                        PathTraceType soapPathTrace = root.getValue();

                        // Build protobuf PathTrace message
                        PathTrace.Builder pbPathTraceBuilder = PathTrace.newBuilder().setId(soapPathTrace.getId())
                                .setConnectionId(soapPathTrace.getConnectionId());
                        for (PathType soapPathType : soapPathTrace.getPath()) {
                            Path.Builder pbPathBuilder = Path.newBuilder();
                            List<SegmentType> soapSegmentTypes = soapPathType.getSegment();
                            /*
                                SOAP `segment` elements effectively constitute a list. As such have have an implied
                                order. However for some reason they have an explicit `order` attribute that defines
                                their order. The protobuf version of `Segment` intentionally does not have this
                                attribute. Instead it relies on the implied order of list elements. The presence of the
                                `order` attribute however, *suggests* the SOAP `segment` elements might not be ordered
                                based on the order they appear in. Hence we order them explicitely so that their order
                                is the order of appearance, fullfilling the implicit ordering in the protobuf version.
                             */
                            soapSegmentTypes.sort(Comparator.comparing(SegmentType::getOrder));
                            for (SegmentType soapSegmentType : soapSegmentTypes) {
                                Segment.Builder pbSegmentBuilder = Segment.newBuilder().setId(soapSegmentType.getId())
                                        .setConnectionId(soapSegmentType.getConnectionId());
                                List<StpType> soapStpTypes = soapSegmentType.getStp();
                                /*
                                    Similarly to SOAP `segment` elements, SOAP `stp` elements, alhough being part of a
                                    list, have an explicit `order` attribute. Suggesting they might not be ordered
                                    based on their order of appearance. The protobuf version does rely on the order
                                    of appearance, hence we sort them first.
                                 */
                                soapStpTypes.sort(Comparator.comparing(StpType::getOrder));
                                pbSegmentBuilder.addAllStps(soapStpTypes.stream().map(StpType::getValue)
                                        .collect(Collectors.toList()));
                                pbPathBuilder.addSegment(pbSegmentBuilder);
                            }
                            pbPathTraceBuilder.addPaths(pbPathBuilder);
                        }
                        pbHeaderBuilder.setPathTrace(pbPathTraceBuilder);
                    }
                }
            }

            // Build body
            ReserveRequest.Builder pbReserveRequestBuilder = ReserveRequest.newBuilder().setHeader(pbHeaderBuilder);
            if (connectionId.value != null) {
                pbReserveRequestBuilder.setConnectionId(connectionId.value);
            }
            if (globalReservationId != null) {
                pbReserveRequestBuilder.setGlobalReservationId(globalReservationId);
            }
            if (description != null) {
                pbReserveRequestBuilder.setDescription(description);
            }

            // ReservationRequestCriteria
            ReservationRequestCriteria.Builder pbReservationRequestCriteriaBuilder = ReservationRequestCriteria
                    .newBuilder().setVersion(criteria.getVersion());

            // Schedule
            if (criteria.getSchedule() != null) {
                Schedule.Builder pbScheduleBuilder = Schedule.newBuilder();
                if (criteria.getSchedule().getStartTime() != null) {
                    pbScheduleBuilder.setStartTime(Timestamps.parse(criteria.getSchedule().getStartTime().getValue()
                            .format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)));
                }
                if (criteria.getSchedule().getEndTime() != null) {
                    pbScheduleBuilder.setEndTime(Timestamps.parse(criteria.getSchedule().getEndTime().getValue()
                            .format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)));
                }
                pbReservationRequestCriteriaBuilder.setSchedule(pbScheduleBuilder);
            }
            if (criteria.getServiceType() != null) {
                pbReservationRequestCriteriaBuilder.setServiceType(criteria.getServiceType());
            }

            // Point2PointService
            for (Object elem : criteria.getAny()) {
                /*
                    Contrary to the processing of the `pathTrace` element in the header, that was not referenced in
                    any of the WSDLs, and had to be mapped separately using JAXB, the P2PService _is_ referenced
                    from the WSDLs. This means that a Java class instance will be automatically created for us by the
                     `wsdl2java` generated code, but we still need to extract is from a wrapper `JAXBElement` instance.
                     In other words we don't have to explicitely unmarshall it as we had to with `pathTrace`.
                 */
                if (elem instanceof JAXBElement) {
                    JAXBElement<?> bodyElem = (JAXBElement<?>) elem;
                    if (bodyElem.getValue() instanceof P2PServiceBaseType) {
                        P2PServiceBaseType soapP2PService = (P2PServiceBaseType) bodyElem.getValue();

                        // Now we build the protobuf version of it.
                        PointToPointService.Builder pbP2PServiceBuilder = PointToPointService.newBuilder()
                                .setCapacity(soapP2PService.getCapacity());
                        if (soapP2PService.getDirectionality() != null) {
                            Directionality directionality = null;
                            switch (soapP2PService.getDirectionality()) {
                                case BIDIRECTIONAL:
                                    directionality = Directionality.BI_DIRECTIONAL;
                                    break;
                                case UNIDIRECTIONAL:
                                    directionality = Directionality.UNI_DIRECTIONAL;
                                    break;
                            }
                            pbP2PServiceBuilder.setDirectionality(directionality);
                        }

                        pbP2PServiceBuilder.setSymmetricPath(soapP2PService.isSymmetricPath())
                                .setSourceStp(soapP2PService.getSourceSTP()).setDestStp(soapP2PService.getDestSTP());

                        if (soapP2PService.getEro() != null) {
                            List<OrderedStpType> soapOrderedSTP = soapP2PService.getEro().getOrderedSTP();
                            soapOrderedSTP.sort(Comparator.comparing(OrderedStpType::getOrder));
                            pbP2PServiceBuilder.addAllEros(soapOrderedSTP.stream().map(OrderedStpType::getStp)
                                    .collect(Collectors.toList()));
                        }
                        if (soapP2PService.getParameter() != null) {
                            pbP2PServiceBuilder.putAllParameters(soapP2PService.getParameter().stream()
                                    .collect(Collectors.toMap(p -> p.getType(), p -> p.getValue())));
                            pbReservationRequestCriteriaBuilder.setPtps(pbP2PServiceBuilder);
                        }
                    }
                }
            }
            pbReserveRequestBuilder.setCriteria(pbReservationRequestCriteriaBuilder);
            LOG.info("Built protobuf message: ReserveRequest: " + pbReserveRequestBuilder.toString());
            ReserveResponse pbReserveResponse = connectionProviderStub.reserve(pbReserveRequestBuilder.build());
            connectionId.value = pbReserveResponse.getConnectionId();
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new ServiceException(ex.toString());
        }
    }

    /* (non-Javadoc)
     * @see nl.surf.polynsi.soap.connection.provider.ConnectionProviderPort#queryResultSync(java.lang.String connectionId, java.lang.Long startResultId, java.lang.Long endResultId, nl.surf.polynsi.soap.framework.headers.CommonHeaderType header)*
     */
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-04-27T16:21:07.875+02:00")
    public java.util.List<nl.surf.polynsi.soap.connection.types.QueryResultResponseType> queryResultSync(java.lang.String connectionId, java.lang.Long startResultId, java.lang.Long endResultId, javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header) throws Error {
        LOG.info("Executing operation queryResultSync");
        System.out.println(connectionId);
        System.out.println(startResultId);
        System.out.println(endResultId);
        System.out.println(header.value);
        try {
            java.util.List<nl.surf.polynsi.soap.connection.types.QueryResultResponseType> _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new Error("error...");
    }

    /* (non-Javadoc)
     * @see nl.surf.polynsi.soap.connection.provider.ConnectionProviderPort#release(java.lang.String connectionId, nl.surf.polynsi.soap.framework.headers.CommonHeaderType header)*
     */
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-04-27T16:21:07.875+02:00")
    public void release(java.lang.String connectionId, javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header) throws ServiceException {
        LOG.info("Executing operation release");
        System.out.println(connectionId);
        System.out.println(header.value);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see nl.surf.polynsi.soap.connection.provider.ConnectionProviderPort#reserveAbort(java.lang.String connectionId, nl.surf.polynsi.soap.framework.headers.CommonHeaderType header)*
     */
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-04-27T16:21:07.875+02:00")
    public void reserveAbort(java.lang.String connectionId, javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header) throws ServiceException {
        LOG.info("Executing operation reserveAbort");
        System.out.println(connectionId);
        System.out.println(header.value);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see nl.surf.polynsi.soap.connection.provider.ConnectionProviderPort#querySummary(nl.surf.polynsi.soap.connection.types.QueryType querySummary, nl.surf.polynsi.soap.framework.headers.CommonHeaderType header)*
     */
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-04-27T16:21:07.875+02:00")
    public nl.surf.polynsi.soap.connection.types.GenericAcknowledgmentType querySummary(nl.surf.polynsi.soap.connection.types.QueryType querySummary, javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header) throws ServiceException {
        LOG.info("Executing operation querySummary");
        System.out.println(querySummary);
        System.out.println(header.value);
        try {
            nl.surf.polynsi.soap.connection.types.GenericAcknowledgmentType _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see nl.surf.polynsi.soap.connection.provider.ConnectionProviderPort#queryResult(java.lang.String connectionId, java.lang.Long startResultId, java.lang.Long endResultId, nl.surf.polynsi.soap.framework.headers.CommonHeaderType header)*
     */
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-04-27T16:21:07.875+02:00")
    public void queryResult(java.lang.String connectionId, java.lang.Long startResultId, java.lang.Long endResultId, javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header) throws ServiceException {
        LOG.info("Executing operation queryResult");
        System.out.println(connectionId);
        System.out.println(startResultId);
        System.out.println(endResultId);
        System.out.println(header.value);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see nl.surf.polynsi.soap.connection.provider.ConnectionProviderPort#queryNotificationSync(nl.surf.polynsi.soap.connection.types.QueryNotificationType queryNotificationSync, nl.surf.polynsi.soap.framework.headers.CommonHeaderType header)*
     */
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-04-27T16:21:07.875+02:00")
    public nl.surf.polynsi.soap.connection.types.QueryNotificationConfirmedType queryNotificationSync(nl.surf.polynsi.soap.connection.types.QueryNotificationType queryNotificationSync, javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header) throws Error {
        LOG.info("Executing operation queryNotificationSync");
        System.out.println(queryNotificationSync);
        System.out.println(header.value);
        try {
            nl.surf.polynsi.soap.connection.types.QueryNotificationConfirmedType _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new Error("error...");
    }

}
