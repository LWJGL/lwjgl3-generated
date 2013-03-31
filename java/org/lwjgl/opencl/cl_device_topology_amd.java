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
public final class cl_device_topology_amd {

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
		IntBuffer offsets = BufferUtils.createIntBuffer(2);

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

	private cl_device_topology_amd() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
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
		ByteBuffer struct = malloc();

		rawTypeSet(struct, raw_type);
		rawDataSet(struct, raw_data, raw_dataBytes);
		pcieTypeSet(struct, pcie_type);
		pcieUnusedSet(struct, pcie_unused, pcie_unusedBytes);
		pcieBusSet(struct, pcie_bus);
		pcieDeviceSet(struct, pcie_device);
		pcieFunctionSet(struct, pcie_function);

		return struct;
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
		ByteBuffer struct = malloc();

		rawTypeSet(struct, raw_type);
		rawDataSet(struct, raw_data);
		pcieTypeSet(struct, pcie_type);
		pcieUnusedSet(struct, pcie_unused);
		pcieBusSet(struct, pcie_bus);
		pcieDeviceSet(struct, pcie_device);
		pcieFunctionSet(struct, pcie_function);

		return struct;
	}

	public static void rawTypeSet(ByteBuffer struct, int type) { struct.putInt(struct.position() + RAW_TYPE, type); }
	public static void rawDataSet(ByteBuffer struct, long data, int bytes) { memCopy(data, memAddress(struct) + RAW_DATA, bytes); }
	public static void rawDataSet(ByteBuffer struct, ByteBuffer data) {
		checkBufferGT(data, 5 * 4);
		rawDataSet(struct, memAddress(data), data.remaining());
	}
	public static void pcieTypeSet(ByteBuffer struct, int type) { struct.putInt(struct.position() + PCIE_TYPE, type); }
	public static void pcieUnusedSet(ByteBuffer struct, long unused, int bytes) { memCopy(unused, memAddress(struct) + PCIE_UNUSED, bytes); }
	public static void pcieUnusedSet(ByteBuffer struct, ByteBuffer unused) {
		checkBufferGT(unused, 17 * 1);
		pcieUnusedSet(struct, memAddress(unused), unused.remaining());
	}
	public static void pcieBusSet(ByteBuffer struct, int bus) { struct.put(struct.position() + PCIE_BUS, (byte)bus); }
	public static void pcieDeviceSet(ByteBuffer struct, int device) { struct.put(struct.position() + PCIE_DEVICE, (byte)device); }
	public static void pcieFunctionSet(ByteBuffer struct, int function) { struct.put(struct.position() + PCIE_FUNCTION, (byte)function); }

	public static int rawTypeGet(ByteBuffer struct) { return struct.getInt(struct.position() + RAW_TYPE); }
	public static void rawDataGet(ByteBuffer struct, long data, int bytes) {
		memCopy(memAddress(struct) + RAW_DATA, data, bytes);
	}
	public static void rawDataGetb(ByteBuffer struct, ByteBuffer data) {
		checkBufferGT(data, 5 * 4);
		rawDataGet(struct, memAddress(data), data.remaining());
	}
	public static int pcieTypeGet(ByteBuffer struct) { return struct.getInt(struct.position() + PCIE_TYPE); }
	public static void pcieUnusedGet(ByteBuffer struct, long unused, int bytes) {
		memCopy(memAddress(struct) + PCIE_UNUSED, unused, bytes);
	}
	public static void pcieUnusedGetb(ByteBuffer struct, ByteBuffer unused) {
		checkBufferGT(unused, 17 * 1);
		pcieUnusedGet(struct, memAddress(unused), unused.remaining());
	}
	public static int pcieBusGet(ByteBuffer struct) { return struct.get(struct.position() + PCIE_BUS); }
	public static int pcieDeviceGet(ByteBuffer struct) { return struct.get(struct.position() + PCIE_DEVICE); }
	public static int pcieFunctionGet(ByteBuffer struct) { return struct.get(struct.position() + PCIE_FUNCTION); }

}