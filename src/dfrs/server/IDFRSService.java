package dfrs.server;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import dfrs.bean.Result;

@WebService
@SOAPBinding(style=Style.RPC)
public interface IDFRSService {
	public Result transferReservation(int passengerID, String currentCity, String otherCity);
	public Result bookFlight(String firstName, String lastName, String address, String phone, String destination,
			String date, String ticketClass);
	public String getBookedFlightCount(String recordType);
	public Result editFlightRecord(int recordID, String fieldName, String newValue);
	public String getAllFlightInfo();
}
