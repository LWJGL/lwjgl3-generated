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
			PCIE_UNUSED,
			PCIE_BUS,
			PCIE_DEVICE,
			PCIE_FUNCTION;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(9);

		SIZEOF = offsets(memAddress(offsets));

		RAW = offsets.get(0);
			RAW_TYPE = offsets.get(1);
			RAW_DATA = offsets.get(2);
		PCIE = offsets.get(3);
			PCIE_TYPE = offsets.get(4);
			PCIE_UNUSED = offsets.get(5);
			PCIE_BUS = offsets.get(6);
			PCIE_DEVICE = offsets.get(7);
			PCIE_FUNCTION = offsets.get(8);
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

	public void setRawType(int type) { rawType(struct, type); }
	public void setRawData(long data, int bytes) { rawDataSet(struct, data, bytes); }
	public void setRawData(ByteBuffer data) { rawDataSet(struct, data); }
	public void setPcieType(int type) { pcieType(struct, type); }
	public void setPcieUnused(long unused, int bytes) { pcieUnusedSet(struct, unused, bytes); }
	public void setPcieUnused(ByteBuffer unused) { pcieUnusedSet(struct, unused); }
	public void setPcieBus(int bus) { pcieBus(struct, bus); }
	public void setPcieDevice(int device) { pcieDevice(struct, device); }
	public void setPcieFunction(int function) { pcieFunction(struct, function); }

	public int getRawType() { return rawType(struct); }
	public void getRawData(long data, int bytes) { rawDataGet(struct, data, bytes); }
	public void getRawData(ByteBuffer data) { rawDataGet(struct, data); }
	public int getPcieType() { return pcieType(struct); }
	public void getPcieUnused(long unused, int bytes) { pcieUnusedGet(struct, unused, bytes); }
	public void getPcieUnused(ByteBuffer unused) { pcieUnusedGet(struct, unused); }
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
		long raw_data,
		int raw_dataBytes,
		int pcie_type,
		long pcie_unused,
		int pcie_unusedBytes,
		int pcie_bus,
		int pcie_device,
		int pcie_function
	) {
		ByteBuffer cl_device_topology_amd = malloc();

		rawType(cl_device_topology_amd, raw_type);
		rawDataSet(cl_device_topology_amd, raw_data, raw_dataBytes);
		pcieType(cl_device_topology_amd, pcie_type);
		pcieUnusedSet(cl_device_topology_amd, pcie_unused, pcie_unusedBytes);
		pcieBus(cl_device_topology_amd, pcie_bus);
		pcieDevice(cl_device_topology_amd, pcie_device);
		pcieFunction(cl_device_topology_amd, pcie_function);

		return cl_device_topology_amd;
	}

	/** Alternative virtual constructor. */
	public static ByteBuffer malloc(
		int raw_type,
		ByteBuffer raw_data,
		int pcie_type,
		ByteBuffer pcie_unused,
		int pcie_bus,
		int pcie_device,
		int pcie_function
	) {
		ByteBuffer cl_device_topology_amd = malloc();

		rawType(cl_device_topology_amd, raw_type);
		rawDataSet(cl_device_topology_amd, raw_data);
		pcieType(cl_device_topology_amd, pcie_type);
		pcieUnusedSet(cl_device_topology_amd, pcie_unused);
		pcieBus(cl_device_topology_amd, pcie_bus);
		pcieDevice(cl_device_topology_amd, pcie_device);
		pcieFunction(cl_device_topology_amd, pcie_function);

		return cl_device_topology_amd;
	}

	public static void rawType(ByteBuffer cl_device_topology_amd, int type) { cl_device_topology_amd.putInt(cl_device_topology_amd.position() + RAW_TYPE, type); }
	public static void rawDataSet(ByteBuffer cl_device_topology_amd, long data, int bytes) { memCopy(data, memAddress(cl_device_topology_amd) + RAW_DATA, bytes); }
	public static void rawDataSet(ByteBuffer cl_device_topology_amd, ByteBuffer data) {
		checkBufferGT(data, 5 * 4);
		rawDataSet(cl_device_topology_amd, memAddress(data), data.remaining());
	}
	public static void pcieType(ByteBuffer cl_device_topology_amd, int type) { cl_device_topology_amd.putInt(cl_device_topology_amd.position() + PCIE_TYPE, type); }
	public static void pcieUnusedSet(ByteBuffer cl_device_topology_amd, long unused, int bytes) { memCopy(unused, memAddress(cl_device_topology_amd) + PCIE_UNUSED, bytes); }
	public static void pcieUnusedSet(ByteBuffer cl_device_topology_amd, ByteBuffer unused) {
		checkBufferGT(unused, 17 * 1);
		pcieUnusedSet(cl_device_topology_amd, memAddress(unused), unused.remaining());
	}
	public static void pcieBus(ByteBuffer cl_device_topology_amd, int bus) { cl_device_topology_amd.put(cl_device_topology_amd.position() + PCIE_BUS, (byte)bus); }
	public static void pcieDevice(ByteBuffer cl_device_topology_amd, int device) { cl_device_topology_amd.put(cl_device_topology_amd.position() + PCIE_DEVICE, (byte)device); }
	public static void pcieFunction(ByteBuffer cl_device_topology_amd, int function) { cl_device_topology_amd.put(cl_device_topology_amd.position() + PCIE_FUNCTION, (byte)function); }

	public static int rawType(ByteBuffer cl_device_topology_amd) { return cl_device_topology_amd.getInt(cl_device_topology_amd.position() + RAW_TYPE); }
	public static void rawDataGet(ByteBuffer cl_device_topology_amd, long data, int bytes) {
		memCopy(memAddress(cl_device_topology_amd) + RAW_DATA, data, bytes);
	}
	public static void rawDataGet(ByteBuffer cl_device_topology_amd, ByteBuffer data) {
		checkBufferGT(data, 5 * 4);
		rawDataGet(cl_device_topology_amd, memAddress(data), data.remaining());
	}
	public static int pcieType(ByteBuffer cl_device_topology_amd) { return cl_device_topology_amd.getInt(cl_device_topology_amd.position() + PCIE_TYPE); }
	public static void pcieUnusedGet(ByteBuffer cl_device_topology_amd, long unused, int bytes) {
		memCopy(memAddress(cl_device_topology_amd) + PCIE_UNUSED, unused, bytes);
	}
	public static void pcieUnusedGet(ByteBuffer cl_device_topology_amd, ByteBuffer unused) {
		checkBufferGT(unused, 17 * 1);
		pcieUnusedGet(cl_device_topology_amd, memAddress(unused), unused.remaining());
	}
	public static int pcieBus(ByteBuffer cl_device_topology_amd) { return cl_device_topology_amd.get(cl_device_topology_amd.position() + PCIE_BUS); }
	public static int pcieDevice(ByteBuffer cl_device_topology_amd) { return cl_device_topology_amd.get(cl_device_topology_amd.position() + PCIE_DEVICE); }
	public static int pcieFunction(ByteBuffer cl_device_topology_amd) { return cl_device_topology_amd.get(cl_device_topology_amd.position() + PCIE_FUNCTION); }

}