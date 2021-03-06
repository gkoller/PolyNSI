/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package nl.surf.polynsi.soap.connection.provider;

import com.google.protobuf.util.Timestamps;
import net.devh.boot.grpc.client.inject.GrpcClient;
import nl.surf.polynsi.ConverterException;
import nl.surf.polynsi.soap.services.p2p.P2PServiceBaseType;
import nl.surf.polynsi.soap.services.types.OrderedStpType;
import nl.surf.polynsi.soap.services.types.TypeValueType;
import org.ogf.nsi.grpc.connection.common.Header;
import org.ogf.nsi.grpc.connection.common.Schedule;
import org.ogf.nsi.grpc.connection.provider.*;
import org.ogf.nsi.grpc.services.Directionality;
import org.ogf.nsi.grpc.services.PointToPointService;

import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import static nl.surf.polynsi.Converter.toProtobuf;

/**
 * This class was generated by Apache CXF 3.3.5
 * 2020-04-27T16:21:07.875+02:00
 * Generated source version: 3.3.5
 */

@javax.jws.WebService(serviceName = "ConnectionServiceProvider", portName = "ConnectionServiceProviderPort", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/provider", wsdlLocation = "wsdl/connection/ogf_nsi_connection_provider_v2_0.wsdl", endpointInterface = "nl.surf.polynsi.soap.connection.provider.ConnectionProviderPort")
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
    public void reserveCommit(java.lang.String connectionId,
                              javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> soapHeader) throws ServiceException {
        LOG.info("Executing operation `reserveCommit`");
        try {
            Header pbHeader = toProtobuf(soapHeader.value);
            ReserveCommitRequest pbReserveCommitRequest = ReserveCommitRequest.newBuilder().setHeader(pbHeader)
                    .setConnectionId(connectionId).build();

            LOG.info("Built protobuf message `ReserveCommitRequest`: " + pbReserveCommitRequest.toString());
            ReserveCommitResponse pbReserveCommitResponse = connectionProviderStub
                    .reserveCommit(pbReserveCommitRequest);
        } catch (ConverterException ex) {
            ex.printStackTrace();
            throw new ServiceException(ex.toString());
        }
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
    public void reserve(javax.xml.ws.Holder<java.lang.String> connectionId, java.lang.String globalReservationId,
                        java.lang.String description,
                        nl.surf.polynsi.soap.connection.types.ReservationRequestCriteriaType soapCriteria,
                        javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> soapHeader) throws ServiceException {
        LOG.info("Executing operation `reserve`");

        try {
            Header pbHeader = toProtobuf(soapHeader.value);
            ReserveRequest.Builder pbReserveRequestBuilder = ReserveRequest.newBuilder().setHeader(pbHeader);
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
                    .newBuilder().setVersion(soapCriteria.getVersion());

            // Schedule
            if (soapCriteria.getSchedule() != null) {
                Schedule.Builder pbScheduleBuilder = Schedule.newBuilder();
                if (soapCriteria.getSchedule().getStartTime() != null) {
                    pbScheduleBuilder.setStartTime(Timestamps.parse(soapCriteria.getSchedule().getStartTime()
                            .format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)));
                }
                if (soapCriteria.getSchedule().getEndTime() != null) {
                    pbScheduleBuilder.setEndTime(Timestamps.parse(soapCriteria.getSchedule().getEndTime()
                            .format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)));
                }
                pbReservationRequestCriteriaBuilder.setSchedule(pbScheduleBuilder);
            }
            if (soapCriteria.getServiceType() != null) {
                pbReservationRequestCriteriaBuilder.setServiceType(soapCriteria.getServiceType());
            }

            // Point2PointService
            for (Object elem : soapCriteria.getAny()) {
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

                        /*  TODO Need to test each of the following SOAP elements for null. As some might not be set
                            in case of an Reserve message update. An update generally only specifies a subset. Eg
                            the initial Reservation included the wrong bandwidth. The update Reserve message will then
                            only specifies the bandwidth (with the correct value).
                         */
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
                                    .collect(Collectors.toMap(TypeValueType::getType, TypeValueType::getValue)));
                            pbReservationRequestCriteriaBuilder.setPtps(pbP2PServiceBuilder);
                        }
                    }
                }
            }
            pbReserveRequestBuilder.setCriteria(pbReservationRequestCriteriaBuilder);
            LOG.info("Built protobuf message `ReserveRequest`: " + pbReserveRequestBuilder.toString());
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
    public void reserveAbort(java.lang.String connectionId,
                             javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> soapHeader) throws ServiceException {
        LOG.info("Executing operation `reserveAbort`");
        try {
            Header pbHeader = toProtobuf(soapHeader.value);
            ReserveAbortRequest pbReserveAbortRequest = ReserveAbortRequest.newBuilder().setHeader(pbHeader)
                    .setConnectionId(connectionId).build();

            LOG.info("Built protobuf message `ReserveAbortRequest`: " + pbReserveAbortRequest.toString());
            ReserveAbortResponse pbReserveCommitResponse = connectionProviderStub
                    .reserveAbort(pbReserveAbortRequest);
        } catch (ConverterException ex) {
            ex.printStackTrace();
            throw new ServiceException(ex.toString());
        }
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
