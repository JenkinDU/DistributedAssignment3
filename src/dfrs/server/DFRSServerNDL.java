package dfrs.server;

import javax.jws.WebService;

@WebService(endpointInterface="dfrs.server.IDFRSService",
serviceName="DFRSServerNDLService",
portName="DFRSServerNDLPort",
targetNamespace="http://server.dfrs")
public class DFRSServerNDL extends DFRSServiceImple {
	public static final String SERVER_NAME = "NDL";
	public static final String NAME = "New Delhi";
	public static final String PORT_NUM = "1052";
	public static final int UDP_PORT_NUM = 3022;
	public static final int T_UDP_PORT_NUM = 4022;
}
