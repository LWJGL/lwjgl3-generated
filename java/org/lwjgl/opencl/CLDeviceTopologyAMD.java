/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * The struct returned by {@link CL10#clGetDeviceInfo} with {@code param_name} set to {@link AMDDeviceTopology#CL_DEVICE_TOPOLOGY_AMD}.
 * 
 * <h3>cl_device_topology_amd members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>raw</td><td><table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>type</td><td class="nw">cl_uint</td><td></td></tr>
 * <tr><td>data</td><td class="nw">cl_uint[5]</td><td></td></tr>
 * </table></td><td></td></tr>
 * <tr><td>pcie</td><td><table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>type</td><td class="nw">cl_uint</td><td></td></tr>
 * <tr><td>*</td><td class="nw">char[17]</td><td></td></tr>
 * <tr><td>bus</td><td class="nw">cl_char</td><td></td></tr>
 * <tr><td>device</td><td class="nw">cl_char</td><td></td></tr>
 * <tr><td>function</td><td class="nw">cl_char</td><td></td></tr>
 * </table></td><td></td></tr>
 * </table>
 */
public class CLDeviceTopologyAMD extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

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
		Layout layout = __union(
			__struct(
				__member(4),
				__array(4, 5)
			),
			__struct(
				__member(4),
				__padding(17, true),
				__member(1),
				__member(1),
				__member(1)
			)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		RAW = layout.offsetof(0);
			RAW_TYPE = layout.offsetof(1);
			RAW_DATA = layout.offsetof(2);
		PCIE = layout.offsetof(3);
			PCIE_TYPE = layout.offsetof(4);
			PCIE_BUS = layout.offsetof(6);
			PCIE_DEVICE = layout.offsetof(7);
			PCIE_FUNCTION = layout.offsetof(8);
	}

	CLDeviceTopologyAMD(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link CLDeviceTopologyAMD} instance at the specified memory address. */
	public CLDeviceTopologyAMD(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link CLDeviceTopologyAMD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public CLDeviceTopologyAMD(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code raw_type} field. */
	public int raw_type() { return nraw_type(address()); }
	/** Returns a {@link IntBuffer} view of the {@code raw_data} field. */
	public IntBuffer raw_data() { return nraw_data(address()); }
	/** Returns the value at the specified index of the {@code raw_data} field. */
	public int raw_data(int index) { return nraw_data(address(), index); }
	/** Returns the value of the {@code pcie_type} field. */
	public int pcie_type() { return npcie_type(address()); }
	/** Returns the value of the {@code pcie_bus} field. */
	public byte pcie_bus() { return npcie_bus(address()); }
	/** Returns the value of the {@code pcie_device} field. */
	public byte pcie_device() { return npcie_device(address()); }
	/** Returns the value of the {@code pcie_function} field. */
	public byte pcie_function() { return npcie_function(address()); }

	// -----------------------------------

	/** Returns a new {@link CLDeviceTopologyAMD} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static CLDeviceTopologyAMD malloc() {
		return new CLDeviceTopologyAMD(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link CLDeviceTopologyAMD} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static CLDeviceTopologyAMD calloc() {
		return new CLDeviceTopologyAMD(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link CLDeviceTopologyAMD} instance allocated with {@link BufferUtils}. */
	public static CLDeviceTopologyAMD create() {
		return new CLDeviceTopologyAMD(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link CLDeviceTopologyAMD.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link CLDeviceTopologyAMD.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link CLDeviceTopologyAMD.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link CLDeviceTopologyAMD.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	/** Unsafe version of {@link #raw_type}. */
	public static int nraw_type(long struct) { return memGetInt(struct + CLDeviceTopologyAMD.RAW_TYPE); }
	/** Unsafe version of {@link #raw_data}. */
	public static IntBuffer nraw_data(long struct) {
		return memIntBuffer(struct + CLDeviceTopologyAMD.RAW_DATA, 5);
	}
	/** Unsafe version of {@link #raw_data(int) raw_data}. */
	public static int nraw_data(long struct, int index) { return memGetInt(struct + CLDeviceTopologyAMD.RAW_DATA + index * 4); }
	/** Unsafe version of {@link #pcie_type}. */
	public static int npcie_type(long struct) { return memGetInt(struct + CLDeviceTopologyAMD.PCIE_TYPE); }
	/** Unsafe version of {@link #pcie_bus}. */
	public static byte npcie_bus(long struct) { return memGetByte(struct + CLDeviceTopologyAMD.PCIE_BUS); }
	/** Unsafe version of {@link #pcie_device}. */
	public static byte npcie_device(long struct) { return memGetByte(struct + CLDeviceTopologyAMD.PCIE_DEVICE); }
	/** Unsafe version of {@link #pcie_function}. */
	public static byte npcie_function(long struct) { return memGetByte(struct + CLDeviceTopologyAMD.PCIE_FUNCTION); }

	// -----------------------------------

	/** An array of {@link CLDeviceTopologyAMD} structs. */
	public static final class Buffer extends StructBuffer<CLDeviceTopologyAMD, Buffer> {

		/**
		 * Creates a new {@link CLDeviceTopologyAMD.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link CLDeviceTopologyAMD#SIZEOF}, and its mark will be undefined.
		 *
		 * <p>The created buffer instance holds a strong reference to the container object.</p>
		 */
		public Buffer(ByteBuffer container) {
			this(container.slice(), SIZEOF);
		}

		Buffer(ByteBuffer container, int SIZEOF) {
			super(container, SIZEOF);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(ByteBuffer buffer) {
			return new Buffer(buffer);
		}

		@Override
		protected CLDeviceTopologyAMD newInstance(long address) {
			return new CLDeviceTopologyAMD(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code raw_type} field. */
		public int raw_type() { return nraw_type(address()); }
		/** Returns a {@link IntBuffer} view of the {@code raw_data} field. */
		public IntBuffer raw_data() { return nraw_data(address()); }
		/** Returns the value at the specified index of the {@code raw_data} field. */
		public int raw_data(int index) { return nraw_data(address(), index); }
		/** Returns the value of the {@code pcie_type} field. */
		public int pcie_type() { return npcie_type(address()); }
		/** Returns the value of the {@code pcie_bus} field. */
		public byte pcie_bus() { return npcie_bus(address()); }
		/** Returns the value of the {@code pcie_device} field. */
		public byte pcie_device() { return npcie_device(address()); }
		/** Returns the value of the {@code pcie_function} field. */
		public byte pcie_function() { return npcie_function(address()); }

	}

}