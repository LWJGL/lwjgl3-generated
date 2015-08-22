/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** The struct returned by {@link CL10#clGetDeviceInfo} with {@code param_name} set to {@link AMDDeviceTopology#CL_DEVICE_TOPOLOGY_AMD}. */
public final class CLDeviceTopologyAMD implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		RAW,
			RAW_TYPE,
			RAW_DATA,
		PCIE,
			PCIE_TYPE,
			PCIE_BUS,
			PCIE_DEVICE,
			PCIE_FUNCTION;

	static {
		IntBuffer offsets = memAllocInt(8);

		SIZEOF = offsets(memAddress(offsets));

		RAW = offsets.get(0);
			RAW_TYPE = offsets.get(1);
			RAW_DATA = offsets.get(2);
		PCIE = offsets.get(3);
			PCIE_TYPE = offsets.get(4);
			PCIE_BUS = offsets.get(5);
			PCIE_DEVICE = offsets.get(6);
			PCIE_FUNCTION = offsets.get(7);

		memFree(offsets);
	}

	private final ByteBuffer struct;

	public CLDeviceTopologyAMD() {
		this(malloc());
	}

	public CLDeviceTopologyAMD(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);

		this.struct = struct;
	}

	public ByteBuffer buffer() {
		return struct;
	}

	@Override
	public long getPointer() {
		return memAddress(struct);
	}

	public CLDeviceTopologyAMD setRawType(int type) { rawType(struct, type); return this; }
	public CLDeviceTopologyAMD setRawData(ByteBuffer data) { rawDataSet(struct, data); return this; }
	public CLDeviceTopologyAMD setRawData(int index, int data) { rawData(struct, index, data); return this; }
	public CLDeviceTopologyAMD setPcieType(int type) { pcieType(struct, type); return this; }
	public CLDeviceTopologyAMD setPcieBus(int bus) { pcieBus(struct, bus); return this; }
	public CLDeviceTopologyAMD setPcieDevice(int device) { pcieDevice(struct, device); return this; }
	public CLDeviceTopologyAMD setPcieFunction(int function) { pcieFunction(struct, function); return this; }

	public int getRawType() { return rawType(struct); }
	public void getRawData(ByteBuffer data) { rawDataGet(struct, data); }
	public int getPcieType() { return pcieType(struct); }
	public int getPcieBus() { return pcieBus(struct); }
	public int getPcieDevice() { return pcieDevice(struct); }
	public int getPcieFunction() { return pcieFunction(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		int raw_type,
		ByteBuffer raw_data,
		int pcie_type,
		int pcie_bus,
		int pcie_device,
		int pcie_function
	) {
		ByteBuffer cl_device_topology_amd = malloc();

		rawType(cl_device_topology_amd, raw_type);
		rawDataSet(cl_device_topology_amd, raw_data);
		pcieType(cl_device_topology_amd, pcie_type);
		pcieBus(cl_device_topology_amd, pcie_bus);
		pcieDevice(cl_device_topology_amd, pcie_device);
		pcieFunction(cl_device_topology_amd, pcie_function);

		return cl_device_topology_amd;
	}

	public static void rawType(ByteBuffer cl_device_topology_amd, int type) { cl_device_topology_amd.putInt(cl_device_topology_amd.position() + RAW_TYPE, type); }
	public static void rawDataSet(ByteBuffer cl_device_topology_amd, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS ) {
			checkBufferGT(data, 5 * 4);
		}
		memCopy(memAddress(data), memAddress(cl_device_topology_amd) + RAW_DATA, data.remaining());
	}
	public static void rawData(ByteBuffer cl_device_topology_amd, int index, int data) { cl_device_topology_amd.putInt(RAW_DATA + index * 4, data); }
	public static void pcieType(ByteBuffer cl_device_topology_amd, int type) { cl_device_topology_amd.putInt(cl_device_topology_amd.position() + PCIE_TYPE, type); }
	public static void pcieBus(ByteBuffer cl_device_topology_amd, int bus) { cl_device_topology_amd.put(cl_device_topology_amd.position() + PCIE_BUS, (byte)bus); }
	public static void pcieDevice(ByteBuffer cl_device_topology_amd, int device) { cl_device_topology_amd.put(cl_device_topology_amd.position() + PCIE_DEVICE, (byte)device); }
	public static void pcieFunction(ByteBuffer cl_device_topology_amd, int function) { cl_device_topology_amd.put(cl_device_topology_amd.position() + PCIE_FUNCTION, (byte)function); }

	public static int rawType(ByteBuffer cl_device_topology_amd) { return cl_device_topology_amd.getInt(cl_device_topology_amd.position() + RAW_TYPE); }
	public static void rawDataGet(ByteBuffer cl_device_topology_amd, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(data, 5 * 4);
		memCopy(memAddress(cl_device_topology_amd) + RAW_DATA, memAddress(data), data.remaining());
	}
	public static int rawData(ByteBuffer cl_device_topology_amd, int index) {
		return cl_device_topology_amd.getInt(RAW_DATA + index * 4);
	}
	public static int pcieType(ByteBuffer cl_device_topology_amd) { return cl_device_topology_amd.getInt(cl_device_topology_amd.position() + PCIE_TYPE); }
	public static int pcieBus(ByteBuffer cl_device_topology_amd) { return cl_device_topology_amd.get(cl_device_topology_amd.position() + PCIE_BUS); }
	public static int pcieDevice(ByteBuffer cl_device_topology_amd) { return cl_device_topology_amd.get(cl_device_topology_amd.position() + PCIE_DEVICE); }
	public static int pcieFunction(ByteBuffer cl_device_topology_amd) { return cl_device_topology_amd.get(cl_device_topology_amd.position() + PCIE_FUNCTION); }

}