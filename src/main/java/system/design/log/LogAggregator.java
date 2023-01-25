package system.design.log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogAggregator {

	private int noOfMachines;
	private int noOfServices;

	// key machineId, value list of integer id (logId)
	private Map<Integer, List<Integer>> machinMessage;
	// key serviceId, value list of integer id (logId)
	private Map<Integer, List<Integer>> serviceMessage;
    // key integer id, String actual message
	private Map<Integer, String> messageMap = new HashMap<>();

	public LogAggregator(int machines, int services) {
		this.noOfMachines = machines;
		this.noOfServices = services;

		machinMessage = new HashMap<>(noOfMachines);
		serviceMessage = new HashMap<>(noOfServices);
	}

	/**
	 * Adds a log with id logId notifying that the machine machineId sent a string
	 * message while executing the service serviceId.
	 * 
	 * @param logId     - log message id.
	 * @param machineId - machine identification which sends the log message.
	 * @param serviceId - service id from which the message is generated.
	 * @param message   - actual log message.
	 */
	public void pushLog(int logId, int machineId, int serviceId, String message) {
		List<Integer> messagesForMachine = machinMessage.getOrDefault(machineId, new ArrayList<>());
		List<Integer> messagesForService = serviceMessage.getOrDefault(serviceId, new ArrayList<>());

		messageMap.put(logId, message);

		messagesForMachine.add(logId);
		machinMessage.put(machineId, messagesForMachine);

		messagesForService.add(logId);
		serviceMessage.put(serviceId, messagesForService);

	}

	/**
	 * 
	 * @param machineId
	 * @return messages for particular machine.
	 */
	public List<Integer> getLogsFromMachine(int machineId) {
		return machinMessage.getOrDefault(machineId,new ArrayList<>());
	}

	/**
	 * 
	 * @param serviceId
	 * @return messages for particular service id.
	 */
	public List<Integer> getLogsOfService(int serviceId) {
		return serviceMessage.getOrDefault(serviceId,new ArrayList<>());
	}

	/**
	 * 
	 * @param serviceId
	 * @param searchString
	 * @return
	 */
	public List<String> search(int serviceId, String searchString) {
		List<Integer> messagesForServiceId = serviceMessage.get(serviceId);
		List<String> matchingMessage = new ArrayList<>();

		if (messagesForServiceId != null && !messagesForServiceId.isEmpty()) {
			for (int index : messagesForServiceId) {
				String message = messageMap.get(index);
				if (message.contains(searchString)) {
					matchingMessage.add(message);

				}
			}
		}

		return matchingMessage;
	}

}
