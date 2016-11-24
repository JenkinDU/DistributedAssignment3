package dfrs.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

import dfrs.bean.Result;

@WebService
//@SOAPBinding(style=Style.RPC)
public interface IDFRSService {
	@WebMethod
	public Result transferReservation(int passengerID, String currentCity, String otherCity);
	@WebMethod
	public Result bookFlight(String firstName, String lastName, String address, String phone, String destination,
			String date, String ticketClass);
	@WebMethod
	public String getBookedFlightCount(String recordType);
	@WebMethod
	public Result editFlightRecord(int recordID, String fieldName, String newValue);
	@WebMethod
	public String getAllFlightInfo();
}
