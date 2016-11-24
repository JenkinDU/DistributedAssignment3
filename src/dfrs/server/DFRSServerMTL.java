package dfrs.server;

import javax.jws.WebService;

@WebService(endpointInterface="dfrs.server.IDFRSService",
serviceName="DFRSServerMTLService",
portName="DFRSServerMTLPort",
targetNamespace="http://server.dfrs")
public class DFRSServerMTL extends DFRSServiceImple {
	public static final String SERVER_NAME = "MTL";
	public static final String NAME = "Montreal";
	public static final String PORT_NUM = "1050";
	public static final int UDP_PORT_NUM = 3020;
	public static final int T_UDP_PORT_NUM = 4020;
}
