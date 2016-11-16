/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * The struct returned by {@link CL10#clGetDeviceInfo GetDeviceInfo} with {@code param_name} set to {@link AMDDeviceTopology#CL_DEVICE_TOPOLOGY_AMD DEVICE_TOPOLOGY_AMD}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>union cl_device_topology_amd {
    struct {
        cl_uint type;
        cl_uint data[5];
    } raw;
    struct {
        cl_uint type;
        char[17];
        cl_char bus;
        cl_char device;
        cl_char function;
    } pcie;
}</code></pre>
 */
public class CLDeviceTopologyAMD extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

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
		ALIGNOF = layout.getAlignment();

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
		super(address, container);
	}

	/**
	 * Creates a {@link CLDeviceTopologyAMD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public CLDeviceTopologyAMD(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
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

	/** Returns a new {@link CLDeviceTopologyAMD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static CLDeviceTopologyAMD malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link CLDeviceTopologyAMD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static CLDeviceTopologyAMD calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link CLDeviceTopologyAMD} instance allocated with {@link BufferUtils}. */
	public static CLDeviceTopologyAMD create() {
		return new CLDeviceTopologyAMD(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link CLDeviceTopologyAMD} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static CLDeviceTopologyAMD create(long address) {
		return address == NULL ? null : new CLDeviceTopologyAMD(address, null);
	}

	/**
	 * Returns a new {@link CLDeviceTopologyAMD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link CLDeviceTopologyAMD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link CLDeviceTopologyAMD.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link CLDeviceTopologyAMD.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link CLDeviceTopologyAMD} instance allocated on the thread-local {@link MemoryStack}. */
	public static CLDeviceTopologyAMD mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link CLDeviceTopologyAMD} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static CLDeviceTopologyAMD callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link CLDeviceTopologyAMD} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static CLDeviceTopologyAMD mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link CLDeviceTopologyAMD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static CLDeviceTopologyAMD callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link CLDeviceTopologyAMD.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link CLDeviceTopologyAMD.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link CLDeviceTopologyAMD.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link CLDeviceTopologyAMD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #raw_type}. */
	public static int nraw_type(long struct) { return memGetInt(struct + CLDeviceTopologyAMD.RAW_TYPE); }
	/** Unsafe version of {@link #raw_data}. */
	public static IntBuffer nraw_data(long struct) {
		return memIntBuffer(struct + CLDeviceTopologyAMD.RAW_DATA, 5);
	}
	/** Unsafe version of {@link #raw_data(int) raw_data}. */
	public static int nraw_data(long struct, int index) {
		if ( CHECKS ) check(index, 5);
		return memGetInt(struct + CLDeviceTopologyAMD.RAW_DATA + index * 4);
	}
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
	public static class Buffer extends StructBuffer<CLDeviceTopologyAMD, Buffer> implements NativeResource {

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
			super(container, container.remaining() / SIZEOF);
		}

		Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			super(address, container, mark, pos, lim, cap);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			return new Buffer(address, container, mark, pos, lim, cap);
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
		public int raw_type() { return CLDeviceTopologyAMD.nraw_type(address()); }
		/** Returns a {@link IntBuffer} view of the {@code raw_data} field. */
		public IntBuffer raw_data() { return CLDeviceTopologyAMD.nraw_data(address()); }
		/** Returns the value at the specified index of the {@code raw_data} field. */
		public int raw_data(int index) { return CLDeviceTopologyAMD.nraw_data(address(), index); }
		/** Returns the value of the {@code pcie_type} field. */
		public int pcie_type() { return CLDeviceTopologyAMD.npcie_type(address()); }
		/** Returns the value of the {@code pcie_bus} field. */
		public byte pcie_bus() { return CLDeviceTopologyAMD.npcie_bus(address()); }
		/** Returns the value of the {@code pcie_device} field. */
		public byte pcie_device() { return CLDeviceTopologyAMD.npcie_device(address()); }
		/** Returns the value of the {@code pcie_function} field. */
		public byte pcie_function() { return CLDeviceTopologyAMD.npcie_function(address()); }

	}

}