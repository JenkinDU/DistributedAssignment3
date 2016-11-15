package dfrs.server;

import javax.xml.ws.Endpoint;

public class Publish {
	public static void main(String[] args) {
		Endpoint endpoint = Endpoint.publish("http://localhost:" + DFRSServerMTL.PORT_NUM + "/dfrs",
				new DFRSServiceImple(DFRSServerMTL.SERVER_NAME, DFRSServerMTL.NAME, DFRSServerMTL.UDP_PORT_NUM,
						DFRSServerMTL.T_UDP_PORT_NUM));
		System.out.println(DFRSServerMTL.NAME + " server start " + endpoint.isPublished());

		endpoint = Endpoint.publish("http://localhost:" + DFRSServerWST.PORT_NUM + "/dfrs",
				new DFRSServiceImple(DFRSServerWST.SERVER_NAME, DFRSServerWST.NAME, DFRSServerWST.UDP_PORT_NUM,
						DFRSServerWST.T_UDP_PORT_NUM));
		System.out.println(DFRSServerWST.NAME + " server start " + endpoint.isPublished());

		endpoint = Endpoint.publish("http://localhost:" + DFRSServerNDL.PORT_NUM + "/dfrs",
				new DFRSServiceImple(DFRSServerNDL.SERVER_NAME, DFRSServerNDL.NAME, DFRSServerNDL.UDP_PORT_NUM,
						DFRSServerNDL.T_UDP_PORT_NUM));
		System.out.println(DFRSServerNDL.NAME + " server start " + endpoint.isPublished());
	}
}
