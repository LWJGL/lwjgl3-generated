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

/** Used in {@link AMDBusAddressableMemory#clEnqueueMakeBuffersResidentAMD}. */
public final class CLBusAddressAMD implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		SURFACE_BUS_ADDRESS,
		MARKER_BUS_ADDRESS;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(2);

		SIZEOF = offsets(memAddress(offsets));

		SURFACE_BUS_ADDRESS = offsets.get(0);
		MARKER_BUS_ADDRESS = offsets.get(1);
	}

	private final ByteBuffer struct;

	public CLBusAddressAMD() {
		this(malloc());
	}

	public CLBusAddressAMD(ByteBuffer struct) {
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

	public void setSurfaceBusAddress(long surface_bus_address) { surface_bus_address(struct, surface_bus_address); }
	public void setMarkerBusAddress(long marker_bus_address) { marker_bus_address(struct, marker_bus_address); }

	public long getSurfaceBusAddress() { return surface_bus_address(struct); }
	public long getMarkerBusAddress() { return marker_bus_address(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		long surface_bus_address,
		long marker_bus_address
	) {
		ByteBuffer cl_bus_address_amd = malloc();

		surface_bus_address(cl_bus_address_amd, surface_bus_address);
		marker_bus_address(cl_bus_address_amd, marker_bus_address);

		return cl_bus_address_amd;
	}

	public static void surface_bus_address(ByteBuffer cl_bus_address_amd, long surface_bus_address) { cl_bus_address_amd.putLong(cl_bus_address_amd.position() + SURFACE_BUS_ADDRESS, surface_bus_address); }
	public static void marker_bus_address(ByteBuffer cl_bus_address_amd, long marker_bus_address) { cl_bus_address_amd.putLong(cl_bus_address_amd.position() + MARKER_BUS_ADDRESS, marker_bus_address); }

	public static long surface_bus_address(ByteBuffer cl_bus_address_amd) { return cl_bus_address_amd.getLong(cl_bus_address_amd.position() + SURFACE_BUS_ADDRESS); }
	public static long marker_bus_address(ByteBuffer cl_bus_address_amd) { return cl_bus_address_amd.getLong(cl_bus_address_amd.position() + MARKER_BUS_ADDRESS); }

}