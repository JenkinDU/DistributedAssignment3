package dfrs.server;

import javax.jws.WebService;

@WebService(endpointInterface="dfrs.server.IDFRSService",
serviceName="DFRSServerWSTService",
portName="DFRSServerWSTPort",
targetNamespace="http://server.dfrs")
public class DFRSServerWST extends DFRSServiceImple {
	public static final String SERVER_NAME = "WST";
	public static final String NAME = "Washington";
	public static final String PORT_NUM = "1051";
	public static final int UDP_PORT_NUM = 3021;
	public static final int T_UDP_PORT_NUM = 4021;
}
