/**
 ******************************************************************************
 *
 * @file       uavobjecttemplate.cpp
 * @author     The OpenPilot Team, http://www.openpilot.org Copyright (C) 2010.
 * @brief      Template for an uavobject in java
 *             This is a autogenerated file!! Do not modify and expect a result.
 *             Object Storing Debugging Information on PID internals
 *
 * @see        The GNU Public License (GPL) Version 3
 *
 *****************************************************************************/
/*
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 * for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */

package org.openpilot.uavtalk.uavobjects;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.openpilot.uavtalk.UAVObjectManager;
import org.openpilot.uavtalk.UAVObject;
import org.openpilot.uavtalk.UAVDataObject;
import org.openpilot.uavtalk.UAVObjectField;

/**
Object Storing Debugging Information on PID internals

generated from fixedwingpathfollowerstatus.xml
 **/
public class FixedWingPathFollowerStatus extends UAVDataObject {

	public FixedWingPathFollowerStatus() {
		super(OBJID, ISSINGLEINST, ISSETTINGS, NAME);
		
		List<UAVObjectField> fields = new ArrayList<UAVObjectField>();
		

		List<String> EElemNames = new ArrayList<String>();
		EElemNames.add("Course");
		EElemNames.add("Speed");
		EElemNames.add("Accel");
		EElemNames.add("Power");
		fields.add( new UAVObjectField("E", "", UAVObjectField.FieldType.FLOAT32, EElemNames, null) );

		List<String> AElemNames = new ArrayList<String>();
		AElemNames.add("Course");
		AElemNames.add("Speed");
		AElemNames.add("Accel");
		AElemNames.add("Power");
		fields.add( new UAVObjectField("A", "", UAVObjectField.FieldType.FLOAT32, AElemNames, null) );

		List<String> CElemNames = new ArrayList<String>();
		CElemNames.add("Course");
		CElemNames.add("Speed");
		CElemNames.add("Accel");
		CElemNames.add("Power");
		fields.add( new UAVObjectField("C", "", UAVObjectField.FieldType.FLOAT32, CElemNames, null) );

		List<String> ErrorsElemNames = new ArrayList<String>();
		ErrorsElemNames.add("Wind");
		ErrorsElemNames.add("Lowspeed");
		ErrorsElemNames.add("Highspeed");
		ErrorsElemNames.add("Lowpower");
		ErrorsElemNames.add("Highpower");
		ErrorsElemNames.add("Pitchcontrol");
		fields.add( new UAVObjectField("Errors", "", UAVObjectField.FieldType.UINT8, ErrorsElemNames, null) );


		// Compute the number of bytes for this object
		int numBytes = 0;
		ListIterator<UAVObjectField> li = fields.listIterator();
		while(li.hasNext()) {
			numBytes += li.next().getNumBytes();
		}
		NUMBYTES = numBytes;

		// Initialize object
		initializeFields(fields, ByteBuffer.allocate(NUMBYTES), NUMBYTES);
		// Set the default field values
		setDefaultFieldValues();
		// Set the object description
		setDescription(DESCRIPTION);
	}

	/**
	 * Create a Metadata object filled with default values for this object
	 * @return Metadata object with default values
	 */
	public Metadata getDefaultMetadata() {
		UAVObject.Metadata metadata = new UAVObject.Metadata();
    	metadata.flags =
		    UAVObject.Metadata.AccessModeNum(UAVObject.AccessMode.ACCESS_READWRITE) << UAVOBJ_ACCESS_SHIFT |
		    UAVObject.Metadata.AccessModeNum(UAVObject.AccessMode.ACCESS_READWRITE) << UAVOBJ_GCS_ACCESS_SHIFT |
		    0 << UAVOBJ_TELEMETRY_ACKED_SHIFT |
		    0 << UAVOBJ_GCS_TELEMETRY_ACKED_SHIFT |
		    UAVObject.Metadata.UpdateModeNum(UAVObject.UpdateMode.UPDATEMODE_PERIODIC) << UAVOBJ_TELEMETRY_UPDATE_MODE_SHIFT |
		    UAVObject.Metadata.UpdateModeNum(UAVObject.UpdateMode.UPDATEMODE_MANUAL) << UAVOBJ_GCS_TELEMETRY_UPDATE_MODE_SHIFT;
    	metadata.flightTelemetryUpdatePeriod = 500;
    	metadata.gcsTelemetryUpdatePeriod = 0;
    	metadata.loggingUpdatePeriod = 0;
 
		return metadata;
	}

	/**
	 * Initialize object fields with the default values.
	 * If a default value is not specified the object fields
	 * will be initialized to zero.
	 */
	public void setDefaultFieldValues()
	{

	}

	/**
	 * Create a clone of this object, a new instance ID must be specified.
	 * Do not use this function directly to create new instances, the
	 * UAVObjectManager should be used instead.
	 */
	public UAVDataObject clone(int instID) {
		// TODO: Need to get specific instance to clone
		try {
			FixedWingPathFollowerStatus obj = new FixedWingPathFollowerStatus();
			obj.initialize(instID, this.getMetaObject());
			return obj;
		} catch  (Exception e) {
			return null;
		}
	}

	/**
	 * Static function to retrieve an instance of the object.
	 */
	public FixedWingPathFollowerStatus GetInstance(UAVObjectManager objMngr, int instID)
	{
	    return (FixedWingPathFollowerStatus)(objMngr.getObject(FixedWingPathFollowerStatus.OBJID, instID));
	}

	// Constants
	protected static final int OBJID = 0xA0D6F6D4;
	protected static final String NAME = "FixedWingPathFollowerStatus";
	protected static String DESCRIPTION = "Object Storing Debugging Information on PID internals";
	protected static final boolean ISSINGLEINST = 1 == 1;
	protected static final boolean ISSETTINGS = 0 == 1;
	protected static int NUMBYTES = 0;


}