package dfrs.server;

import javax.xml.ws.Endpoint;
/*
wsgen -verbose -cp . dfrs.server.DFRSServerMTL -wsdl
wsgen -verbose -cp . dfrs.server.DFRSServerWST -wsdl
wsgen -verbose -cp . dfrs.server.DFRSServerNDL -wsdl
wsimport -keep -d . -p dfrs.client http://localhost:1050/dfrs?wsdl
wsimport -keep -d . -p dfrs.client http://localhost:1051/dfrs?wsdl
wsimport -keep -d . -p dfrs.client http://localhost:1052/dfrs?wsdl
 */
public class Publish {
	public static void main(String[] args) {
		DFRSServerMTL i1 = new DFRSServerMTL();
		i1.InitDFRSServiceImple(DFRSServerMTL.SERVER_NAME, DFRSServerMTL.NAME, DFRSServerMTL.UDP_PORT_NUM,
				DFRSServerMTL.T_UDP_PORT_NUM);
		Endpoint endpoint = Endpoint.publish("http://localhost:" + DFRSServerMTL.PORT_NUM + "/dfrs", i1);
		System.out.println(DFRSServerMTL.NAME + " server start " + endpoint.isPublished());

		DFRSServerWST i2 = new DFRSServerWST();
		i2.InitDFRSServiceImple(DFRSServerWST.SERVER_NAME, DFRSServerWST.NAME, DFRSServerWST.UDP_PORT_NUM,
				DFRSServerWST.T_UDP_PORT_NUM);
		endpoint = Endpoint.publish("http://localhost:" + DFRSServerWST.PORT_NUM + "/dfrs", i2);
		System.out.println(DFRSServerWST.NAME + " server start " + endpoint.isPublished());

		DFRSServerNDL i3 = new DFRSServerNDL();
		i3.InitDFRSServiceImple(DFRSServerNDL.SERVER_NAME, DFRSServerNDL.NAME, DFRSServerNDL.UDP_PORT_NUM,
						DFRSServerNDL.T_UDP_PORT_NUM);
		endpoint = Endpoint.publish("http://localhost:" + DFRSServerNDL.PORT_NUM + "/dfrs", i3);
		System.out.println(DFRSServerNDL.NAME + " server start " + endpoint.isPublished());
	}
}
