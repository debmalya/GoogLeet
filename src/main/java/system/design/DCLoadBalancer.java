package system.design;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Design a simple load distributor for a data center that can do the following:
 * 
 * Add and remove machines from the cluster. Add applications to run on a
 * machine. Stop applications that are running on a machine. Return a list of
 * the applications running on a machine.
 * 
 * @author DJash
 *
 */
public class DCLoadBalancer {

	// Key is machine id , and value is its capacity.
	Map<Integer, Integer> machineMap;

	/**
	 * DCLoadBalancer() Initializes the object.
	 */
	public DCLoadBalancer() {
		machineMap = new HashMap<>();
	}

	/**
	 * Registers a machine with the given machineId and maximum capacity.
	 * 
	 * @param machineId
	 * @param capacity
	 */
	public void addMachine(int machineId, int capacity) {
		machineMap.put(machineId, capacity);
	}

	/**
	 * Removes the machine with the given machineId. All applications running on
	 * this machine are automatically reallocated to other machines in the same
	 * order as they were added to this machine. The applications should be
	 * reallocated in the same manner as addApplication.
	 * 
	 * @param machineId
	 */
	public void removeMachine(int machineId) {

	}

	/**
	 * Allocates an application with the given appId and loadUse to the machine with
	 * the largest remaining capacity that can handle the additional request. If
	 * there is a tie, the machine with the lowest ID is used. Returns the machine
	 * ID that the application is allocated to. If no machine can handle the
	 * request, return -1.
	 * 
	 * @param appId
	 * @param loadUse
	 * @return
	 */
	public int addApplication(int appId, int loadUse) {
		return 0;

	}

	/**
	 * Stops and removes the application with the given appId from the machine it is
	 * running on, freeing up the machine's capacity by its corresponding loadUse.
	 * If the application does not exist, nothing happens.
	 * 
	 * @param appId
	 */
	public void stopApplication(int appId) {

	}

	/**
	 * Returns a list of application IDs running on a machine with the given
	 * machineId in the order in which they were added. If there are more than 10
	 * applications, return only the first 10 IDs.
	 * 
	 * @param machineId
	 * @return
	 */
	public List<Integer> getApplications(int machineId) {
		return null;

	}

}
